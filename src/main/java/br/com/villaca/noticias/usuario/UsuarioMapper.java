package br.com.villaca.noticias.usuario;

import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.pessoa.Pessoa;
import br.com.villaca.noticias.pessoa.PessoaRepository;
import br.com.villaca.noticias.pessoa.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper implements GenericMapper<Usuario, UsuarioDTO> {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getId(),
                null,
                usuario.getPessoa().getId());
    }

    @Override
    public Usuario toEntity(UsuarioDTO usuarioDTO) {
        Pessoa pessoa = pessoaRepository.getReferenceById(usuarioDTO.pessoa_id());
        return new Usuario(
                usuarioDTO.id(),
                usuarioDTO.senha(),
                pessoa
        );
    }
}
