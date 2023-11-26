/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.servidor.service;

import br.com.ifba.funcaoservidor.dao.IDaoFuncaoServidor;
import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.servidor.dao.IDaoServidor;
import br.com.ifba.servidor.model.Servidor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author davia
 */

@Service
public class ServiceServidor implements IServiceServidor{
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se Servidor for null.
    public final static String FUNCAO_SERVIDOR_NULL = "Dados do(a) Servidor(a) nao preenchidos";
    // Mensagem de erro se o Servidor já existir.
    public final static String FUNCAO_SERVIDOR_EXISTE = "Servidor(a) ja existente no Banco de dados";
    // Mensagem de erro se o Servidor não existir no banco.
    public final static String FUNCAO_SERVIDOR_NAO_EXISTE = "Servidor(a) nao existente no Banco de dados";
    // Mensagem de erro se o FuncaoServidor for inválido.
    public final static String FUNCAO_SERVIDOR_INVALIDO = "As informaçoes do(a) Servidor(a) nao sao validas";
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    // Mensagem de erro caso a descricao seja vazio
    private final static String DESCRICAO_VAZIO = "O Campo a descricao esta vazio";
    // Mensagem de erro caso a descricao seja null.
    private final static String DESCRICAO_NULL = "Dados do a descricao nao preenchidos";
    
     //================= OBJETO =================================================
    
    @Autowired
    private IDaoServidor daoServidor;

     //================= MÉTODOS ================================================
    
    @Override
    public Servidor saveServidor(Servidor servidor) {
       if(servidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        }
       if(daoServidor.existsByNome(servidor.getNome()) == true) {
            throw new BusinessException(FUNCAO_SERVIDOR_EXISTE);
        }
       return daoServidor.save(servidor);
    }

    @Override
    public Servidor updateServidor(Servidor servidor) {
        if(servidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        } 
        if(daoServidor.existsById(servidor.getId()) == false) {
            throw new BusinessException(FUNCAO_SERVIDOR_EXISTE);
        }
        return daoServidor.save(servidor);
    }

    @Override
    public void deleteServidor(Servidor servidor) {
        if(servidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        } 
        if(daoServidor.existsById(servidor.getId()) == false) {
            throw new BusinessException(FUNCAO_SERVIDOR_NAO_EXISTE);
        }
        daoServidor.delete(servidor);
    }

    @Override
    public List<Servidor> getAllServidor() {
        return this.daoServidor.findAll();
    }
    
    @Override
    public List<Servidor> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return daoServidor.findByNome(nome); 
    }
    
     @Override
     public Servidor findBySiape(Long siape) {
          return daoServidor.findBySiape(siape);
     }
     
     public Servidor findByIdServidor(Long id) {
          return daoServidor.getReferenceById(id);
     }
     
     @Override
     public List<Servidor> findByDescricao(String descricao){
        if(descricao == null) {
            throw new BusinessException(DESCRICAO_NULL);
        } 
        if(descricao.isEmpty()) {
            throw new BusinessException(DESCRICAO_VAZIO);
        }
        return daoServidor.findByDescricao(descricao); 
     }
}
