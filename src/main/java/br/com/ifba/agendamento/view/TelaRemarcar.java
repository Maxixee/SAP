/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.agendamento.view;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.agendamento.model.EnumAgendamentoStatus;
import br.com.ifba.agendamento.service.IServiceAgendamento;
import br.com.ifba.agendamento.service.ServiceAgendamento;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.solicitacao.view.TelaExibirSolicitacoes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Henrique
 */
@Component
public class TelaRemarcar extends javax.swing.JFrame {
    @Autowired
    private IFacade facade;
    
    int i;

    @Autowired
    private TelaExibirSolicitacoes telaExibirSolicitacoes;
    
    private List<Paciente> pacientes;
    
    Agendamento ag = new Agendamento();
        
    private List<Agendamento> agendamentos;
    
    Agendamento agendamento;
    @PostConstruct
    public void init() {
    }
    public TelaRemarcar() {
        initComponents();
        
        // Fecha a tela sem encerrar todo o sistema
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        btnDisponiveis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAgenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSup.setText("Suporte");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });

        btnDisponiveis.setText("Disponiveis");
        btnDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponiveisActionPerformed(evt);
            }
        });

        jTAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Hora"
            }
        ));
        jScrollPane1.setViewportView(jTAgenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDisponiveis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSup, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDisponiveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSup))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int selectedRow = jTAgenda.getSelectedRow();

       // Verifica se alguma linha está selecionada
       if (selectedRow != -1) {
          //criando objeto auxiliar
          Agendamento aux = new Agendamento();
          Agendamento remarca = new Agendamento();
          aux.setNomePaciente(ag.getNomePaciente());
          aux.setMatriculaPaciente(ag.getMatriculaPaciente());
          aux.setId_paciente(ag.getId_paciente());
          aux.setPaciente(ag.getPaciente());
          
          ag.setNomePaciente(null);
          ag.setMatriculaPaciente(null);
          ag.setId_paciente(0);
          ag.setPaciente(null);
          ag.setStatusAgendamento(EnumAgendamentoStatus.AGENDAMENTO_DISPONIVEL);  
          facade.updateAgendamento(ag);
          
          DefaultTableModel dtmAgendamento =(DefaultTableModel) jTAgenda.getModel();
          remarca = facade.findAgendamentoById(Long.parseLong((String) dtmAgendamento.getValueAt(jTAgenda.getSelectedRow(), 0)));
          remarca.setNomePaciente(aux.getNomePaciente());
          remarca.setMatriculaPaciente(aux.getMatriculaPaciente());
          remarca.setId_paciente(aux.getId_paciente());
          remarca.setStatusAgendamento(EnumAgendamentoStatus.AGENDAMENTO_SOLICITADO);
          telaExibirSolicitacoes.exportarDados(aux.getPaciente());
          facade.updateAgendamento(remarca);
          this.dispose();
          
        /*if(cbxData.getSelectedItem().equals(facade.getAllAgendamentoDisponivel())){
           aux = (Agendamento) facade.getAllAgendamentoDisponivel();
           aux.setStatusAgendamento(EnumAgendamentoStatus.AGENDAMENTO_SOLICITADO);
           facade.updateAgendamento(aux);
           //telaExibirSolicitacoes.exportarDados(aux.getPaciente());
        }*/
       }
        /*pacientes = facade.findByMatriculaPaciente(ag.getPaciente().getMatricula());
        if (!pacientes.isEmpty()) {
                Paciente pacienteSelecionado = pacientes.get(0);
                Agendamento agendamentoSelecionado = agendamentos.get(0);
                try {
//                    agendamento = facade.
                    agendamentoSelecionado.setNomePaciente(pacienteSelecionado.getNome());
                    agendamentoSelecionado.setMatriculaPaciente(pacienteSelecionado.getMatricula());
                    agendamentoSelecionado.setId_paciente(pacienteSelecionado.getId());
                    agendamentoSelecionado.setStatusAgendamento(EnumAgendamentoStatus.AGENDAMENTO_SOLICITADO);
                    pacienteSelecionado.setAgendamento(agendamento);
                    facade.updateAgendamento(agendamentoSelecionado);
                    
                    telaExibirSolicitacoes.exportarDados(pacienteSelecionado);
                    
                }catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error, "Erro ao remarcar!", JOptionPane.ERROR_MESSAGE);
                }
        }*/

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
        TelaEspera t = new TelaEspera();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSupActionPerformed

    private void btnDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponiveisActionPerformed
   listarDisponiveis();
    }//GEN-LAST:event_btnDisponiveisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRemarcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRemarcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRemarcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRemarcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {            
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisponiveis;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAgenda;
    // End of variables declaration//GEN-END:variables

//metodo para linkar o id paciente ao seu agendamento 
    public Agendamento exportarDados(Agendamento agendamento){
       ag = agendamento;
       
       return ag;
       
   }    

        private void listarDisponiveis(){      
      DefaultTableModel dtmAgendamento =(DefaultTableModel) jTAgenda.getModel();
      dtmAgendamento.setRowCount(0);
      jTAgenda.repaint();
      //verificar se banco está vazio 
      if(facade.getAllAgendamento().isEmpty()){
          Object[] dados = {String.valueOf("sem informacoes"), String.valueOf("sem informacoes"),String.valueOf("sem informacoes")};
          dtmAgendamento.addRow(dados);
          
      }
      else{
         //lista todos os agendamentos do banco de dados
         List<Agendamento> agendamentos = facade.getAllAgendamentoDisponivel();
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
         
        //System.out.println("ID do paciente que logou:"+ paci.getId()+ "\nID do agendamento do paciente logado: "+ agendamento.getPaciente().getId());
       //mostrar todos os agendamentos 
        for(Agendamento agendamento : agendamentos) {            
              Calendar data = agendamento.getDataAgendamento();
              LocalTime hora = agendamento.getHoraAgendamento();
              String Time = agendamento.getHoraAgendamento().toString();
            

              // Adiciona as datas e horas à tabela
              dtmAgendamento.addRow(new Object[]{String.valueOf(agendamento.getId()),dateFormat.format(data.getTime()), Time});
       }
     }
  }
    
}
