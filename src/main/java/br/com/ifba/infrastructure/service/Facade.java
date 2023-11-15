/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.agendamento.service.IServiceAgendamento;
import br.com.ifba.login.service.IServiceLogin;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.paciente.service.IServicePaciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.prontuario.service.IServiceProntuario;
import br.com.ifba.solicitacao.model.Solicitacao;
import br.com.ifba.solicitacao.service.IServiceSolicitacao;
import br.com.ifba.teste.model.Teste;
import br.com.ifba.teste.service.IServiceTeste;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author clebinho
 */
@Controller
public class Facade implements IFacade {
    @Autowired
    private IServiceTeste serviceTeste;
    @Autowired
    private IServicePaciente servicePaciente;
    @Autowired
    private IServiceProntuario serviceProntuario;  
    @Autowired
    private IServiceAgendamento serviceAgendamento;
    @Autowired
    private IServiceSolicitacao serviceSolicitacao;
    @Autowired
    private IServiceLogin serviceLogin;
    //=====================SOLICITACAO=====================
    @Override
    public void saveSolicitacao(Solicitacao solicitacao) {
        serviceSolicitacao.saveSolicitacao(solicitacao);
    }
    
    @Override
    public List<Solicitacao> getAllSolicitacao() {
        return serviceSolicitacao.getAllSolicitacao();
    }
    
    @Override
    public void removeSolicitacao(Long value){
        serviceSolicitacao.removeSolicitacao(value);
    }
    
    
    
    //=====================TESTE=====================
    @Override
    public void saveTeste(Teste teste) {
        serviceTeste.saveTeste(teste);
    }

    @Override
    public List<Teste> findAll() {
        return serviceTeste.findAll();
    }

    //=====================PRONTUARIO=====================
    @Override
    public void saveProntuario(Prontuario prontuario) {
        serviceProntuario.saveProntuario(prontuario);
    }

    @Override
    public List<Prontuario> getAllProntuarios() {
        return serviceProntuario.getAllProntuarios();
    }

    @Override
    public List<Prontuario> getAllProntuariosArquivados() {
        return serviceProntuario.getAllArquivados();
    }
    @Override
    public void desarquivarProntuario(Prontuario prontuario) {
        serviceProntuario.desarquivarProntuario(prontuario);
    }
    @Override
    public void arquivarProntuario(Prontuario prontuario){
        serviceProntuario.arquivarProntuario(prontuario);
    }
     @Override
    public Prontuario findProntuarioById(Long id) {
        return serviceProntuario.findById(id);
    }
    @Override
    public void newProntuario(String desc, Paciente paciente){
        serviceProntuario.novoProntuario(desc, paciente);
    }
    
    //=====================PACIENTE=====================
    @Override
    public Paciente savePaciente(Paciente paciente) {
        return servicePaciente.savePaciente(paciente);
    }
    
    @Override
    public Paciente updatePaciente(Paciente paciente){
        return servicePaciente.updatePaciente(paciente);
    }
    
    @Override
    public void deletePaciente(Paciente paciente){
        servicePaciente.deletePaciente(paciente);
    }
    
    @Override
    public List<Paciente> getAllPaciente() {
        return servicePaciente.getAllPaciente();
    }
    
    @Override
    public Paciente findByIdPaciente(Long id){
        return servicePaciente.findById(id);
    }
    
    @Override
    public List<Paciente> findByNomeLike(String nome) {
       return  servicePaciente.findByNomeLike(nome);
    }
    
    @Override
    public List<Paciente> findByNome(String nome) {
       return  servicePaciente.findByNome(nome);
    }
    
    @Override
    public List<Paciente> findByMatricula(String matricula) {
       return  servicePaciente.findByMatricula(matricula);
    }
    
    //=====================AGENDAMENTO=====================
    
    @Override
    public Agendamento saveSolicitacaoAgendamento(Agendamento agendamento){
        return serviceAgendamento.saveDataAgendamento(agendamento);
    }
    
    @Override
    public Agendamento saveDataAgendamento(Agendamento agendamento){
        return serviceAgendamento.saveDataAgendamento(agendamento);
    }

    @Override
    public List<Agendamento> getAllAgendamento() {
         return serviceAgendamento.getAllAgendamento();
    }
    
    @Override
    public Agendamento updateAgendamento(Agendamento agendamento) {
        return this.serviceAgendamento.updateAgendamento(agendamento);
        }

    @Override
    public void deleteAgendamento(Agendamento agendamento) {
        this.serviceAgendamento.deleteAgendamento(agendamento);
        }
    
    @Override
    public Agendamento findAgendamentoById(Long id) {
        return serviceAgendamento.findById(id);
    }   
   
//=====================LOGIN============================
    public String findUser(String Credential){
        return serviceLogin.findUser(Credential);
    }
}
