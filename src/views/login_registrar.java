
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import models.ingresoModel;
import views.registra_datos_usuarios;

public class login_registrar extends javax.swing.JDialog {

    private ingresoModel ingresar;

    public login_registrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(712, 530);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        txtIdentificacion = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso Para Registro de Preguntas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 80, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRARSE");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 30));

        txtcontraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 280, 30));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        panel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 280, 30));

        btnRegistrarse.setBackground(new java.awt.Color(0, 0, 204));
        btnRegistrarse.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Aquí");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        panel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 120, 40));

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N° De Identificación:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 30));

        btnEntrar.setBackground(new java.awt.Color(0, 255, 0));
        btnEntrar.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, 40));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Gabriola", 0, 30)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        registra_datos_usuarios registraUsuario = new registra_datos_usuarios(null, true);
        registraUsuario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (txtIdentificacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Rellenar el campo IDENTIFICACIÓN");
        } else if (txtcontraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Rellenar el campo PASSWORD");
        } else {
            ingresar = new ingresoModel(txtcontraseña.getText(), txtIdentificacion.getText());
            if (ingresar.Buscar()) {

                ventanaMenu menu = new ventanaMenu();
                menu.setIdentificacion(Integer.parseInt(txtIdentificacion.getText()));
                menu.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIdentificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcontraseña.requestFocus();
        }
    }//GEN-LAST:event_txtIdentificacionKeyPressed

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
            java.util.logging.Logger.getLogger(login_registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login_registrar dialog = new login_registrar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JPasswordField txtcontraseña;
    // End of variables declaration//GEN-END:variables

}
