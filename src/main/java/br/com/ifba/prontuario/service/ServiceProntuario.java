/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.service;

import br.com.ifba.prontuario.dao.IDaoProntuario;
import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.paciente.model.Paciente;

/**
 *
 * @author Hiego
 */
@Service
public class ServiceProntuario implements IServiceProntuario {

    @Autowired
    private IDaoProntuario dao;

    // salva o prontuario no banco de dados
    @Override
    public void saveProntuario(Prontuario prontuario) {
        try {
            if (prontuario != null) {
                prontuario.setAtivo(true); // seta todo prontuario como ativo por default
                dao.save(prontuario);
            } else {
                throw new BusinessException("Prontuário fornecido é nulo.");
            }
        } catch (Exception e) {
            throw new BusinessException("Erro ao salvar o prontuário.", e);
        }
    }

// prontuario ativo
    @Override
    public List<Prontuario> getAllProntuarios() {
        try {
            List<Prontuario> prontuarios = this.dao.findAllByAtivoIsTrue();
            if (prontuarios == null) {
                throw new BusinessException("A lista de prontuários ativos é nula.");
            }
            return prontuarios;
        } catch (Exception e) {
            throw new BusinessException("Erro ao obter prontuários ativos.", e);
        }
    }

// prontuario não ativo
    @Override
    public List<Prontuario> getAllArquivados() {
        try {
            List<Prontuario> arquivados = this.dao.findAllByAtivoIsFalse();
            if (arquivados == null) {
                throw new BusinessException("A lista de prontuários arquivados é nula.");
            }
            return arquivados;
        } catch (Exception e) {
            throw new BusinessException("Erro ao obter prontuários arquivados.", e);
        }
    }

// pega o ID
    @Override
    public Prontuario findById(Long id) {
        try {
            if (id != null) {
                return this.dao.findById(id);
            } else {
                throw new BusinessException("O ID fornecido é nulo.");
            }
        } catch (Exception e) {
            throw new BusinessException("Erro ao obter prontuário por ID.", e);
        }
    }

// desarquiva o prontuario
    @Override
    public void desarquivarProntuario(Prontuario prontuario) {
        try {
            if (prontuario != null) {
                prontuario.setAtivo(true);
                this.dao.save(prontuario);
            } else {
                throw new BusinessException("Prontuário fornecido é nulo.");
            }
        } catch (Exception e) {
            throw new BusinessException("Erro ao desarquivar prontuário.", e);
        }
    }

// arquiva o prontuario
    @Override
    public void arquivarProntuario(Prontuario prontuario) {
        try {
            if (prontuario != null) {
                prontuario.setAtivo(false);
                this.dao.save(prontuario);
            } else {
                throw new BusinessException("Prontuário fornecido é nulo.");
            }
        } catch (Exception e) {
            throw new BusinessException("Erro ao arquivar prontuário.", e);
        }
    }
//Cria paciente:
    @Override
    public void novoProntuario(String Desc, Paciente paciente){
        try{
            if(paciente != null){
                Prontuario prontuario = new Prontuario();
                prontuario.setDescricao(Desc);
                prontuario.setPaciente(paciente);
                prontuario.setAtivo(true);
                this.dao.save(prontuario);
            } else{
                throw new BusinessException("Paciente Nulo");
            }
        } catch(Exception e){
            throw new BusinessException("Erro ao criar prontuario", e);
        }
    }
}
