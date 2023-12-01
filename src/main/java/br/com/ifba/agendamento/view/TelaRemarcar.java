/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.agendamento.view;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.agendamento.service.IServiceAgendamento;
import br.com.ifba.agendamento.service.ServiceAgendamento;
import br.com.ifba.infrastructure.service.IFacade;
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
    Agendamento ag = new Agendamento();
    private List<Agendamento> agendamentos;
    Agendamento agendamento;
    @PostConstruct
    public void init() {
        preencheComboBoxData();
    }
    public TelaRemarcar() {
        initComponents();
        
        // Fecha a tela sem encerrar todo o sistema
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
 
    }
    /*private void listarData(){      
      DefaultComboBoxModel<String> comboModel = (DefaultComboBoxModel<String>) cbxData.getModel();
      comboModel.removeAllElements();
         
         //lista todos os agendamentos do banco de dados
         List<Agendamento> agendamentos = facade.getAllAgendamento();
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

       //mostrar todos os agendamentos disponiveis
        for(Agendamento agendamento : agendamentos) {
              Calendar data = agendamento.getDataAgendamento();
            

              // Adiciona as datas e horas ao combo box
              String displayText = ""+data.getTime();
              comboModel.addElement(displayText);
              
       }
     }
    
    private void listarHora(){      
      DefaultComboBoxModel<String> comboModel = (DefaultComboBoxModel<String>) cbxHora.getModel();
      comboModel.removeAllElements();
         
         //lista todos os agendamentos do banco de dados
         List<Agendamento> agendamentos = facade.getAllAgendamento();
         SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

       //mostrar todos os agendamentos disponiveis
        for(Agendamento agendamento : agendamentos) {
              LocalTime hora = agendamento.getHoraAgendamento();
              String Time = agendamento.getHoraAgendamento().toString();
            

              // Adiciona as datas e horas ao combo box
              String displayText = "" + Time;
              comboModel.addElement(displayText);
              
       }
     }*/
    
    public void preencheComboBoxData() {
        // Seleciona apenas os agendamentos com status disponivel
        agendamentos = facade.getAllAgendamentoDisponivel();
        DefaultComboBoxModel<String> comboModel = (DefaultComboBoxModel<String>) cbxData.getModel();
        comboModel.removeAllElements();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm"); 

        for(Agendamento ag : agendamentos) {
            String dataAgendamentoString = dateFormat.format(ag.getDataAgendamento().getTime());
            String horaAgendamentoString = ag.getHoraAgendamento().format(timeFormat);

            String displayText = dataAgendamentoString + " - " + horaAgendamentoString;
            comboModel.addElement(displayText);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        cbxData = new javax.swing.JComboBox<>();
        btnMostraData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nova data disponivel");

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

        cbxData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataActionPerformed(evt);
            }
        });

        btnMostraData.setText("Disponiveis");
        btnMostraData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(147, 147, 147)
                                .addComponent(btnSup))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnMostraData)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostraData)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSup)
                    .addComponent(btnSalvar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        /*Date dataSelecionada = txtData.getDate();

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String timePickerValue = timePicker1.getText();
        Date horaSelecionada;

        try {
            horaSelecionada = timeFormat.parse(timePickerValue);
        } catch (ParseException ex) {
            Logger.getLogger(TelaAgendamento.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.setTime(dataSelecionada);

        Calendar horaCalendar = Calendar.getInstance();
        horaCalendar.setTime(horaSelecionada);

        
        ag.setDataAgendamento(dataCalendar);

        // Obtenha a hora em formato LocalTime
        int hora = horaCalendar.get(Calendar.HOUR_OF_DAY);
        int minuto = horaCalendar.get(Calendar.MINUTE);
        LocalTime horaAgendamento = LocalTime.of(hora, minuto);

        ag.setHoraAgendamento(horaAgendamento);
        
        //recebendo o id do paciente que fez o agendamento
        //ag.setId_paciente(i);
        System.out.println("valor de  i = "+i);*/
        ag.setDataAgendamento((Calendar) cbxData.getSelectedItem());
        ag.setHoraAgendamento((LocalTime) cbxData.getSelectedItem());
        
        facade.updateAgendamento(ag);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
        TelaEspera t = new TelaEspera();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSupActionPerformed

    private void cbxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataActionPerformed
    
    }//GEN-LAST:event_cbxDataActionPerformed

    private void btnMostraDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraDataActionPerformed
        preencheComboBoxData();
    }//GEN-LAST:event_btnMostraDataActionPerformed

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
    private javax.swing.JButton btnMostraData;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSup;
    private javax.swing.JComboBox<String> cbxData;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

//metodo para linkar o id paciente ao seu agendamento 
    public Agendamento exportarDados(Agendamento agendamento){
       ag = agendamento;
       
       return ag;
       
   }    

    
}
