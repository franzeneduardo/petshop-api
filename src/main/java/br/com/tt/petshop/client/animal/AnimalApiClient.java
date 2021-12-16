package br.com.tt.petshop.client.animal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "animal-dog-api",url = "https://random.dog/woof.json")
public interface AnimalApiClient {

    @GetMapping("/animal/{foto}")
    FotoAnimal obterFotoAnimal(@PathVariable("foto") String foto);

}
