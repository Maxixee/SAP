/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.solicitacao.dao;

import br.com.ifba.solicitacao.model.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface IDaoSolicitacao extends JpaRepository<Solicitacao, Long>{
    
}
