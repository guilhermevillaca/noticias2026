package br.com.villaca.noticias.usuario;

public record UsuarioDTO(
        Integer id,
        String senha,
        Integer pessoa_id
) {
}
