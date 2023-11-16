/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.usuario.model.Usuario;

/**
 *
 * @author msmmendes
 */
public interface IServiceUsuario {
    
    public abstract Usuario saveUsuario(Usuario usuario);
    
    public abstract Usuario updateUsuario(Usuario usuario);
    
    public abstract void deleteUsuario(Usuario usuario);
}
