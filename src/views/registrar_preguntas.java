package views;

public class registrar_preguntas extends javax.swing.JDialog {

    public registrar_preguntas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(770, 490);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        btnCat5 = new javax.swing.JButton();
        btnCat1 = new javax.swing.JButton();
        btnCat2 = new javax.swing.JButton();
        btnCat3 = new javax.swing.JButton();
        btnCat4 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Preguntas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 3, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCat5.setBackground(new java.awt.Color(255, 51, 0));
        btnCat5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCat5.setForeground(new java.awt.Color(255, 255, 255));
        btnCat5.setText("Categoria 5");
        btnCat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat5ActionPerformed(evt);
            }
        });
        panel1.add(btnCat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 160, 40));

        btnCat1.setBackground(new java.awt.Color(0, 0, 204));
        btnCat1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCat1.setForeground(new java.awt.Color(255, 255, 255));
        btnCat1.setText("Categoria 1");
        btnCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat1ActionPerformed(evt);
            }
        });
        panel1.add(btnCat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 97, 170, 40));

        btnCat2.setBackground(new java.awt.Color(0, 255, 0));
        btnCat2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCat2.setForeground(new java.awt.Color(255, 255, 255));
        btnCat2.setText("Categoria 2");
        btnCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat2ActionPerformed(evt);
            }
        });
        panel1.add(btnCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, 40));

        btnCat3.setBackground(new java.awt.Color(0, 204, 204));
        btnCat3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCat3.setForeground(new java.awt.Color(255, 255, 255));
        btnCat3.setText("Categoria 3");
        btnCat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat3ActionPerformed(evt);
            }
        });
        panel1.add(btnCat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 160, 40));

        btnCat4.setBackground(new java.awt.Color(255, 0, 204));
        btnCat4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnCat4.setForeground(new java.awt.Color(255, 255, 255));
        btnCat4.setText("Categoria 4");
        btnCat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat4ActionPerformed(evt);
            }
        });
        panel1.add(btnCat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat5ActionPerformed
        cuestionario cuestiona = new cuestionario(null, true);
        cuestiona.txtRonda.setText("5");
        cuestiona.txtCategoria.setText("5");
        cuestiona.txtPremio.setText("50");
        cuestiona.setVisible(true);
    }//GEN-LAST:event_btnCat5ActionPerformed

    private void btnCat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat4ActionPerformed
        cuestionario cuestiona = new cuestionario(null, true);
        cuestiona.txtRonda.setText("4");
        cuestiona.txtCategoria.setText("4");
        cuestiona.txtPremio.setText("40");
        cuestiona.setVisible(true);
    }//GEN-LAST:event_btnCat4ActionPerformed

    private void btnCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat1ActionPerformed
        cuestionario cuestiona = new cuestionario(null, true);
        cuestiona.txtRonda.setText("1");
        cuestiona.txtCategoria.setText("1");
        cuestiona.txtPremio.setText("10");
        cuestiona.setVisible(true);
    }//GEN-LAST:event_btnCat1ActionPerformed

    private void btnCat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat2ActionPerformed
        cuestionario cuestiona = new cuestionario(null, true);
        cuestiona.txtRonda.setText("2");
        cuestiona.txtCategoria.setText("2");
        cuestiona.txtPremio.setText("20");
        cuestiona.setVisible(true);
    }//GEN-LAST:event_btnCat2ActionPerformed

    private void btnCat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat3ActionPerformed
        cuestionario cuestiona = new cuestionario(null, true);
        cuestiona.txtRonda.setText("3");
        cuestiona.txtCategoria.setText("3");
        cuestiona.txtPremio.setText("30");
        cuestiona.setVisible(true);
    }//GEN-LAST:event_btnCat3ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(registrar_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar_preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registrar_preguntas dialog = new registrar_preguntas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCat1;
    private javax.swing.JButton btnCat2;
    private javax.swing.JButton btnCat3;
    private javax.swing.JButton btnCat4;
    private javax.swing.JButton btnCat5;
    private javax.swing.JButton btnSalir;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
