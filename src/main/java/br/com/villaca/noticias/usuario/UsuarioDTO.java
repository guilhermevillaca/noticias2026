package br.com.villaca.noticias.usuario;

public record UsuarioDTO(
        Integer id,
        String login,
        String senha,
        Integer pessoa_id
) {
}
