package programaloja;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoCliente = new javax.swing.JButton();
        BotaoProduto = new javax.swing.JButton();
        BotaoFuncionario = new javax.swing.JButton();
        BotaoFornecedor = new javax.swing.JButton();
        BotaSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(143, 210, 253));

        BotaoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaloja/Icone Cliente.png"))); // NOI18N
        BotaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoCliente);

        BotaoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaloja/Ícone Produto.png"))); // NOI18N
        BotaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoProduto);

        BotaoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaloja/Funcionário Maior.png"))); // NOI18N
        BotaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFuncionarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoFuncionario);

        BotaoFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaloja/Fornecedor.png"))); // NOI18N
        BotaoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(BotaoFornecedor);

        BotaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programaloja/Icone Fechar.png"))); // NOI18N
        BotaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaSairActionPerformed(evt);
            }
        });
        jPanel1.add(BotaSair);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 150)); // NOI18N
        jLabel2.setText("Sistema");
        jPanel1.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 150)); // NOI18N
        jLabel1.setText("Loja");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        jMenu1.setText("Arquivo");

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setText("Funcionário");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Fornecedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("?");

        jMenuItem4.setText("Sobre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFornecedorActionPerformed
        
        FormFornecedor frame = new FormFornecedor();
        frame.setVisible(true);
        
    }//GEN-LAST:event_BotaoFornecedorActionPerformed

    private void BotaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaSairActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_BotaSairActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        FormProduto frame = new FormProduto();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        FormCliente frame = new FormCliente();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BotaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoClienteActionPerformed
        
        FormCliente frame = new FormCliente();
        frame.setVisible(true);
        
    }//GEN-LAST:event_BotaoClienteActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        FormFuncionario frame = new FormFuncionario();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void BotaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFuncionarioActionPerformed
        
        FormFuncionario frame = new FormFuncionario();
        frame.setVisible(true);
        
    }//GEN-LAST:event_BotaoFuncionarioActionPerformed

    private void BotaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProdutoActionPerformed
        
        FormProduto frame = new FormProduto();
        frame.setVisible(true);
        
    }//GEN-LAST:event_BotaoProdutoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        
        FormFornecedor frame = new FormFornecedor();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        Sobre frame = new Sobre();
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaSair;
    private javax.swing.JButton BotaoCliente;
    private javax.swing.JButton BotaoFornecedor;
    private javax.swing.JButton BotaoFuncionario;
    private javax.swing.JButton BotaoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
