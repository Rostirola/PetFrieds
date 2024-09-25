package com.example.petfrieds_transporte.model;

import lombok.Getter;

import java.util.Objects;

@Getter
public record Endereco(String rua, String cidade, String estado, String cep) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco endereco)) return false;
        return Objects.equals(rua, endereco.rua) &&
                Objects.equals(cidade, endereco.cidade) &&
                Objects.equals(estado, endereco.estado) &&
                Objects.equals(cep, endereco.cep);
    }
}
