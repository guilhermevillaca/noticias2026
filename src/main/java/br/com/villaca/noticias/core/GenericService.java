package br.com.villaca.noticias.core;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericService<ENTITY, DTO, ID> {

    protected final JpaRepository<ENTITY, ID> repository;
    protected final GenericMapper<ENTITY, DTO> mapper;

    protected GenericService(
            JpaRepository<ENTITY, ID> repository,
            GenericMapper<ENTITY, DTO> mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    public List<DTO> listar(){
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public DTO buscar(ID id){
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElse(null);
    }

    public DTO cadastrar(DTO dto){
        ENTITY entity = mapper.toEntity(dto);
        ENTITY entitySalva = repository.save(entity);
        return mapper.toDTO(entitySalva);
    }

    public abstract DTO atualizar(ID id, DTO dto);
    public void excluir(ID id){
        repository.deleteById(id);
    }

}
