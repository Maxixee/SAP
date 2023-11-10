/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.service;

import br.com.ifba.prontuario.dao.IDaoProntuario;
import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hiego
 */
@Service
public class ServiceProntuario implements IServiceProntuario{
    @Autowired
    private IDaoProntuario dao;
    
    // salva o prontuario no banco de dados
    @Override
    public void saveProntuario(Prontuario prontuario) {
       prontuario.setAtivo(true); //seta todo prontuario como ativo por default
       dao.save(prontuario);
    }
    
    //prontuario ativo
    @Override
    public List<Prontuario> getAllProntuarios() {
        return this.dao.findAllByAtivoIsTrue();
    }

    //prontuario não ativo
    @Override
    public List<Prontuario> getAllArquivados() {
        return this.dao.findAllByAtivoIsFalse();
    }

    //pega o ID
    @Override
    public Prontuario findById(Long id) {
        return this.dao.findById(id);
    }

    //desarquiva o prontuario
    @Override
    public void desarquivarProntuario(Prontuario prontuario) {
        prontuario.setAtivo(true);
        this.dao.save(prontuario);
    }

    //arquiva o prontuario
    @Override
    public void arquivarProntuario(Prontuario prontuario) {
       prontuario.setAtivo(false);
       this.dao.save(prontuario);

    }
}
