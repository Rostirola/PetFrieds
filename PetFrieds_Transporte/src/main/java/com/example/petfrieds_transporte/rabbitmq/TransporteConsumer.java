package com.example.petfrieds_transporte.rabbitmq;

import com.example.petfrieds_transporte.dto.Pedido;
import com.example.petfrieds_transporte.model.Endereco;
import com.example.petfrieds_transporte.model.Transporte;
import com.example.petfrieds_transporte.service.TransporteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class TransporteConsumer {
    private final TransporteService transportService;

    @RabbitListener(queues = {"Transporte-queue"})
    public void receive(@Payload Pedido pedido) {
        Endereco endereco = new Endereco("Rua Francisco de Alvarenga", "São Paulo", "SP", "04417-260");
        Transporte transporte = new Transporte(0L, endereco, pedido.getEnderecoDestino(), pedido.getPrevisaoEntrega(), "Em transporte");
        transportService.save(transporte);
    }
}
