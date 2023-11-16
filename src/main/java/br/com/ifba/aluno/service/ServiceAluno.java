/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.dao.IDaoAluno;
import br.com.ifba.aluno.model.Aluno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class ServiceAluno implements IServiceAluno {
    @Autowired
    private IDaoAluno daoAluno;
    
    @Override
    public List<Aluno> getAllAluno() {
        return daoAluno.findAll();
    } 
    
    @Override
    public Aluno saveAluno(Aluno aluno) {
        return daoAluno.save(aluno);
    }
}
