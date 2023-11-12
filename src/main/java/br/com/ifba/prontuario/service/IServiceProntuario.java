/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prontuario.service;

import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;

/**
 *
 * @author Hiego
 */
public interface IServiceProntuario {
    public abstract void saveProntuario(Prontuario prontuario);
    public abstract Prontuario findById(Long id);
    
    // Metéodo que retorna todos os prontuarios da base de dados.
    public abstract List<Prontuario> getAllProntuarios();
    
    //metodo que retorna os prontuarios arquivados:
    public abstract List<Prontuario> getAllArquivados();
    
    //metodo que muda o ativo pra verdadeiro:
    public abstract void desarquivarProntuario(Prontuario prontuario);
    //metodo que muda ativo para falso:
    public abstract void arquivarProntuario(Prontuario prontuario);
    
    //metodo que recebe um paciente e uma descrção e cria um prontuario:
    public abstract void novoProntuario(String Desc, Paciente paciente);
}


