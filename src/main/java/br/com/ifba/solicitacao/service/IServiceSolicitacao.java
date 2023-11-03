/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.solicitacao.service;

import br.com.ifba.solicitacao.model.Solicitacao;
import java.util.List;

/**
 *
 * @author andre
 */
public interface IServiceSolicitacao {
    void saveSolicitacao(Solicitacao solicitacao);
    List<Solicitacao> getAllSolicitacao();
    void removeSolicitacao(Long value);
}
