package br.com.tt.petshop.client.animal;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FotoAnimal {

    private TipoAnimal tipoAnimal;
    private String foto;

    public FotoAnimal(TipoAnimal tipoAnimal, String foto){
        this.tipoAnimal = tipoAnimal;
        this.foto = foto;
    }



}
