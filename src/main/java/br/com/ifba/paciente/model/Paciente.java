/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.pessoa.model.Pessoa;
import br.com.ifba.solicitacao.model.Solicitacao;
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
public class Paciente extends Aluno implements Serializable{
    @OneToOne
    private Agendamento agendamento;
    
    public Solicitacao solicitarAgendamento(String nome, String matricula) {
        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setPaciente(this); // Define o paciente que está solicitando o agendamento
        solicitacao.setNomePaciente(nome);
        solicitacao.setMatriculaPaciente(matricula);
        
        // Outras configurações da solicitação, se necessário
        
        return solicitacao;
    }
}
