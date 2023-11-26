/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.servidor.model;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.pessoa.model.Pessoa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 *
 * @author msmmendes
 */
@Entity
@Table(name = "servidor")
@Data
public class Servidor extends Pessoa implements Serializable {
    private String descricao;
    private String siape;
    private boolean ativo; 
}
