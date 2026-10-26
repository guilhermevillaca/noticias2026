package br.com.villaca.noticias.pessoa;

import br.com.villaca.noticias.core.GenericController;
import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.core.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="pessoa")
public class PessoaController extends GenericController<
        Pessoa,
        PessoaDTO,
        Integer> {
    public PessoaController(
            GenericService<Pessoa, PessoaDTO, Integer> service,
            GenericMapper<Pessoa, PessoaDTO> mapper) {
        super(service, mapper);
    }
}
