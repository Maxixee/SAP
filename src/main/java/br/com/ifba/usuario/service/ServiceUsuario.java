/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.usuario.dao.IDaoUsuario;
import br.com.ifba.usuario.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author msmmendes
 */
public class ServiceUsuario implements IServiceUsuario{
    
    // Mensagem de erro se o Usuario for null.
    private final static String USUARIO_NULL = "Dados do Usuario nao preenchidos";
    // Mensagem de erro se o Usuario já existir.
    private final static String USUARIO_EXISTE = "Usuario ja existente no Banco de dados";
    // Mensagem de erro se a Usuario não existir no banco.
    private final static String USUARIO_NAO_EXISTE = "Usuario nao existente no Banco de dados";
    // Mensagem de erro caso o nome esteja vazio.
    // private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    // private final static String NOME_NULL = "Dados do nome nao preenchidos";
    // Mensagem de erro caso o login esteja vazio.
//    private final static String LOGIN_VAZIO = "O Campo Login esta vazio";
    // Mensagem de erro caso o login seja null.
//    private final static String LOGIN_NULL = "Dados do Login nao preenchidos";
    
    //================= OBJETO =================================================
    @Autowired
     private IDaoUsuario daoUsuario;

    //================= MÉTODOS ================================================
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if(usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } 
        if(daoUsuario.existsByLogin(usuario.getLogin()) == true) {
            throw new BusinessException(USUARIO_EXISTE);
        }
        return daoUsuario.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } 
        if(daoUsuario.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        return daoUsuario.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        }
        if(daoUsuario.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);    
        }
        daoUsuario.delete(usuario);
    }
    
}
