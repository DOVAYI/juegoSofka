
import javax.swing.JOptionPane;
import models.cambiarClaveModel;

public class cambiar_clave extends javax.swing.JDialog {

    cambiarClaveModel clave;

    public cambiar_clave(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        btnregresar = new javax.swing.JButton();
        jPasswordConfcontraseña = new javax.swing.JPasswordField();
        jPasswordContraseña = new javax.swing.JPasswordField();
        panel1 = new org.edisoncor.gui.panel.Panel();
        prueba3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTION DE CLAVE DE USUARIOS EN EL SISTEMA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(167, 215, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnguardar.setBackground(new java.awt.Color(51, 51, 255));
        btnguardar.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 247, 30));

        btnregresar.setBackground(new java.awt.Color(255, 255, 255));
        btnregresar.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(0, 0, 204));
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));
        jPanel1.add(jPasswordConfcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 240, 30));
        jPanel1.add(jPasswordContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 240, 30));

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambiar Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gabriola", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prueba3.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(prueba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 70, 20));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nueva Contraseña");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirme Contraseña");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 30));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        String password, confirmarPassword;

        if (jPasswordContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nueva Contraseña no puede estar vacio");
        } else if (jPasswordConfcontraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Confirme Contraseña no puede estar vacio");
        } else {

            password = String.valueOf(jPasswordContraseña.getPassword());
            confirmarPassword = String.valueOf(jPasswordConfcontraseña.getPassword());

            if (password.equals(confirmarPassword)) {

                clave = new cambiarClaveModel(password, Integer.parseInt(txtUsuario.getText()));
                if (clave.cambiarPassword()) {
                    JOptionPane.showMessageDialog(null, "Se actualizo Con Exito en la Contraseña", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error... No se pudo actualizar contraseña!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "las contraseñas no coinciden");
                jPasswordConfcontraseña.requestFocus();
            }
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        dispose();

    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(cambiar_clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiar_clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiar_clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiar_clave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cambiar_clave dialog = new cambiar_clave(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordConfcontraseña;
    private javax.swing.JPasswordField jPasswordContraseña;
    private org.edisoncor.gui.panel.Panel panel1;
    public javax.swing.JLabel prueba3;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
