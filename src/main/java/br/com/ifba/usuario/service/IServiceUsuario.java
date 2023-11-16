/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author msmmendes
 */
public interface IServiceUsuario {
    
    public abstract Usuario saveUsuario(Usuario usuario);
    
    public abstract Usuario updateUsuario(Usuario usuario);
    
    public abstract void deleteUsuario(Usuario usuario);
    
    public List<Usuario> getAllUsuario();
    
    public List<Usuario> findByLoginUsuario(String login);
    
    public Usuario findByLogin(String login);
}
