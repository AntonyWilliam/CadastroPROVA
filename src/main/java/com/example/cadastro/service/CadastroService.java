package com.example.cadastro.service;

import com.example.cadastro.model.Cadastro;
import com.example.cadastro.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

    //REGRAS DE NEGOCIO

    @Autowired
    private CadastroRepository repository;

    public List<Cadastro> pesquisaCadastro() {
        return this.repository.findAll();
    }

    public Cadastro getByNome(String nome) {
        return this.repository.findByNome(nome);
    }

    public Cadastro getByCurso(String curso) {
        return this.repository.findByCurso(curso);
    }

    public void cadastroAluno(Cadastro cadastro) {
        this.repository.save(cadastro);
    }

    public Cadastro alterarCadastro(Cadastro cadastro) {
        return this.repository.save(cadastro);
    }

    public void excluirCadastro(Integer matricula) {
        this.repository.deleteById(matricula);
    }
}
