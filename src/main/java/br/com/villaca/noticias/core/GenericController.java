package br.com.villaca.noticias.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericController<ENTITY, DTO, ID> {

    protected final GenericService<ENTITY, DTO, ID> service;

    protected final GenericMapper<ENTITY, DTO> mapper;

    public GenericController(
            GenericService<ENTITY, DTO, ID> service,
            GenericMapper<ENTITY, DTO> mapper){
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DTO>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<DTO> buscarPorId(@PathVariable ID id){
        DTO dto = service.buscar(id);
        if(dto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/novo")
    public ResponseEntity<DTO> cadastrar(@RequestBody DTO dto){
        DTO dtoSalvo = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoSalvo);
    }

    @PostMapping("/atualizar/{id}")
    public ResponseEntity<DTO> atualizar(
            @RequestBody DTO dto,
            @PathVariable ID id
    ){
        DTO dtoAtualizado = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dtoAtualizado);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluir(@PathVariable ID id) {
        //checar se existe
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
