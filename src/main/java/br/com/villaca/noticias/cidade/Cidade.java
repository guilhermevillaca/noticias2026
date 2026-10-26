package br.com.villaca.noticias.cidade;

import br.com.villaca.noticias.uf.Uf;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cidade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, unique = true)
    private Integer codigoIbge;
    @ManyToOne
    @JoinColumn(
            referencedColumnName = "id",
            name = "uf_id",
            nullable = false
    )
    private Uf uf;
}
