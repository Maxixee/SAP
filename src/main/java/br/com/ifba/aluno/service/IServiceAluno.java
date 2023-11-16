/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.model.Aluno;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IServiceAluno {
    public List<Aluno> getAllAluno();
    public Aluno saveAluno(Aluno aluno);
}
