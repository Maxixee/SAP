/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.paciente.service;

import br.com.ifba.paciente.model.Paciente;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IServicePaciente {
    
    public Paciente savePaciente(Paciente paciente);
    
    public Paciente updatePaciente(Paciente paciente);
    
    public void deletePaciente(Paciente paciente);
    
    public List<Paciente> getAllPaciente();
    
    public Paciente findById(Long id);
    
    public List <Paciente> findByNomePacienteLike(String nome);
    
    public List <Paciente> findByNomePaciente(String nome);
    
    public List <Paciente> findByMatriculaPaciente(String nome);
    
    public List<Paciente> findByChaveAcesso(String chaveAcesso);
}
