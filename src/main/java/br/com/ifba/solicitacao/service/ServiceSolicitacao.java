/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.solicitacao.service;

import br.com.ifba.infrastructure.exception.BusinessException;
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
   //================= CONSTANTES =============================================
    
   // Mensagem de erro se a Solicitacao for null.
    public final static String SOLICITACAO_NULL = "Dados de Solicitacao nao preenchidos";
    
    // Mensagem de erro se a Solicitacao ja existir no banco.
    public final static String SOLICITACAO_EXISTE = "Solicitacao ja existente no Banco de dados";
   
    // Mensagem de erro se a Solicitacao não existir no banco.
    public final static String SOLICITACAO_NAO_EXISTE = "Solicitacao nao existente no Banco de dados";
    
    @Autowired
    private IDaoSolicitacao daoSolicitacao;
    
    @Override
    public void saveSolicitacao(Solicitacao solicitacao) {
        if(solicitacao == null)
            throw new BusinessException(SOLICITACAO_NULL);
        if(daoSolicitacao.existsById(solicitacao.getId())) 
            throw new BusinessException(SOLICITACAO_EXISTE);

        daoSolicitacao.save(solicitacao);
    }
    
    @Override
    public List<Solicitacao> getAllSolicitacao() {
        return daoSolicitacao.findAll();
    }
    
    @Override
    public void removeSolicitacao(Long value){
        if(!daoSolicitacao.existsById(value)) 
            throw new BusinessException(SOLICITACAO_NAO_EXISTE);

        daoSolicitacao.deleteById(value);
    }
}
