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
    
    public List <Paciente> findByNomeLike(String nome);
    
    public List <Paciente> findByNome(String nome);
    
    public List <Paciente> findByMatricula(String nome);
    
    
    
}
