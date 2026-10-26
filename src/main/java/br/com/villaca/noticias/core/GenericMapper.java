package br.com.villaca.noticias.core;

public interface GenericMapper<ENTITY, DTO> {

    DTO toDTO(ENTITY entity);

    ENTITY toEntity(DTO dto);

}
