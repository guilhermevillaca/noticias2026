package br.com.villaca.noticias.usuario;

import br.com.villaca.noticias.core.Criptografia;
import br.com.villaca.noticias.core.GenericMapper;
import br.com.villaca.noticias.core.GenericService;
import br.com.villaca.noticias.pessoa.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends GenericService<Usuario, UsuarioDTO, Integer> {

    @Autowired
    private PessoaRepository pessoaRepository;

    protected UsuarioService(JpaRepository<Usuario, Integer> repository, GenericMapper<Usuario, UsuarioDTO> mapper) {
        super(repository, mapper);
    }

    public UsuarioDTO cadastrar(UsuarioDTO dto){
        Usuario entity = mapper.toEntity(dto);
        entity.setSenha(Criptografia.criptografar(dto.senha()));
        Usuario entitySalva = repository.save(entity);
        return mapper.toDTO(entitySalva);
    }

    @Override
    public UsuarioDTO atualizar(Integer integer, UsuarioDTO usuarioDTO) {
        Usuario usuario = repository.getReferenceById(usuarioDTO.id());
        usuario.setPessoa(pessoaRepository.getReferenceById(usuarioDTO.pessoa_id()));
        if(usuarioDTO.senha() != null && usuarioDTO.senha().isBlank()){
            usuario.setSenha(Criptografia.criptografar(usuarioDTO.senha()));
        }
        Usuario atualizado = repository.save(usuario);
        return mapper.toDTO(atualizado);
    }
}
