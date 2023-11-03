/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.model;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import javax.persistence.ManyToOne;
/**
 *
 * @author Hiego
 */
@Entity
@Table(name = "prontuario")
@Data
@EqualsAndHashCode(callSuper = false)
public class Prontuario extends PersistenceEntity implements Serializable{
    
    private Boolean ativo;
    private String descricao;
    //Muitos prontuarios podem corresponder a um mesmo paciente
    @ManyToOne
    private Paciente paciente;
    private FuncaoServidor psicologo;
    //colocando as classes pacientes e psicologo para sincronizar com o resto do codigo
}
