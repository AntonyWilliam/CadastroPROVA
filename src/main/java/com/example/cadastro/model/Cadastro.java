package com.example.cadastro.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CADASTRO")
public class Cadastro {

    //Dados de criação dos atributos para o banco
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private Integer cpf;
    private Integer rg;
    private String endereco;
    private String curso;
}
