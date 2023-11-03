/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.agendamento.service.IServiceAgendamento;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.paciente.service.IServicePaciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.prontuario.service.IServiceProntuario;
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
    //=====================PACIENTE=====================
    @Override
    public void savePaciente(Paciente paciente) {
        servicePaciente.savePaciente(paciente);
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
    public Paciente updatePaciente(Paciente paciente){
        return servicePaciente.updatePaciente(paciente);
    }
    
    //=====================AGENDAMENTO=====================
    @Override
    public void saveDataAgendamento(Agendamento agendamento){
        serviceAgendamento.saveDataAgendamento(agendamento);
    }

    @Override
    public List<Agendamento> getAllAgendamento() {
         return serviceAgendamento.getAllAgendamento();
    }
    
    @Override
    public void updateAgendamento(Agendamento agendamento) {
        this.serviceAgendamento.updateAgendamento(agendamento);
        }

    @Override
    public void deleteAgendamento(Agendamento agendamento) {
        this.serviceAgendamento.deleteAgendamento(agendamento);
        }
    
    @Override
    public Agendamento findAgendamentoById(Long id) {
        return serviceAgendamento.findById(id);
    }
   

}
