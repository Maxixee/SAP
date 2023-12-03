/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.dao.IDaoAluno;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author msmmendes
 */
@Service
public class ServiceAluno implements IServiceAluno {
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se o Aluno for null.
    public final static String ALUNO_NULL = "Dados do aluno nao preenchidos";
    
    // Mensagem de erro se o Aluno ja existir no banco.
    public final static String ALUNO_EXISTE = "Aluno ja existente no Banco de dados";
   
    // Mensagem de erro se o Aluno não existir no banco.
    public final static String ALUNO_NAO_EXISTE = "Aluno nao existente no Banco de dados";
    
    // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
    // Mensagem de erro caso o campo matricula esteja vazio.
    private final static String MATRICULA_VAZIA = "O Campo matricula esta vazio";
    
    // Mensagem de erro caso ja exista um aluno cadastrado com essa matricula
    private final static String MATRICULA_EXISTE = "Ja existe um aluno cadastrado com essa matricula";
    
    // Mensagem de erro caso o matricula seja null.
    private final static String MATRICULA_NULL = "Dados de matricula nao preenchidos";
    
    // Mensagem de erro caso o campo cpf esteja vazio.
    private final static String CPF_VAZIO = "O Campo CPF esta vazio";
    
    // Mensagem de erro caso ja exista um aluno cadastrado com esse CPF
    private final static String CPF_EXISTE = "Esse CPF ja esta cadastrado";
    
    // Mensagem de erro caso a exista um aluno cadastrado com esse numero de telefone
    private final static String TELEFONE_EXISTE = "Ja existe um aluno cadastrado com esse numero";
   
    // Mensagem de erro caso o campo cpf esteja vazio.
    private final static String EMAIL_VAZIO = "O Campo e-mail esta vazio";
    
    // Mensagem de erro caso ja exista um aluno cadastrado com esse e-mail
    private final static String EMAIL_EXISTE = "Ja existe um aluno cadastrado com esse e-mail";
    
    
    @Autowired
    private IDaoAluno daoAluno;
    
    @Override
    public Aluno saveAluno(Aluno aluno) {
        if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        } else if(daoAluno.existsById(aluno.getId()) == true) {
            throw new BusinessException(ALUNO_EXISTE);
        } else if(daoAluno.existsByMatricula(aluno.getMatricula()) == true) {
            throw new BusinessException(MATRICULA_EXISTE);
        } else if(daoAluno.existsByCpf(aluno.getCpf()) == true) {
            throw new BusinessException(CPF_EXISTE);
        } else if(daoAluno.existsByTelefone(aluno.getTelefone()) == true) {
            throw new BusinessException(TELEFONE_EXISTE);
        } else if(daoAluno.existsByTelefone(aluno.getTelefone()) == true) {
            throw new BusinessException(EMAIL_EXISTE);
        } else if(aluno.getNome().isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        } else if(aluno.getMatricula().isEmpty()) {
            throw new BusinessException(MATRICULA_VAZIA);
        } else if(aluno.getCpf().isEmpty()) {
            throw new BusinessException(CPF_VAZIO);
        }  else if(aluno.getEmail().isEmpty()) {
            throw new BusinessException(EMAIL_VAZIO);
        } else {
            return daoAluno.save(aluno);
        }
    }
    
    @Override
    public Aluno updateAluno(Aluno aluno) {
        if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        } else if(daoAluno.existsById(aluno.getId()) == false) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        } else {
            return daoAluno.save(aluno);
        }
    }
    
    @Override
    public void deleteAluno(Aluno aluno){
        if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        } else if(daoAluno.existsById(aluno.getId()) == false) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        } else {
            daoAluno.delete(aluno);
        }
    }
    
    @Override
    public Aluno findById(Long id) {
        return daoAluno.getReferenceById(id);
    }
    
    @Override
    public List<Aluno> findByNomeLike(String nome) {
        return daoAluno.findByNomeLike(nome);
    }
    
    @Override
    public List<Aluno> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        } else {
            return daoAluno.findByNome(nome);
        }
    }
    
    @Override
    public List <Aluno> findByMatricula(String matricula) {
        if(matricula == null) {
            throw new BusinessException(MATRICULA_NULL);
        } if(matricula.isEmpty()) {
            throw new BusinessException(MATRICULA_VAZIA);
        } else {
            return daoAluno.findByMatricula(matricula);
        }

    }
    @Override
    public List<Aluno> getAllAluno() {
        return daoAluno.findAll();
    } 
    
    @Override
    public List<Aluno> getAllAlunoNaoPaciente() {
        // seleciona todos os alunos que nao foram cadastrados como pacientes
        return daoAluno.findAllAluno();
    }
    
}
