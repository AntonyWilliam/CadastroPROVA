package com.example.cadastro.repository;
import com.example.cadastro.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    //Todas as requisiçõs do banco feitas pelo service passarão pelo Repository
    Cadastro findByNome(String nome);
    Cadastro findByCurso(String curso);
}
