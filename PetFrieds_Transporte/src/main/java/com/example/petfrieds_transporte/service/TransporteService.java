package com.example.petfrieds_transporte.service;

import com.example.petfrieds_transporte.model.Transporte;
import com.example.petfrieds_transporte.repository.TransporteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransporteService {
    private final TransporteRepository transporteRepository;

    public Optional<Transporte> findById(Long id) {
        return transporteRepository.findById(id);
    }

    public List<Transporte> findAll() {
        return transporteRepository.findAll();
    }

    public void save(Transporte transporte) {
        transporteRepository.save(transporte);
    }

    public Transporte update(Transporte transporte) {
        return transporteRepository.save(transporte);
    }

    public void delete(Long id) {
        transporteRepository.deleteById(id);
    }
}
