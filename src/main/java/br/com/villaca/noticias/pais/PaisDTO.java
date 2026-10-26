package br.com.villaca.noticias.pais;

public record PaisDTO(
        Integer id,
        String nome,
        String codigoIso,
        String codigoIso2,
        String codigoBacen
) {
}
