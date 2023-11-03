/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.paciente.dao.IDaoPaciente;
import br.com.ifba.paciente.model.Paciente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class ServicePaciente implements IServicePaciente {
    
    //================= CONSTANTES =============================================
    
   // Mensagem de erro se o Paciente for null.
    public final static String PACIENTE_NULL = "Dados do Paciente nao preenchidos";
    
    // Mensagem de erro se o Paciente não existir no banco.
    public final static String PACIENTE_NAO_EXISTE = "Paciente nao existente no Banco de dados";
    
    // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
    @Autowired
    private IDaoPaciente daoPaciente;
    
    @Override
    public void savePaciente(Paciente paciente) {
        daoPaciente.save(paciente);
    }
    
    @Override
    public List<Paciente> getAllPaciente() {
        return this.daoPaciente.findAll();
    }

    @Override
    public Paciente findById(Long id) {
        return daoPaciente.getReferenceById(id);
    }

    @Override
    public Paciente updatePaciente(Paciente paciente) {
        if(paciente == null) {
            throw new BusinessException(PACIENTE_NULL);
        } 
        if(daoPaciente.existsById(paciente.getId()) == false) {
            throw new BusinessException(PACIENTE_NAO_EXISTE);
        }
        return daoPaciente.save(paciente);
    }

}
