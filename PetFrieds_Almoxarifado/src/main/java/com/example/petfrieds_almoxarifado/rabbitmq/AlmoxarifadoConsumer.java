package com.example.petfrieds_almoxarifado.rabbitmq;

import com.example.petfrieds_almoxarifado.dto.Itens;
import com.example.petfrieds_almoxarifado.dto.Pedido;
import com.example.petfrieds_almoxarifado.model.Produto;
import com.example.petfrieds_almoxarifado.service.ProdutoService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Component
public class AlmoxarifadoConsumer {
    private final ProdutoService produtoService;

    @RabbitListener(queues = {"almoxarifado-queue"})
    public void receive(Pedido pedido) {
        for (Itens item : pedido.getProduto()) {
            Optional<Produto> produtoOpt = produtoService.findById(item.getId());

            if (produtoOpt.isPresent()) {
                Produto produto = produtoOpt.get();
                int novaQuantidade = produto.getQuantidade() - item.getQuantidade();

                if (novaQuantidade < 0) {
                    throw new IllegalStateException("Quantidade insuficiente no estoque para o produto: " + produto.getNome());
                }

                produto.setQuantidade(novaQuantidade);
                produtoService.save(produto);
            } else {
                throw new EntityNotFoundException("Produto não encontrado para o ID: " + item.getId());
            }
        }
    }
}
