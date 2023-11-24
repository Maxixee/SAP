/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.servidor.service;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.servidor.model.Servidor;
import java.util.List;

/**
 *
 * @author davia
 */
public interface IServiceServidor {
    // Salva servidor.
    public abstract Servidor saveServidor(Servidor servidor);
    // Atualiza servidor.
    public abstract Servidor updateServidor(Servidor servidor);
    // Deleta servidor.
    public abstract void deleteServidor(Servidor servidor);
     // Método que retorna todos os servidores da base de dados.
    public abstract List<Servidor> getAllservidor();
    
    /*// Método que retorna o servidor com o id informado.
    public Servidor findById(Long id);*/
    
    // Método que retorna a lista com os servidores com o nome informado.
    public List<Servidor> findByNome(String nome);
    // Método que retorna a lista com os servidores com a descricao informada.
    public List<Servidor> findByDescricao(String descricao);
    // Método que retorna o servidor com o siape informado.
    public Servidor findBySiape(Long siape);
}
