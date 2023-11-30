/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.dao;

import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lara
 */
@Repository
public interface IDaoTecnicoAdministrativo extends JpaRepository<TecnicoAdministrativo, Long>{
    public TecnicoAdministrativo findBySiape(String siape);
    public TecnicoAdministrativo findByAdministradorIsTrueAndSiape(String siape);
}
