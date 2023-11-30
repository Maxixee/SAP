/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.dao;

import br.com.ifba.usuario.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author msmmendes
 */
@Repository
public interface IDaoUsuario extends JpaRepository<Usuario, Long>{

    public boolean existsByLogin(String login);
    List<Usuario> findByLogin(String login);
}
