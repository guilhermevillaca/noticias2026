package br.com.villaca.noticias.login;

import br.com.villaca.noticias.core.Criptografia;
import br.com.villaca.noticias.usuario.Usuario;
import br.com.villaca.noticias.usuario.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UsuarioRepository repository;

    public LoginService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public boolean autenticar(LoginDTO dto) {

        Usuario usuario = repository
                .findByLogin(dto.login())
                .orElse(null);

        if (usuario == null) {
            return false;
        }

        String senhaHash =
                Criptografia.criptografar(dto.senha());

        return senhaHash.equals(usuario.getSenha());
    }
}