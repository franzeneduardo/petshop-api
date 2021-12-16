package br.com.tt.petshop.controller;

import br.com.tt.petshop.dto.AnimalCriacao;
import br.com.tt.petshop.service.AnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@Slf4j
@RestController
@RequestMapping("/animais")
@CrossOrigin(origins = "*")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping
    public ResponseEntity criarAnimal(@RequestBody @Valid AnimalCriacao animal){

        log.info("Animal criado: {}", animal);
        Long idCriado = animalService.criar(animal);

        URI location = URI.create("/animais/" +idCriado);
        return ResponseEntity.created(location).build();


    }
}
