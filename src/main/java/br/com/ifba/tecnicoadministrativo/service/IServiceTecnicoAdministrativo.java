/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.service;

import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;

/**
 *
 * @author lara
 */
public interface IServiceTecnicoAdministrativo {
    public TecnicoAdministrativo findBySiape(String siape);
    public TecnicoAdministrativo findByAdiministradoIsTrueAndSiape(String siape);
}
