/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.solicitacao.model.Solicitacao;
import br.com.ifba.teste.model.Teste;
import java.util.List;


/**
 *
 * @author clebinho
 */
public interface IFacade {
    //=====================SOLICITACAO=====================
    public void saveSolicitacao(Solicitacao solicitacao); 
    public List<Solicitacao> getAllSolicitacao(); 
    public void removeSolicitacao(Long value);
    //=====================TESTE=====================
    public abstract void saveTeste(Teste teste);
    public List<Teste> findAll();
    
    //=====================PACIENTES=====================
    public Paciente savePaciente(Paciente paciente);  
    public Paciente updatePaciente(Paciente paciente);
    public void deletePaciente(Paciente paciente);
    public List<Paciente> getAllPaciente();
    public Paciente findByIdPaciente(Long id);
    public List <Paciente> findByNomeLike(String nome);
    public List <Paciente> findByNome(String nome);
    public List <Paciente> findByMatricula(String matricula);

    
    
    //=====================PRONTUARIO=====================
    public void saveProntuario(Prontuario prontuario);
    public List<Prontuario> getAllProntuarios();
    public List<Prontuario> getAllProntuariosArquivados();
    public void desarquivarProntuario(Prontuario prontuario);
    public Prontuario findProntuarioById(Long id);
    public void arquivarProntuario(Prontuario prontuario);
    public void newProntuario(String desc, Paciente paciente);
    //=====================AGENDAMENTO=====================
    public Agendamento saveSolicitacaoAgendamento(Agendamento agendamento);
    public Agendamento saveDataAgendamento(Agendamento agendamento);
    public List<Agendamento>getAllAgendamento();
    public Agendamento updateAgendamento(Agendamento agendamento);
    public abstract void deleteAgendamento(Agendamento agendamento);
    public Agendamento findAgendamentoById(Long id);
    
    
    //==========================LOGIN================================
    public String findUser(String Credential);
    
        
    //=====================LISTA DE ESPERA=====================
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento);
}
