/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.service;

import br.com.ifba.tecnicoadministrativo.dao.IDaoTecnicoAdministrativo;
import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author lara
 */
@Controller
public class ServiceTecnicoAdministrativo implements IServiceTecnicoAdministrativo{
    @Autowired
    IDaoTecnicoAdministrativo daoTecnico;
    
    @Override
    public TecnicoAdministrativo findBySiape(String siape) {
        return daoTecnico.findBySiape(siape);
    }
    
}
