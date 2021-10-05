package com.example.cadastro.controller;

import com.example.cadastro.model.Cadastro;
import com.example.cadastro.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroController {

    //Onde e como serão feitas as requisições da aplicação
    @Autowired
    private CadastroService service;
    //Buscar Cadastros
    @GetMapping("/buscarCadastro")
    public List<Cadastro> getAlunos() {
        return this.service.pesquisaCadastro();
    }
    //teste
    //Buscar Cadasros parametro = nome
    @GetMapping("/getAlunoNome")
    public Cadastro getAlunoNome(@RequestParam("nome") String nome) {
        return this.service.getByNome(nome);
    }

    //Buscar Cadastro parametro = nome
    @GetMapping("/curso")
    public Cadastro getCurso(@RequestParam("curso") String curso) {
        return this.service.getByCurso(curso);
    }

    //Criar cadastro
    @PostMapping("/cadastrarAluno")
    public void cadastroAluno(@RequestBody Cadastro cadastro) {
        this.service.cadastroAluno(cadastro);
    }

    //Alterar dados de cadastro
    @PutMapping("/alterarAluno")
    public Cadastro alterarCadasro(@RequestBody Cadastro cadastro) {
        return this.service.alterarCadastro(cadastro);
    }

    //Remover cadastro
    @DeleteMapping("/{matricula}")
    public void removerCadastro(@PathVariable("matricula") Integer id) {
        this.service.excluirCadastro(id);
    }
}
