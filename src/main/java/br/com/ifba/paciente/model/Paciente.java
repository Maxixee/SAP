/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.aluno.model.Aluno;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author andre
 */
@Entity
@Data
@Table(name = "paciente")
@EqualsAndHashCode(callSuper = false)
public class Paciente extends Aluno {
    @OneToOne
    private Agendamento agendamento;
}
