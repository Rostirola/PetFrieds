package com.example.petfrieds_transporte.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Endereco origem;
    @Embedded
    private Endereco destino;
    @Column(nullable = false)
    private LocalDateTime dataTransporte;
    @Column(nullable = false)
    private String status;
}
