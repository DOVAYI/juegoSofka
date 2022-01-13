package views;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import models.registrarUsuarioModel;

public class registra_datos_usuarios extends javax.swing.JDialog {

    registrarUsuarioModel registrar;

    public registra_datos_usuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(690, 590);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        Conpassword = new javax.swing.JPasswordField();
        Password = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Usuarios", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 3, 28), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Celular:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 195, -1, 30));

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PassWord:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 305, -1, 30));

        jLabel7.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar PassWord: ");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 360, -1, 30));

        jLabel10.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("solo acepta numeros");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 30));

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
        });
        panel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 330, 30));

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
        });
        panel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 330, 30));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        panel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 195, 330, 30));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        panel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, 330, 30));
        panel1.add(Conpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 330, 30));

        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });
        panel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 305, 330, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardar.setFont(new java.awt.Font("Gabriola", 0, 30)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 170, 50));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Gabriola", 0, 30)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 170, 50));

        jLabel11.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Identificación:");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 85, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtIdentificacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo IDENTIFICACIÓN  es obligatorio");
            txtIdentificacion.requestFocus();
        } else if (txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo NOMBRES es obligatorio");
            txtNombres.requestFocus();
        } else {
            if (Password.getText().equals(Conpassword.getText())) {

                registrar = new registrarUsuarioModel(Integer.parseInt(txtIdentificacion.getText()), txtNombres.getText(), txtCorreo.getText(), txtCelular.getText(), Password.getText());

                if (registrar.buscarId()) {
                    JOptionPane.showMessageDialog(null, "Este Numero de identificación ya Existe");
                } else {
                    if (registrar.guardar()) {
                        JOptionPane.showMessageDialog(null, "Datos Guardados con !Exito¡");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se Pudo Guardar Datos");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIdentificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombres.requestFocus();
        }

    }//GEN-LAST:event_txtIdentificacionKeyPressed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Password.requestFocus();
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Conpassword.requestFocus();
        }

    }//GEN-LAST:event_PasswordKeyPressed

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
            java.util.logging.Logger.getLogger(registra_datos_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registra_datos_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registra_datos_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registra_datos_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registra_datos_usuarios dialog = new registra_datos_usuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField Conpassword;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
