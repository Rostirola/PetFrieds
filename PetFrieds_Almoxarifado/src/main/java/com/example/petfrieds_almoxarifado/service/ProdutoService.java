package com.example.petfrieds_almoxarifado.service;

import com.example.petfrieds_almoxarifado.model.Produto;
import com.example.petfrieds_almoxarifado.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public void save(Produto produto) {
        produtoRepository.save(produto);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    public void update(Long id, Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }
}
