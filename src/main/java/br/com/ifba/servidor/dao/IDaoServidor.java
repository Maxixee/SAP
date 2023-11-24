/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.servidor.dao;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.servidor.model.Servidor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author davia
 */
@Repository
public interface IDaoServidor  extends JpaRepository<Servidor, Long>{
    public List<Servidor> findByNome(String nome);
    public boolean existsByNome(String nome);
    public List<Servidor> findByDescricao(String descricao);
    public Servidor findBySiape(Long siape);
}
