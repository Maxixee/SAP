/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.model.Aluno;
import java.util.List;

/**
 *
 * @author msmmendes
 */
public interface IServiceAluno {
    
    public List<Aluno> getAllAluno();
    
    // seleciona todos os alunos que nao foram cadastrados como pacientes
    public List<Aluno> getAllAlunoNaoPaciente(); 
    
    public Aluno saveAluno(Aluno aluno);
    
    public Aluno updateAluno(Aluno aluno);
    
    public void deleteAluno(Aluno aluno);
    
    public Aluno findById(Long id);
    
    public List <Aluno> findByNomeLike(String nome);
    
    public List <Aluno> findByNome(String nome);
    
    public List <Aluno> findByMatricula(String nome);
    
    
}
