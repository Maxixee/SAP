/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.solicitacao.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
@Table(name="solicitacao")
@Data
public class Solicitacao extends PersistenceEntity {
    @Transient
    private Paciente paciente = new Paciente();
    
    private String nome;
    private String matricula;
    
    public Solicitacao() {
    }
}
