/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.login.service;
import br.com.ifba.paciente.service.IServicePaciente;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;
import br.com.ifba.tecnicoadministrativo.service.IServiceTecnicoAdministrativo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *
 * @author lara
 */
@Controller
public class ServiceLogin implements IServiceLogin{
    @Autowired
    IServicePaciente servicePaciente;
    @Autowired
    IServiceTecnicoAdministrativo serviceTecnico;
    
    @Override
    public String findUser(String Credential) {
        List<Paciente> paciente;
        TecnicoAdministrativo tecnico;
        
        tecnico = serviceTecnico.findBySiape(Credential);
        paciente = servicePaciente.findByMatriculaPaciente(Credential);
        
        if(paciente.isEmpty() == false){
            return "paciente";
        }
        
        if(tecnico != null){
            return "tecnico";
        }
        return "";
    }
    
}
