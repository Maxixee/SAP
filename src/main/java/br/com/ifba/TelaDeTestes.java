package br.com.ifba;

import br.com.ifba.agendamento.view.TelaAgendamento;
import br.com.ifba.paciente.view.TelaCadastroPaciente;

import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.paciente.view.TelaExibirPacientes;
import br.com.ifba.paciente.view.TelaPacienteSolicitacao;
import br.com.ifba.prontuario.view.ListaProntuarios;
import br.com.ifba.prontuario.view.ProntuarioView;


import br.com.ifba.teste.view.TesteView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TelaDeTestes extends javax.swing.JFrame {
    @Autowired
    private TesteView testeView;

    IFacade facade;
    @Autowired
    private TesteView telaTeste;
    
    @Autowired
    private ListaProntuarios telaListaProntuarios;
    //===
    @Autowired
    private ProntuarioView telaProntuario;

    @Autowired
    private TelaCadastroPaciente telaCadastro;
    
    @Autowired
    private TelaAgendamento telaAgendamento;
    
    @Autowired
    private TelaExibirPacientes telaExibirPacientes;

    @Autowired
    private TelaPacienteSolicitacao telaPacienteSolicitacao;

    
    public TelaDeTestes() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContainer = new javax.swing.JPanel();
        lblAlerta = new javax.swing.JLabel();
        btn09 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlContainer.setPreferredSize(new java.awt.Dimension(600, 500));

        lblAlerta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(204, 0, 0));
        lblAlerta.setText("ESSA É APENAS UMA TELA PARA REALIZAR TESTES NO SISTEMA.");

        btn09.setBackground(new java.awt.Color(0, 0, 0));
        btn09.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn09.setForeground(new java.awt.Color(255, 255, 255));
        btn09.setText("PACIENTE SOLICIT.");
        btn09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn09ActionPerformed(evt);
            }
        });

        btn05.setBackground(new java.awt.Color(0, 0, 0));
        btn05.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn05.setForeground(new java.awt.Color(255, 255, 255));
        btn05.setText("LISTA PRONTUARIOS");
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn07.setBackground(new java.awt.Color(0, 0, 0));
        btn07.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn07.setForeground(new java.awt.Color(255, 255, 255));
        btn07.setText("EDITA PACIENTE");
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });

        btn06.setBackground(new java.awt.Color(0, 0, 0));
        btn06.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn06.setForeground(new java.awt.Color(255, 255, 255));
        btn06.setText("AGENDAMENTO");
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });

        btn03.setBackground(new java.awt.Color(0, 0, 0));
        btn03.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn03.setForeground(new java.awt.Color(255, 255, 255));
        btn03.setText("CADASTRO PACIENTE");
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn08.setBackground(new java.awt.Color(0, 0, 0));
        btn08.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn08.setForeground(new java.awt.Color(255, 255, 255));
        btn08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn08ActionPerformed(evt);
            }
        });

        btn02.setBackground(new java.awt.Color(0, 0, 0));
        btn02.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn02.setForeground(new java.awt.Color(255, 255, 255));
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn04.setBackground(new java.awt.Color(0, 0, 0));
        btn04.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn04.setForeground(new java.awt.Color(255, 255, 255));
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });

        btn01.setBackground(new java.awt.Color(0, 0, 0));
        btn01.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn01.setForeground(new java.awt.Color(255, 255, 255));
        btn01.setText("TESTE");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lblAlerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlerta)
                .addGap(31, 31, 31)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn09, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(pnlContainer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn09ActionPerformed
        this.telaPacienteSolicitacao.setVisible(true);
    }//GEN-LAST:event_btn09ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        this.telaListaProntuarios.setVisible(true);
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        this.telaExibirPacientes.setVisible(true);
    }//GEN-LAST:event_btn07ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        this.telaAgendamento.setVisible(true);
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed

        this.telaCadastro.setVisible(true);
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn08ActionPerformed
         
    }//GEN-LAST:event_btn08ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed

    }//GEN-LAST:event_btn02ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
       
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        this.testeView.setVisible(true);
    }//GEN-LAST:event_btn01ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeTestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeTestes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JButton btn09;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
