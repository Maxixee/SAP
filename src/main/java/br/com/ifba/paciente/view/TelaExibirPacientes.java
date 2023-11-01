/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.paciente.view;

//import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.paciente.model.Paciente;
import java.awt.HeadlessException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    /**
     * Creates new form TelaExibirPacientes
     */
    public TelaExibirPacientes() {
        initComponents();
        // Comando para iniciar a tela no centro do monitor
        this.setLocationRelativeTo(null);
    }
    
    // Método para atualizar a tabela na view
    @PostConstruct
    public void atualizarTabela() {
        try {
            this.pacientes = this.facade.getAllPaciente();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao buscar alunos!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tabelaDados = (DefaultTableModel) tblTabela.getModel();
        tabelaDados.setNumRows(0);
        
        // Adiciona à tabela todos os alunos
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
        jLabel2 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Matricula", "Responsável", "Telefone", "Email", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("PACIENTES CADASTRADOS");

        btnAtualizar.setText("Atualizar tabela");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtualizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(297, 297, 297)
                            .addComponent(jLabel2))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        atualizarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    // End of variables declaration//GEN-END:variables
}
