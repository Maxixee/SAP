/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.listadeespera.service;

import br.com.ifba.listadeespera.dao.IDaoListaDeEspera;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.agendamento.model.Agendamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author riaan
 */
@Service
public class ServiceListaDeEspera implements IServiceListaDeEspera {

    @Autowired
    private IDaoListaDeEspera daoListaDeEspera;
    
    @Override
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento) {
        // metodo save sem retorno
         ListaDeEspera.add(agendamento);
        return null;
      
              
    }
}
