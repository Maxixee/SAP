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
    void savePaciente(Paciente paciente);
    
    public abstract List<Paciente> getAllPaciente();
    
    public Paciente findById(Long id);
    
    List <Paciente> findByNomeLike(String nome);
    
    List <Paciente> findByNome(String nome);
    
    List <Paciente> findByMatricula(String nome);
    
    public abstract Paciente updatePaciente(Paciente paciente);
    
}
