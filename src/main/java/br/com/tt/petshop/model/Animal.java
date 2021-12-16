package br.com.tt.petshop.model;

import br.com.tt.petshop.client.animal.TipoAnimal;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "tb_animal")
public class Animal {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nascimento")
    private LocalDate nascimento;

    @Column(name = "tipo_animal")
    private TipoAnimal tipoAnimal;

    @Column(name = "foto")
    private String foto;

    Animal(){

    }

    public Animal(Long id, String nome, LocalDate nascimento, TipoAnimal tipoAnimal, String foto) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.tipoAnimal = tipoAnimal;
        this.foto = foto;
    }

    public Long getId() {
        return id;
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
