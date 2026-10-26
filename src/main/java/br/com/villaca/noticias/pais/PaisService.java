package br.com.villaca.noticias.pais;

import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.core.GenericService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PaisService extends GenericService<Pais, PaisDTO, Integer> {

    public PaisService(PaisRepository repository, PaisMapper mapper){
        super(repository, mapper);
    }

    @Override
    public PaisDTO atualizar(Integer id, PaisDTO paisDTO) {
        Pais pais = repository.findById(id).orElse(null);
        if(pais == null){
            return null;
        }
        pais.setNome(paisDTO.nome());
        pais.setCodigoIso(paisDTO.codigoIso());
        pais.setCodigoIso2(paisDTO.codigoIso2());
        pais.setCodigoBacen(paisDTO.codigoBacen());
        Pais paisAtualizado = repository.save(pais);
        return mapper.toDTO(paisAtualizado);
    }
}
