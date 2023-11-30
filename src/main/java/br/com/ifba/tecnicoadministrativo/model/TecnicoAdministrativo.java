/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.model;

import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.servidor.model.Servidor;
import javax.persistence.Entity;
import lombok.Data;
/**
 *
 * @author msmmendes
 */
@Data
@Entity
public class TecnicoAdministrativo extends Servidor{
    private PerfilUsuario perfilUsuario;

    public TecnicoAdministrativo() {
    }
    
    public TecnicoAdministrativo(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario; // Inicializa o tipo de usuario "tecnico"
    }
}
