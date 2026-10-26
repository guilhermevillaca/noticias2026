package br.com.villaca.noticias.pais;

import br.com.villaca.noticias.core.GenericMapper;
import org.springframework.stereotype.Component;

@Component
public class PaisMapper implements GenericMapper<Pais, PaisDTO> {

    @Override
    public PaisDTO toDTO(Pais pais) {
        return new PaisDTO(
                pais.getId(),
                pais.getNome(),
                pais.getCodigoIso(),
                pais.getCodigoIso2(),
                pais.getCodigoBacen()
        );
    }

    @Override
    public Pais toEntity(PaisDTO dto) {
        return new Pais(
                dto.id(),
                dto.nome(),
                dto.codigoIso(),
                dto.codigoIso2(),
                dto.codigoBacen()
        );
    }
}
