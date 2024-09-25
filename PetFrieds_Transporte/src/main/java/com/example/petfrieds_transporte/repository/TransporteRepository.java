package com.example.petfrieds_transporte.repository;

import com.example.petfrieds_transporte.model.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransporteRepository extends JpaRepository<Transporte, Long> {

    List<Transporte> findByOrigem(String origem);

    List<Transporte> findByDestino(String destino);

    List<Transporte> findByStatus(String status);
}