package br.com.tt.petshop.factory;

import br.com.tt.petshop.dto.AnimalCriacao;
import br.com.tt.petshop.model.Animal;

public class AnimalFactory {

    public static Animal criarAnimal(AnimalCriacao animalCriacao){
        return new Animal(null, animalCriacao.getNome(),animalCriacao.getNascimento(),animalCriacao.getTipoAnimal(),animalCriacao.getFoto());
    }
}
