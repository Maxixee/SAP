/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.agendamento.service.IServiceAgendamento;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.aluno.service.IServiceAluno;
import br.com.ifba.email.model.EmailDto;
import br.com.ifba.email.service.EmailService;
import br.com.ifba.listadeespera.model.ListaDeEspera;
import br.com.ifba.listadeespera.service.IServiceListaDeEspera;
import br.com.ifba.login.service.IServiceLogin;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.paciente.service.IServicePaciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.prontuario.service.IServiceProntuario;
import br.com.ifba.servidor.model.Servidor;
import br.com.ifba.servidor.service.IServiceServidor;
import br.com.ifba.solicitacao.model.Solicitacao;
import br.com.ifba.solicitacao.service.IServiceSolicitacao;
import br.com.ifba.teste.model.Teste;
import br.com.ifba.teste.service.IServiceTeste;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author clebinho
 */
@Controller
public class Facade implements IFacade {
    
    @Autowired
    private IServiceTeste serviceTeste;
    @Autowired
    private IServicePaciente servicePaciente;
    @Autowired
    private IServiceProntuario serviceProntuario;  
    @Autowired
    private IServiceAgendamento serviceAgendamento;
    @Autowired
    private IServiceSolicitacao serviceSolicitacao;
    @Autowired
    private IServiceLogin serviceLogin;
    @Autowired
    private IServiceListaDeEspera serviceListaDeEspera;
    @Autowired
    private IServiceServidor serviceServidor;
    @Autowired
    private  EmailService emailService;
    
    //=====================================================//
    //=========================ALUNO=======================//
    //=====================================================//
    
    @Autowired
    private IServiceAluno serviceAluno;
    
    @Override
    public Aluno saveAluno(Aluno aluno) {
        return serviceAluno.saveAluno(aluno);
    }
    
    @Override
    public Aluno updateAluno(Aluno aluno){
        return serviceAluno.updateAluno(aluno);
    }
    
    @Override
    public void deleteAluno(Aluno aluno){
        serviceAluno.deleteAluno(aluno);
    }
    
    @Override
    public List<Aluno> getAllAluno() {
        return serviceAluno.getAllAluno();
    }
    
    @Override
    public List<Aluno> getAllAlunoNaoPaciente(){
         return serviceAluno.getAllAlunoNaoPaciente();
    }
    
    @Override
    public Aluno findById(Long id){
        return serviceAluno.findById(id);
    }
    
    @Override
    public List<Aluno> findByNomeLike(String nome) {
       return  serviceAluno.findByNomeLike(nome);
    }
    
    @Override
    public List<Aluno> findByNome(String nome) {
       return  serviceAluno.findByNome(nome);
    }
    
    @Override
    public List <Aluno> findByMatricula(String matricula) {
       return  serviceAluno.findByMatricula(matricula);
    }

    //=====================SOLICITACAO=====================
    @Override
    public void saveSolicitacao(Solicitacao solicitacao) {
        serviceSolicitacao.saveSolicitacao(solicitacao);
    }
    
    @Override
    public List<Solicitacao> getAllSolicitacao() {
        return serviceSolicitacao.getAllSolicitacao();
    }
    
    @Override
    public void removeSolicitacao(Long value){
        serviceSolicitacao.removeSolicitacao(value);
    }
    
    
    
    //=====================TESTE=====================
    @Override
    public void saveTeste(Teste teste) {
        serviceTeste.saveTeste(teste);
    }

    @Override
    public List<Teste> findAll() {
        return serviceTeste.findAll();
    }

    //=====================PRONTUARIO=====================
    @Override
    public void saveProntuario(Prontuario prontuario) {
        serviceProntuario.saveProntuario(prontuario);
    }

    @Override
    public List<Prontuario> getAllProntuarios() {
        return serviceProntuario.getAllProntuarios();
    }

    @Override
    public List<Prontuario> getAllProntuariosArquivados() {
        return serviceProntuario.getAllArquivados();
    }
    @Override
    public void desarquivarProntuario(Prontuario prontuario) {
        serviceProntuario.desarquivarProntuario(prontuario);
    }
    @Override
    public void arquivarProntuario(Prontuario prontuario){
        serviceProntuario.arquivarProntuario(prontuario);
    }
     @Override
    public Prontuario findProntuarioById(Long id) {
        return serviceProntuario.findById(id);
    }
    @Override
    public void newProntuario(String desc, Paciente paciente){
        serviceProntuario.novoProntuario(desc, paciente);
    }
    
    //=====================PACIENTE=====================
    @Override
    public Paciente savePaciente(Paciente paciente) {
        return servicePaciente.savePaciente(paciente);
    }
    
    @Override
    public Paciente updatePaciente(Paciente paciente){
        return servicePaciente.updatePaciente(paciente);
    }
    
    @Override
    public void deletePaciente(Paciente paciente){
        servicePaciente.deletePaciente(paciente);
    }
    
    @Override
    public List<Paciente> getAllPaciente() {
        return servicePaciente.getAllPaciente();
    }
    
    @Override
    public Paciente findByIdPaciente(Long id){
        return servicePaciente.findById(id);
    }
    
    @Override
    public List<Paciente> findByNomePacienteLike(String nome) {
       return  servicePaciente.findByNomePacienteLike(nome);
    }
    
    @Override
    public List<Paciente> findByNomePaciente(String nome) {
       return  servicePaciente.findByNomePaciente(nome);
    }
    
    @Override
    public List<Paciente> findByMatriculaPaciente(String matricula) {
       return  servicePaciente.findByMatriculaPaciente(matricula);
    }
    @Override
    public List<Paciente> findByChaveAcesso(String chaveAcesso) {
        return servicePaciente.findByChaveAcesso(chaveAcesso);
    }
    
    //=====================AGENDAMENTO=====================
    
    @Override
    public Agendamento saveSolicitacaoAgendamento(Agendamento agendamento){
        return serviceAgendamento.saveDataAgendamento(agendamento);
    }
    
    @Override
    public Agendamento saveDataAgendamento(Agendamento agendamento){
        return serviceAgendamento.saveDataAgendamento(agendamento);
    }

    @Override
    public List<Agendamento> getAllAgendamento() {
         return serviceAgendamento.getAllAgendamento();
    }
    
    @Override
    public List<Agendamento> getAllAgendamentoDisponivel() {
         return serviceAgendamento.getAllAgendamentoDisponivel();
    }
    
    @Override
    public List<Agendamento> getAllAgendamentoSolicitado() {
         return serviceAgendamento.getAllAgendamentoSolicitado();
    }
    
    @Override
    public Agendamento updateAgendamento(Agendamento agendamento) {
        return this.serviceAgendamento.updateAgendamento(agendamento);
        }

    @Override
    public void deleteAgendamento(Agendamento agendamento) {
        this.serviceAgendamento.deleteAgendamento(agendamento);
        }
    
    @Override
    public Agendamento findAgendamentoById(Long id) {
        return serviceAgendamento.findById(id);
    }   
   
//=====================LOGIN============================
    @Override
    public String findUser(String Credential){
        return serviceLogin.findUser(Credential);
    }
         //=====================LISTA DE ESPERA=====================
    @Override
    public ListaDeEspera salvarNaListaEspera(Agendamento agendamento) {
         // metodo save sem retorno
        serviceListaDeEspera.salvarNaListaEspera(agendamento);
        return null;
    }
    
    //==========================SERVIDOR================================
    @Override
    public Servidor saveServidor(Servidor servidor){
        return serviceServidor.saveServidor(servidor);
    }
    
    @Override
    public Servidor updateServidor(Servidor servidor){
        return serviceServidor.updateServidor(servidor);
    }
    
    @Override
    public void deleteServidor(Servidor servidor){
        serviceServidor.deleteServidor(servidor);
    }
    
    @Override
    public List<Servidor> getAllServidor(){
        return serviceServidor.getAllServidor();
    }
    
    @Override
    public List<Servidor> findByDescricao(String descricao){
        return serviceServidor.findByDescricao(descricao);
    }
    
    @Override
    public Servidor findBySiape(Long siape){
        return serviceServidor.findBySiape(siape);
    }
    
    @Override
     public Servidor findByAdministradorIsTrueAndSiape(String siape) {
          return serviceServidor.findByAdiministradoIsTrueAndSiape(siape);
    }
    
    @Override
    public Servidor findByIdServidor(Long id){
        return serviceServidor.findByIdServidor(id);
    }
    
    //=====================EmailDto===================== 
        @PostMapping(value = "/enviaremial")
    public ResponseEntity<?> confirmmarEmail(@RequestBody EmailDto emailDto){
        try {
		emailService.sendEmail(emailDto);
		return ResponseEntity.status(HttpStatus.OK).body("deu bom");
	 } catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("deu ruim");
		}
	} 
}
