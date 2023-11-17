/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.aluno.dao;

import br.com.ifba.aluno.model.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author msmmendes
 */
@Repository
public interface IDaoAluno extends JpaRepository<Aluno, Long>{
    @Query("SELECT p FROM Paciente p WHERE p.nome LIKE %:nome%")
    public List<Aluno> findByNomeLike(String nome);

    public List<Aluno> findByNome(String nome);

    public List <Aluno> findByMatricula(String matricula);
    
    // seleciona apenas os alunos que nao foram cadastrados como pacientes
    @Query("SELECT a FROM Aluno a WHERE TYPE(a) = Aluno AND a.paciente_id IS NULL")
    public List <Aluno> findAllAluno();
    
    public boolean existsByMatricula(String matricula);
    
    public boolean existsByCpf(String cpf);
}
