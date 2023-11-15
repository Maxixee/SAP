package br.com.ifba.listadeespera.service;


import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.agendamento.model.Agendamento;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author riaan
 */
public interface IServiceListaDeEspera {
   

    // Método para salvar um Agendamento na lista de espera
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento);    
}
