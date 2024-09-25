package com.example.petfrieds_almoxarifado.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@Data
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String descricao;
    @Column(nullable = false)
    private int quantidade;
    @Column(nullable = false)
    private BigDecimal preco;
    @Embedded
    private Categoria categoria;
}
