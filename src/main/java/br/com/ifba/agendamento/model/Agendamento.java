/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agendamento.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author davia
 */
@Entity
@Table(name="agendamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento extends PersistenceEntity implements Serializable{ 
    
    @Enumerated(EnumType.STRING) // Indica que será salvo como String
    @Column(name = "status_agendamento")
    private EnumAgendamentoStatus statusAgendamento; // armazena o status do agendamento como um Enum
    
    @Column(name = "data_agendamento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAgendamento;
    
    @Column(name = "hora_agendamento")
    private LocalTime horaAgendamento;
    
    @OneToOne(mappedBy = "agendamento")
    Paciente paciente;
    
    private String NomePaciente;
    private String MatriculaPaciente;
    
    // Método estático para criar um novo agendamento com um status específico
    public static Agendamento criarAgendamento(EnumAgendamentoStatus status) {
        Agendamento agendamento = new Agendamento();
        agendamento.setStatusAgendamento(status);
        return agendamento;
    }
    
}
