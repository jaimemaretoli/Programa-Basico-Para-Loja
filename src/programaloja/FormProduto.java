package programaloja;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormProduto extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public FormProduto() {
        initComponents();
        setDefaultCloseOperation(FormCliente.HIDE_ON_CLOSE);
        model = (DefaultTableModel)TabelaProduto.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        BotaoEditar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampotxtCodigo = new javax.swing.JTextField();
        CampotxtNome = new javax.swing.JTextField();
        CampotxtMarca = new javax.swing.JTextField();
        CampotxtCValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(143, 210, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Marca", "Valor"
            }
        ));
        TabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 620, 100));

        BotaoEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 132, 57));

        BotaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 132, 57));

        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 132, 57));

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 132, 57));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Marca:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Valor:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        CampotxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 240, 30));

        CampotxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 240, 30));

        CampotxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 30));

        CampotxtCValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampotxtCValorActionPerformed(evt);
            }
        });
        jPanel2.add(CampotxtCValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("Cadastro de Produto");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutoMouseClicked

        

    }//GEN-LAST:event_TabelaProdutoMouseClicked

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        
        model.setValueAt(CampotxtCodigo.getText(),TabelaProduto.getSelectedRow(),0);
        model.setValueAt(CampotxtNome.getText(),TabelaProduto.getSelectedRow(),1);
        model.setValueAt(CampotxtMarca.getText(),TabelaProduto.getSelectedRow(),2);
        model.setValueAt(CampotxtCValor.getText(),TabelaProduto.getSelectedRow(),3);
        
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

        Produto prod = new Produto();

        prod.setCodigo(Integer.parseInt(CampotxtCodigo.getText()));
        prod.setNome(CampotxtNome.getText());
        prod.setMarca(CampotxtMarca.getText());
        prod.setValor(Double.parseDouble(CampotxtCValor.getText()));
        
        model.insertRow(model.getRowCount(), new Object[]  {prod.getCodigo(),prod.getNome(),prod.getMarca(),prod.getValor()});
        
        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        // Deixando os campos em branco
        CampotxtCodigo.setText("");
        CampotxtNome.setText("");
        CampotxtMarca.setText("");
        CampotxtCValor.setText("");

    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION){
            model.removeRow((TabelaProduto.getSelectedRow()));
        }

    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void CampotxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtCodigoActionPerformed

    }//GEN-LAST:event_CampotxtCodigoActionPerformed

    private void CampotxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtNomeActionPerformed

    }//GEN-LAST:event_CampotxtNomeActionPerformed

    private void CampotxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtMarcaActionPerformed

    }//GEN-LAST:event_CampotxtMarcaActionPerformed

    private void CampotxtCValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampotxtCValorActionPerformed

    }//GEN-LAST:event_CampotxtCValorActionPerformed

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
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JTextField CampotxtCValor;
    private javax.swing.JTextField CampotxtCodigo;
    private javax.swing.JTextField CampotxtMarca;
    private javax.swing.JTextField CampotxtNome;
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
