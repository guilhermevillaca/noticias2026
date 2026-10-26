package br.com.villaca.noticias.endereco;

import br.com.villaca.noticias.cidade.Cidade;
import br.com.villaca.noticias.pessoa.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    @ManyToOne
    @JoinColumn(
            referencedColumnName = "id",
            name="cidade_id",
            nullable = false
    )
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(
            referencedColumnName = "id",
            name = "pessoa_id",
            nullable = false
    )
    private Pessoa pessoa;

}
