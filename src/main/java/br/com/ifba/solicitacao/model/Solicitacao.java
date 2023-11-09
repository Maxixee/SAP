/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.solicitacao.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author andre
 */
@Entity
@Table(name="solicitacao")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Solicitacao extends PersistenceEntity implements Serializable {
    @Transient
    @JoinColumn
    @OneToOne 
    Paciente paciente;
    
    private String NomePaciente;
    private String MatriculaPaciente;
    private String dataHorario;
}
