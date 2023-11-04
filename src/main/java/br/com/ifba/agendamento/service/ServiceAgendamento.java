/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agendamento.service;

import br.com.ifba.agendamento.dao.IDaoAgendamento;
import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author davia
 */
@Service
public class ServiceAgendamento implements IServiceAgendamento{
    
     //mensagem de erro se o Agendamento for null;
    public final static String AGENDAMENTO_NULL = "Dados do Agendamento não preenchidos";
    
    //mensagem de erro se o Agendamento já existir;
    public final static String AGENDAMENTO_EXISTE = "Agendamento ja existente no Banco de dados";
    
    //mensagem de erro se o Agendamento não existir no banco;
    public final static String AGENDAMENTO_NAO_EXISTE = "Agendamento nao existente no Banco de dados";
    
    //mensagem de erro se o Agendamento for inválido;
    public final static String AGENDAMENTO_INVALIDO = "As informaçoes do Agendamento nao sao validas";
    
    @Autowired
    private IDaoAgendamento daoAgendamento;
    
    
    @Override
    public void saveDataAgendamento(Agendamento agendamento) {
        /*if(agendamento == null){
            throw new BusinessException(AGENDAMENTO_NULL);
        } else if(daoAgendamento.existsById(agendamento.getId()) == true){
            throw new BusinessException(AGENDAMENTO_EXISTE);
        } else {*/
            daoAgendamento.save(agendamento);
        //}
    }
    
    @Override
    public List<Agendamento> getAllAgendamento() {
        return daoAgendamento.findAll();
        }
    
    @Override
    public boolean deleteAgendamento(Agendamento agendamento) {
        this.daoAgendamento.delete(agendamento);
        return true;
        }
    
    @Override
    public  void updateAgendamento(Agendamento agendamento) {
        daoAgendamento.save(agendamento);
       }
    
    @Override
     public Agendamento findById(Long id) {
          return daoAgendamento.getReferenceById(id);
     }
}
