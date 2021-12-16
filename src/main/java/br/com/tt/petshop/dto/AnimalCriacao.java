package br.com.tt.petshop.dto;

import br.com.tt.petshop.client.animal.TipoAnimal;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

public class AnimalCriacao {

    private final String nome;
    private final LocalDate nascimento;
    private final TipoAnimal tipoAnimal;
    private final String foto;

    @ConstructorProperties({"nome","nascimento","tipoAnimal", "foto"})
    public AnimalCriacao(String nome, LocalDate nascimento, TipoAnimal tipoAnimal, String foto) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipoAnimal = tipoAnimal;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public String getFoto() {
        return foto;
    }
}
