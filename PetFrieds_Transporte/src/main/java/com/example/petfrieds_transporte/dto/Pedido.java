package com.example.petfrieds_transporte.dto;

import com.example.petfrieds_transporte.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Long pedidoId;
    private Long clienteId;
    private Endereco enderecoDestino;
    private LocalDateTime previsaoEntrega;
}
