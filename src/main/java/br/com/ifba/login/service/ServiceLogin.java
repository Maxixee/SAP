/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.login.service;
import br.com.ifba.paciente.service.IServicePaciente;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.perfilusuario.model.EnumPerfilUsuario;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;
import br.com.ifba.tecnicoadministrativo.service.IServiceTecnicoAdministrativo;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.usuario.service.IServiceUsuario;
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
    @Autowired
    IServiceUsuario serviceUsuario;
    @Autowired
    IServicePerfilUsuario servicePerfilUsuario;
    
    @Override
    public String findUser(String credential) {
        List<Paciente> pacientes = servicePaciente.findByMatriculaPaciente(credential);
    
        if (pacientes != null) {
            Paciente paciente = pacientes.get(0);
            PerfilUsuario perfilUsuario = paciente.getPerfilUsuario();

            if (perfilUsuario != null) {
                return "paciente";
            }
        }

        TecnicoAdministrativo tecnico = serviceTecnico.findBySiape(credential);

        if (tecnico != null) {
            PerfilUsuario perfilUsuario = tecnico.getPerfilUsuario();

            if (perfilUsuario != null) {
                return "tecnico";
            }
        }

        return "";
    }
    
    @Override
    public String findUser2(String credential, String senha) {
        List<Usuario> usuarios = serviceUsuario.findByLoginUsuario(credential);
    
        if(!usuarios.isEmpty()) {
            Usuario usuario = usuarios.get(0);
            System.out.println(usuario.getPerfilUsuario().getNome()); 

            if(usuario.getSenha().equals(senha)) {
                String tipoPerfil = usuario.getPerfilUsuario().getNome().toLowerCase(); 
                if("paciente".equals(tipoPerfil)) {
                    return "paciente";
                } else if ("tecnico".equals(tipoPerfil)) {
                    return "tecnico";
                }
            }
        }

        return "";
    }
}
