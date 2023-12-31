/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.agendamento.dao;

import br.com.ifba.agendamento.model.Agendamento;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author davia
 */
@Repository
public interface IDaoAgendamento extends JpaRepository<Agendamento, Long>{
    public List<Agendamento> findByDataAgendamentoAndHoraAgendamento(Calendar dataAgendamento, LocalTime horaAgendamento);
    //public boolean existsByDataAgendamentoAndLocalTimeHoraAgendamento(Calendar dataAgendamento, LocalTime horaAgendamento);
    
    // Seleciona apenas os agendamentos disponiveis
    @Query("SELECT a FROM Agendamento a WHERE a.statusAgendamento IS 'AGENDAMENTO_DISPONIVEL'")
    public List<Agendamento> getAllAgendamentoDisponivel();
    
    // Seleciona apenas os agendamentos solicitados
    @Query("SELECT a FROM Agendamento a WHERE a.statusAgendamento IS 'AGENDAMENTO_SOLICITADO'")
    public List<Agendamento> getAllAgendamentoSolicitado();

}
