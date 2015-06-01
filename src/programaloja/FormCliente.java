package programaloja;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCliente extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public FormCliente() {
        initComponents();
        setDefaultCloseOperation(FormCliente.HIDE_ON_CLOSE);
        model = (DefaultTableModel)Tabela.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BotaoEditar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CampotxtNome = new javax.swing.JTextField();
        CampotxtEndereço = new javax.swing.JTextField();
        CampotxtNumero = new javax.swing.JTextField();
        CampotxtCidade = new javax.swing.JTextField();
        CampotxtBairro = new javax.swing.JTextField();
        CampotxtCPF = new javax.swing.JTextField();
        CampotxtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(143, 210, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço", "Número", "Cidade", "Bairro", "CPF", "Telefone"
            }
        ));
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 620, 100));

        BotaoEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 132, 57));

        BotaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 132, 57));

        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 132, 57));

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 132, 57));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Telefone:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Número:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cidade:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bairro:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("CPF:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        CampotxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 240, 30));

        CampotxtEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtEndereçoActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtEndereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 240, 30));

        CampotxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtNumeroActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 30));

        CampotxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtCidadeActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 240, 30));

        CampotxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtBairroActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 240, 30));

        CampotxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtCPFActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 240, 30));

        CampotxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("Cadastro de Cliente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CampotxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtNomeActionPerformed
        
    }//GEN-LAST:event_CampotxtNomeActionPerformed

    private void CampotxtEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtEndereçoActionPerformed
        
    }//GEN-LAST:event_CampotxtEndereçoActionPerformed

    private void CampotxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtNumeroActionPerformed
       
    }//GEN-LAST:event_CampotxtNumeroActionPerformed

    private void CampotxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtCidadeActionPerformed
        
    }//GEN-LAST:event_CampotxtCidadeActionPerformed

    private void CampotxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtBairroActionPerformed
        
    }//GEN-LAST:event_CampotxtBairroActionPerformed

    private void CampotxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtCPFActionPerformed
        
    }//GEN-LAST:event_CampotxtCPFActionPerformed

    private void CampotxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtTelefoneActionPerformed
        
    }//GEN-LAST:event_CampotxtTelefoneActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
    
        CampotxtNome.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 0)));
        CampotxtEndereço.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 1)));
        CampotxtNumero.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 2)));
        CampotxtCidade.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 3)));
        CampotxtBairro.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 4)));
        CampotxtCPF.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 5)));
        CampotxtTelefone.setText(String.valueOf(model.getValueAt(Tabela.getSelectedRow(), 6)));
        
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

        Cliente cli = new Cliente();

        cli.setNome(CampotxtNome.getText());
        cli.setEndereco(CampotxtEndereço.getText());
        cli.setNumero(Integer.parseInt(CampotxtNumero.getText()));
        cli.setCidade(CampotxtCidade.getText());
        cli.setBairro(CampotxtBairro.getText());
        cli.setCpf(CampotxtCPF.getText());
        cli.setTelefone(CampotxtTelefone.getText());

        model.insertRow(model.getRowCount(), new Object[]  {cli.getNome(),cli.getEndereco(),cli.getNumero(),cli.getCidade(),cli.getBairro(),cli.getCpf(),cli.getTelefone()});

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed

        model.setValueAt(CampotxtNome.getText(),Tabela.getSelectedRow(),0);
        model.setValueAt(CampotxtEndereço.getText(),Tabela.getSelectedRow(),1);
        model.setValueAt(CampotxtNumero.getText(),Tabela.getSelectedRow(),2);
        model.setValueAt(CampotxtCidade.getText(),Tabela.getSelectedRow(),3);
        model.setValueAt(CampotxtBairro.getText(),Tabela.getSelectedRow(),4);
        model.setValueAt(CampotxtCPF.getText(),Tabela.getSelectedRow(),5);
        model.setValueAt(CampotxtTelefone.getText(),Tabela.getSelectedRow(),6);

    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed

        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION){
            model.removeRow((Tabela.getSelectedRow()));
        }
        
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed

        CampotxtNome.setText("");
        CampotxtEndereço.setText("");
        CampotxtNumero.setText("");
        CampotxtCidade.setText("");
        CampotxtBairro.setText("");
        CampotxtCPF.setText("");
        CampotxtTelefone.setText("");

    }//GEN-LAST:event_BotaoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JTextField CampotxtBairro;
    private javax.swing.JTextField CampotxtCPF;
    private javax.swing.JTextField CampotxtCidade;
    private javax.swing.JTextField CampotxtEndereço;
    private javax.swing.JTextField CampotxtNome;
    private javax.swing.JTextField CampotxtNumero;
    private javax.swing.JTextField CampotxtTelefone;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
