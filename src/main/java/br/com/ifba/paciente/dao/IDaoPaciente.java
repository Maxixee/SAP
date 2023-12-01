/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.paciente.dao;

import br.com.ifba.paciente.model.Paciente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public interface IDaoPaciente extends JpaRepository<Paciente, Long>{
    
    @Query("SELECT p FROM Paciente p WHERE p.nome LIKE %:nome%")
    public List<Paciente> findByNomeLike(String nome);

    public List<Paciente> findByNome(String nome);

    public List<Paciente> findByMatricula(String matricula);
    
    public List<Paciente>findByChaveAcesso(String chaveAcesso);
    
    public boolean existsByMatricula(String matricula);
    
    public boolean existsByCpf(String cpf);
}
