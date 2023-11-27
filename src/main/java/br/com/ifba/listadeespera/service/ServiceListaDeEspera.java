/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.listadeespera.service;

import br.com.ifba.listadeespera.dao.IDaoListaDeEspera;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.infrastructure.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author riaan
 */

@Service
public class ServiceListaDeEspera implements IServiceListaDeEspera {
    
         //================= CONSTANTES =============================================
    
     // Mensagem de erro caso a fila de espera esteja vazia.

    // Mensagem de erro caso o nome seja null.
    private final static String FILA_ESPERA__NULL = "FILA_ESPERA__NULL";
    

    @Autowired
    private IDaoListaDeEspera daoListaDeEspera;
    
    @Override
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento) {
        // metodo save sem retorno
        if(daoListaDeEspera == null) {
            throw new BusinessException(FILA_ESPERA__NULL);
        }else{
                  this.daoListaDeEspera.save(agendamento); 
               } 
        return null;       
    }
    
    @Override
    public ListaDeEspera  getAllListaDeEspera() {
        return (ListaDeEspera) this.daoListaDeEspera.findAll();
    }
        
    @Override
    public ListaDeEspera updateListaDeEspera(Agendamento agendamento) {
        if(daoListaDeEspera == null) {
            throw new BusinessException(FILA_ESPERA__NULL);
        } else {
           daoListaDeEspera.save(agendamento);
        }
        return (ListaDeEspera) daoListaDeEspera;
    }
    
    @Override
    public ListaDeEspera deleteListaDeEspera(Agendamento agendamento){
        if(daoListaDeEspera == null) {
            throw new BusinessException(FILA_ESPERA__NULL);
        } else{
             daoListaDeEspera.delete(agendamento);
        }
        
        return (ListaDeEspera) daoListaDeEspera;
    }   
}

