/*/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.listadeespera.dao;


import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author riaan
 */

@Repository
public interface IDaoListaDeEspera extends JpaRepository<Agendamento, Long>  {
                                                         
}
 
   
