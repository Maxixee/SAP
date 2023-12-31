/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcaoservidor.service;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.servidor.model.Servidor;
import java.util.List;

/**
 *
 * @author msmmendes
 */
public interface IServiceFuncaoServidor {
    // Salva servidor.
    public abstract Servidor saveServidor(FuncaoServidor funcaoServidor);
    // Atualiza servidor.
    public abstract Servidor updateServidor(FuncaoServidor funcaoServidor);
    // Deleta servidor.
    public abstract void deleteServidor(FuncaoServidor funcaoServidor);
     // Método que retorna todos os servidores da base de dados.
    public abstract List<Servidor> getAllservidor();
    // Método que retorna o servidor com o id informado.
    public Servidor findById(Long id);
    // Método que retorna a lista com os servidores com o nome informado.
    public List<Servidor> findByNome(String nome);
    // Método que retorna a lista com os servidores com a descricao informada.
    public List<Servidor> findByDescricao(String descricao);
}
