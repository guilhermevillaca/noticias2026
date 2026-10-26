package br.com.villaca.noticias.usuario;

import br.com.villaca.noticias.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "usuario")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String senha;

    @JoinColumn(referencedColumnName = "id", name="pessoa_id", nullable = false)
    @OneToOne
    private Pessoa pessoa;
}
