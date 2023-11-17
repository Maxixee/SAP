/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.paciente.view;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.solicitacao.model.Solicitacao;
import br.com.ifba.solicitacao.view.TelaExibirSolicitacoes;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author andre
 */
@Component
public class TelaCadastrarPaciente extends javax.swing.JFrame {
    
    @Autowired
    private IFacade facade;
    
    @Autowired
    private TelaExibirSolicitacoes telaExibirSolicitacoes;
    
    private List<Paciente> pacientes;
    private List<Agendamento> agendamentos;
    
    private List<Aluno> alunos;
    private Aluno aluno;
    
    private Paciente paciente;
    
    Solicitacao solicitacao;
    
    
    @PostConstruct
    public void init() {
        preencheComboBoxNome();
    }
    
    public TelaCadastrarPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);   
        // Fecha a tela sem encerrar todo o sistema
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public void preencheComboBoxNome() {
        alunos = facade.getAllAluno();
        DefaultComboBoxModel combo = (DefaultComboBoxModel) cbxNome.getModel();
        combo.removeAllElements();
        
        for (Aluno a: alunos) {
            combo.addElement(a.getNome());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGerenciar = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        cbxNome = new javax.swing.JComboBox<>();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CADASTRAR PACIENTE");

        jLabel2.setText("Nome:");

        jLabel3.setText("Matricula:");

        btnGerenciar.setText("Gerenciar");
        btnGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarActionPerformed(evt);
            }
        });

        btnSolicitar.setText("Cadastrar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        cbxNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxNomeMouseClicked(evt);
            }
        });
        cbxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNomeActionPerformed(evt);
            }
        });

        txtMatricula.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMatricula)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(59, 59, 59)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarActionPerformed
        this.telaExibirSolicitacoes.inserirDadosTela();
        this.telaExibirSolicitacoes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGerenciarActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        
//        solicitacao = new Solicitacao();
        paciente = new Paciente();
        
        Object selectedNome = cbxNome.getSelectedItem();
        
        String matricula = txtMatricula.getText();
        
        if (selectedNome != null) {
            alunos = facade.findByMatricula(matricula);
            if (!alunos.isEmpty()) {
                Aluno alunoSelecionado = alunos.get(0);
                try {
                    paciente.setNome(alunoSelecionado.getNome());
                    paciente.setMatricula(alunoSelecionado.getMatricula());
                    paciente.setAluno(alunoSelecionado);
                    paciente.setCpf(alunoSelecionado.getCpf());
                    paciente.setEmail(alunoSelecionado.getEmail());
                    paciente.setTelefone(alunoSelecionado.getTelefone());
                    paciente.setNomeResponsavel(alunoSelecionado.getNomeResponsavel());
                    this.facade.savePaciente(paciente);
                    alunoSelecionado.setPaciente(paciente);
                    facade.updateAluno(alunoSelecionado);
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(null, error, "Erro ao cadastrar!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            Exception error = null;
            JOptionPane.showMessageDialog(null, error, "O campo nome está vazio!", JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose();
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void cbxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNomeActionPerformed
        Object selectedValue = cbxNome.getSelectedItem();
        
        if (selectedValue != null) {
            String selecionado = selectedValue.toString();
            alunos = facade.findByNome(selecionado);

            if (!alunos.isEmpty()) {
                Aluno alunoSelecionado = alunos.get(0);
                txtMatricula.setText(alunoSelecionado.getMatricula());
            }
        }    
    }//GEN-LAST:event_cbxNomeActionPerformed

    private void cbxNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxNomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNomeMouseClicked

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerenciar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}