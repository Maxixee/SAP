/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.agendamento.service;

import br.com.ifba.agendamento.model.Agendamento;
import java.util.List;

/**
 *
 * @author davia
 */
public interface IServiceAgendamento {
    
    public Agendamento saveSolicitacaoAgendamento(Agendamento agendamento);
    public Agendamento saveDataAgendamento(Agendamento agendamento);
    public abstract List<Agendamento>getAllAgendamento();
    public abstract List<Agendamento>getAllAgendamentoDisponivel();
    public abstract List<Agendamento>getAllAgendamentoSolicitado();
    public abstract boolean deleteAgendamento(Agendamento agendamento);
    public Agendamento updateAgendamento(Agendamento agendamento);
    public Agendamento findById(Long id);
}
