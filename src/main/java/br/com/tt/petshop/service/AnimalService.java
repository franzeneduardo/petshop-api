package br.com.tt.petshop.service;

import br.com.tt.petshop.client.animal.AnimalApiClient;
import br.com.tt.petshop.client.animal.FotoAnimal;
import br.com.tt.petshop.dto.AnimalCriacao;
import br.com.tt.petshop.factory.AnimalFactory;
import br.com.tt.petshop.model.Animal;
import br.com.tt.petshop.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;
    private final AnimalApiClient animalApiClient;

    public Long criar(AnimalCriacao animalCriacao){

        FotoAnimal tipoAnimal = animalApiClient.obterFotoAnimal(animalCriacao.getFoto());

        log.info("TipoAnimal: {}",tipoAnimal);

        Animal animal = AnimalFactory.criarAnimal(animalCriacao);
        Animal animalSalvo = animalRepository.save(animal);

        return animalSalvo.getId();

    }

}
