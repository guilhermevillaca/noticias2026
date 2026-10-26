package br.com.villaca.noticias.pais;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pais")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 100, unique = true)
    private String nome;
    @Column(nullable = false, length = 3, unique = true)
    private String codigoIso;
    @Column(length = 2, unique = true)
    private String codigoIso2;
    @Column(length = 5, unique = true)
    private String codigoBacen;
}
