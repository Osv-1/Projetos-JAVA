package br.com.projetozup.springbootapi.model;

import lombok.Data;

import javax.persistence.*;

@Data //métodos gerados
@Entity //automaticamente mapea as identidades
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String email;

    @Column
    private String dataNasc;

}
