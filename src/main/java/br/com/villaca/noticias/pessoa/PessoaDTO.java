package br.com.villaca.noticias.pessoa;

import jakarta.persistence.Column;

import java.time.LocalDate;

public record PessoaDTO(
        Integer id,
        String nome,
        String nomeSocial,
        String nomeMae,
        String nomePai,
        LocalDate dataNascimento,
        String sexo,
        String estadoCivil,
        String nacionalidade,
        String naturalidade,
        String raca,
        String cor,
        String cpf,
        String rg,
        String orgaoExpedidorRg,
        String ufRg,
        String cnh,
        String categoriaCnh,
        LocalDate validadeCnh,
        String profissao,
        String organizacao,
        String cargo,
        LocalDate dataAdmissao,
        Boolean ativo,
        LocalDate dataCadastro,
        String observacao
) {
}
