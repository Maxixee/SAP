/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agendamento.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author davia
 */
@Entity
@Table(name="agendamento")
@Data
public class Agendamento extends PersistenceEntity{
    private Calendar dataAgendamento;
    //private Calendar horaAgendamento;

}
