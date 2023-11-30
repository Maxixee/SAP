/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.paciente.view.TelaCadastrarAluno;
import br.com.ifba.paciente.view.TelaCadastrarPaciente;
import br.com.ifba.servidor.view.AtivaPsicologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wesley
 */
@Component
public class TelaMenuAdiministrador extends javax.swing.JFrame {
    
    @Autowired
    TelaMenuPaciente menuPaciente;

    @Autowired
    TelaMenuPsicologo menuPsicologo;
    
    @Autowired
    private AtivaPsicologo ativaPsicologo;

    @Autowired
    private TelaCadastrarAluno telaCadastrarAluno;

    @Autowired
    private TelaCadastrarPaciente telaCadastrarPaciente;
    /**
     * Creates new form TeleMenuAdiministrador
     */
    public TelaMenuAdiministrador() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        btnGerenciarPsicologo = new javax.swing.JButton();
        btnAçõesPsicologo = new javax.swing.JButton();
        btnAçõesPasciente = new javax.swing.JButton();
        btnCadastraAluno = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tela de Adiministrador");

        btnGerenciarPsicologo.setText("Gerenciar Psicologo");
        btnGerenciarPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarPsicologoActionPerformed(evt);
            }
        });

        btnAçõesPsicologo.setText("Ações de Psicologo");
        btnAçõesPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAçõesPsicologoActionPerformed(evt);
            }
        });

        btnAçõesPasciente.setText("Ações de Paciente");
        btnAçõesPasciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAçõesPascienteActionPerformed(evt);
            }
        });

        btnCadastraAluno.setText("Cadastra Aluno");
        btnCadastraAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraAlunoActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastra Paciente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGerenciarPsicologo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAçõesPsicologo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAçõesPasciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastraAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerenciarPsicologo)
                    .addComponent(btnCadastraAluno))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAçõesPasciente)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addComponent(btnAçõesPsicologo)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerenciarPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarPsicologoActionPerformed
        // TODO add your handling code here:
        this.ativaPsicologo.setVisible(true);
        //abrea tela que permite ativar e desativar os psicologos
    }//GEN-LAST:event_btnGerenciarPsicologoActionPerformed

    private void btnAçõesPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAçõesPsicologoActionPerformed
        // TODO add your handling code here:
        this.menuPsicologo.setVisible(true);
        //abre a tela de psicologo
    }//GEN-LAST:event_btnAçõesPsicologoActionPerformed

    private void btnAçõesPascienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAçõesPascienteActionPerformed
        // TODO add your handling code here:
        this.menuPaciente.setVisible(true);
        //abre a tela de paciente
    }//GEN-LAST:event_btnAçõesPascienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.telaCadastrarPaciente.setVisible(true);
        this.telaCadastrarPaciente.preencheComboBoxNome();
        //abre a tela de cadastra paciente
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastraAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraAlunoActionPerformed
        // TODO add your handling code here:
        this.telaCadastrarAluno.setVisible(true);
        //abre a tela de cadastra aluno
    }//GEN-LAST:event_btnCadastraAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuAdiministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdiministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdiministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuAdiministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdiministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAçõesPasciente;
    private javax.swing.JButton btnAçõesPsicologo;
    private javax.swing.JButton btnCadastraAluno;
    private javax.swing.JButton btnGerenciarPsicologo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
