package br.com.villaca.noticias.usuario;

import br.com.villaca.noticias.core.GenericController;
import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.core.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController extends GenericController<Usuario, UsuarioDTO, Integer> {
    public UsuarioController(GenericService<Usuario, UsuarioDTO, Integer> service, GenericMapper<Usuario, UsuarioDTO> mapper) {
        super(service, mapper);
    }
}
