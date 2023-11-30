/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.pessoa.model.Pessoa;
import br.com.ifba.solicitacao.model.Solicitacao;
import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author andre
 */
@Entity
@Data
@Table(name = "paciente")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Paciente extends Aluno implements Serializable{
    
    @OneToOne
    @JoinColumn(name = "agendamento_id", referencedColumnName = "id")
    private Agendamento agendamento;
    
    @OneToOne
    @JoinColumn(name = "solicitacao_id", referencedColumnName = "id")
    private Solicitacao solicitacao;
    
    @OneToOne(mappedBy = "paciente", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Aluno aluno;
    
}
