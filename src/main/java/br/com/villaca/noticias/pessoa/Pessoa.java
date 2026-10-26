package br.com.villaca.noticias.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(length = 150)
    private String nomeSocial;

    @Column(length = 150)
    private String nomeMae;

    @Column(length = 150)
    private String nomePai;

    private LocalDate dataNascimento;

    @Column(length = 20)
    private String sexo;

    @Column(length = 30)
    private String estadoCivil;

    private String nacionalidade;

    private String naturalidade;

    private String raca;

    private String cor;

    //docs
    @Column(unique = true, length = 14)
    private String cpf;

    private String rg;

    private String orgaoExpedidorRg;

    private String ufRg;

    private String cnh;

    private String categoriaCnh;

    private LocalDate validadeCnh;

    //dados profissionais

    private String profissao;

    private String organizacao;

    private String cargo;

    private LocalDate dataAdmissao;

    //dados sistema
    @Column(nullable = false)
    private Boolean ativo = true;

    private LocalDate dataCadastro;

    @Column(length = 500)
    private String observacao;

}
