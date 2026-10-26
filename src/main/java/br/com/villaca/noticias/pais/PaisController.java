package br.com.villaca.noticias.pais;

import br.com.villaca.noticias.core.GenericController;
import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.core.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="pais")
public class PaisController extends GenericController<Pais, PaisDTO, Integer> {

    public PaisController(
            GenericService<Pais, PaisDTO, Integer> service,
            GenericMapper<Pais, PaisDTO> mapper) {
        super(service, mapper);
    }

}
