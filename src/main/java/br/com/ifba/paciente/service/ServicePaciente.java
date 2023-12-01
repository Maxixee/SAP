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
    
    // Mensagem de erro se o Paciente ja existir no banco.
    public final static String PACIENTE_EXISTE = "Paciente ja existente no Banco de dados";
   
    // Mensagem de erro se o Paciente não existir no banco.
    public final static String PACIENTE_NAO_EXISTE = "Paciente nao existente no Banco de dados";
    
    // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
    // Mensagem de erro caso o campo matricula esteja vazio.
    private final static String MATRICULA_VAZIA = "O Campo matricula esta vazio";
    
    // Mensagem de erro caso o campo matricula esteja vazio.
    private final static String MATRICULA_EXISTE = "Essa matricula ja existe";
    
    // Mensagem de erro caso o matricula seja null.
    private final static String MATRICULA_NULL = "Dados de matricula nao preenchidos";
    
    // Mensagem de erro caso o campo matricula esteja vazio.
    private final static String CPF_CADASTRADO = "Esse CPF ja esta cadastrado";
    
    // Mensagem de erro caso a chave de acesso esteja vazio.
    private final static String CHAVEACESSO_VAZIO = "O Campo Chave de acesso esta vazio";
    
    // Mensagem de erro caso ochave de acesso seja null.
    private final static String CHAVEACESSO_NULL = "Dados do Chave de acesso nao preenchidos";
    
    @Autowired
    private IDaoPaciente daoPaciente;
    
    @Override
    public Paciente savePaciente(Paciente paciente) {
        if(paciente == null){
            throw new BusinessException(PACIENTE_NULL);
        } else if(daoPaciente.existsById(paciente.getId()) == true){
            throw new BusinessException(PACIENTE_EXISTE);
        } else if(daoPaciente.existsByMatricula(paciente.getMatricula()) == true){
            throw new BusinessException(MATRICULA_EXISTE);
        } else if(daoPaciente.existsByCpf(paciente.getCpf()) == true) {
            throw new BusinessException(CPF_CADASTRADO);
        } else {
            return daoPaciente.save(paciente);
        }
    }
    
    @Override
    public Paciente updatePaciente(Paciente paciente) {
        if(paciente == null) {
            throw new BusinessException(PACIENTE_NULL);
        } else if(daoPaciente.existsById(paciente.getId()) == false) {
            throw new BusinessException(PACIENTE_NAO_EXISTE);
        } else {
            return daoPaciente.save(paciente);
        }
    }
    
    @Override
    public void deletePaciente(Paciente paciente){
        if(paciente == null) {
            throw new BusinessException(PACIENTE_NULL);
        } else if(daoPaciente.existsById(paciente.getId()) == false) {
            throw new BusinessException(PACIENTE_NAO_EXISTE);
        } else{
            daoPaciente.delete(paciente);
        }
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
    public List<Paciente> findByNomePacienteLike(String nome) {
        return daoPaciente.findByNomeLike(nome);
    }
    
    @Override
    public List<Paciente> findByNomePaciente(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        } else{
            return daoPaciente.findByNome(nome);
        }
    }
    
    @Override
    public List<Paciente> findByMatriculaPaciente(String matricula) {
        if(matricula == null) {
            throw new BusinessException(MATRICULA_NULL);
        } if(matricula.isEmpty()) {
            throw new BusinessException(MATRICULA_VAZIA);
        } else{
            return daoPaciente.findByMatricula(matricula);
        }

    }
    
    @Override
    public List<Paciente> findByChaveAcesso(String chaveAcesso) {
        if(chaveAcesso == null) {
            throw new BusinessException(CHAVEACESSO_VAZIO);
        } if(chaveAcesso.isEmpty()) {
            throw new BusinessException(CHAVEACESSO_NULL );
        } else{
            return daoPaciente.findByChaveAcesso(chaveAcesso);
        }

    }
}
