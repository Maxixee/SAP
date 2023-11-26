/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcaoservidor.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.servidor.model.Servidor;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author msmmendes
 */
@Data
@Entity
@Table(name = "funcao_servidor")
public abstract class FuncaoServidor extends PersistenceEntity implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Servidor servidor;
    private String descricao;
    private String nome;
    
    
}
