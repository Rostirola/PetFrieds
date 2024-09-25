package com.example.petfrieds_almoxarifado.model;

import lombok.Getter;

import java.io.Serializable;
import java.util.Objects;

@Getter
public record Categoria(String nome, String descricao) implements Serializable {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria categoria)) return false;
        return Objects.equals(nome, categoria.nome) &&
                Objects.equals(descricao, categoria.descricao);
    }
}
