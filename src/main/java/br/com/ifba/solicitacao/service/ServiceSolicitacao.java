/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.solicitacao.service;

import br.com.ifba.solicitacao.dao.IDaoSolicitacao;
import br.com.ifba.solicitacao.model.Solicitacao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class ServiceSolicitacao implements IServiceSolicitacao {
    @Autowired
    private IDaoSolicitacao daoSolicitacao;
    
    @Override
    public void saveSolicitacao(Solicitacao solicitacao) {
        daoSolicitacao.save(solicitacao);
    }
    
    @Override
    public List<Solicitacao> getAllSolicitacao() {
        return daoSolicitacao.findAll();
    }
    
    @Override
    public void removeSolicitacao(Long value){
        daoSolicitacao.deleteById(value);
    }
}
