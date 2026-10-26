package br.com.villaca.noticias.uf;

import br.com.villaca.noticias.pais.Pais;
import jakarta.persistence.*;

@Entity
@Table(name="uf")
public class Uf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 100)
    private String nome;//PARANÁ
    @Column(nullable = false, length = 2, unique = true)
    private String sigla;//PR
    @Column(nullable = false)
    private Integer codigoIbge;
    @ManyToOne
    @JoinColumn(
            referencedColumnName = "id",
            name = "pais_id",
            nullable = false)
    private Pais pais;

}
