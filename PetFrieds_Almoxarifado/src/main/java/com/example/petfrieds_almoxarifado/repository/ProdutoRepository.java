package com.example.petfrieds_almoxarifado.repository;

import com.example.petfrieds_almoxarifado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}