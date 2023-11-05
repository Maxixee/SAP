/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.paciente.view;

import br.com.ifba.TelaDeTestes;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.prontuario.view.ProntuarioView;
import java.awt.HeadlessException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author hcesa
 */
@Component
public class TelaExibirPacientes extends javax.swing.JFrame {
    @Autowired 
    private IFacade facade;

    @Autowired
    private TelaEdicaoPaciente telaEdicao;

    private List<Paciente> pacientes;

    @Autowired
    private ProntuarioView prontuarioView;

    /**
     * Creates new form TelaExibirPacientes
     */
    public TelaExibirPacientes() {
        initComponents();
        // Comando para iniciar a tela no centro do monitor
        this.setLocationRelativeTo(null);
        // Fecha a tela sem encerrar todo o sistema
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    // Método para atualizar a tabela na view
    @PostConstruct
    public void atualizarTabela() {
        try {
            this.pacientes = this.facade.getAllPaciente();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao buscar pacientes!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tabelaDados = (DefaultTableModel) tblTabela.getModel();
        tabelaDados.setNumRows(0);

        // Adiciona à tabela todos os pacientes
        for (Paciente paciente : pacientes) {
            tabelaDados.addRow(new Object[]{
                paciente.getId(),
                paciente.getNome(),
                paciente.getMatricula(),
                paciente.getNomeResponsavel(),
                paciente.getTelefone(),
                paciente.getEmail(),
                paciente.getCpf()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Matrícula", "Responsável", "Telefone", "Email", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnProntuario.setText("Criar Prontuario");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        // Obtém a linha selecionada da tabela.
        int linhaSelecionada = tblTabela.getSelectedRow();

        // Se for igual a -1, significa que não há linha selecionada.
        if (linhaSelecionada == - 1) {
            JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                    "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o id na linha selecionada e coluna zero.
        Long id = (Long) tblTabela.getValueAt(linhaSelecionada, 0);

        /*
               Tenta realizar a busca pelo id, se não ocorrer erros, mostra a tela de edição.
               Caso ocorra erro, mostra um JOptionPane.
         */
        try {
            Paciente paciente = this.facade.findByIdPaciente(id);
            this.telaEdicao.setPaciente(paciente);
            this.telaEdicao.setVisible(true);
            this.setVisible(false);
        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao tentar editar!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        int index = tblTabela.getSelectedRow();

        if (index == - 1) {
            JOptionPane.showMessageDialog(null, "Não há linha selecionada, tente novamente.",
                    "Erro ao selecionar linha!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        long id = (long) tblTabela.getValueAt(index, 0);
        Paciente selecionado = this.facade.findByIdPaciente(id);
        this.prontuarioView.setPaciente(selecionado);
        this.prontuarioView.setVisible(true);
    }//GEN-LAST:event_btnProntuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaExibirPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibirPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibirPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibirPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibirPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    // End of variables declaration//GEN-END:variables
}
