package com.example.petfrieds_almoxarifado.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class Pedido {

    private Long id;
    private List<Itens> produto;
    private LocalDateTime dataTransporte;
}
