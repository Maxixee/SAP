/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.solicitacao.model.Solicitacao;
import br.com.ifba.teste.model.Teste;
import br.com.ifba.usuario.model.Usuario;
import java.util.List;


/**
 *
 * @author clebinho
 */
public interface IFacade {
    //=====================ALUNO====================
    public List<Aluno> getAllAluno();
    public Aluno saveAluno(Aluno aluno);
    //=====================PERFIL USUARIO====================
    public abstract PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario);
    public abstract PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario);
    public abstract void deletePerfilUsuario(PerfilUsuario perfilUsuario);
    public List<PerfilUsuario> getAllPerfilUsuario();
    public PerfilUsuario findByIdPerfilUsuario(Long id);
    public List<PerfilUsuario> findByNomePerfilUsuario(String nome);
    //=====================USUARIO====================//
    public abstract Usuario saveUsuario(Usuario usuario);
    public abstract Usuario updateUsuario(Usuario usuario);
    public abstract void deleteUsuario(Usuario usuario);
    public List<Usuario> getAllUsuario();
    //public List<Usuario> findByNomeUsuario(String nome);
    public List<Usuario> findByLoginUsuario(String login);
    public Usuario findByLogin(String login);
    //=====================SOLICITACAO=====================
    public void saveSolicitacao(Solicitacao solicitacao); 
    public List<Solicitacao> getAllSolicitacao(); 
    public void removeSolicitacao(Long value);
    //=====================TESTE=====================
    public abstract void saveTeste(Teste teste);
    public List<Teste> findAll();
    
    //=====================PACIENTES=====================
    public Paciente savePaciente(Paciente paciente);  
    public Paciente updatePaciente(Paciente paciente);
    public void deletePaciente(Paciente paciente);
    public List<Paciente> getAllPaciente();
    public Paciente findByIdPaciente(Long id);
    public List <Paciente> findByNomeLike(String nome);
    public List <Paciente> findByNome(String nome);
    public List <Paciente> findByMatricula(String matricula);
    
    //=====================PRONTUARIO=====================
    public void saveProntuario(Prontuario prontuario);
    public List<Prontuario> getAllProntuarios();
    public List<Prontuario> getAllProntuariosArquivados();
    public void desarquivarProntuario(Prontuario prontuario);
    public Prontuario findProntuarioById(Long id);
    public void arquivarProntuario(Prontuario prontuario);
    public void newProntuario(String desc, Paciente paciente);
    //=====================AGENDAMENTO=====================
    public Agendamento saveSolicitacaoAgendamento(Agendamento agendamento);
    public Agendamento saveDataAgendamento(Agendamento agendamento);
    public List<Agendamento>getAllAgendamento();
    public Agendamento updateAgendamento(Agendamento agendamento);
    public abstract void deleteAgendamento(Agendamento agendamento);
    public Agendamento findAgendamentoById(Long id);
    
    
    //==========================LOGIN================================
    public String findUser(String Credential);
    public String findUser2(String Credential, String senha);
        
    //=====================LISTA DE ESPERA=====================
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento);
}
