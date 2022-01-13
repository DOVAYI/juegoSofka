
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import models.jugarModel;
import views.ayuda;
import views.historial_ganadores;
import views.jugar;

public class login_usuario extends javax.swing.JDialog {

    private jugarModel jugarM;
    private jugar play;

    public login_usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        txtPerfil.requestFocus();
        setSize(775, 715);
        setResizable(false);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        txtPerfil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESO AL SISTEMA");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(167, 215, 232));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Gabriola", 1, 36))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 40, 30));

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BIENVENIDOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Gabriola", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Por favor escriba su nombre real ");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, 20));

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID O USUARIO:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));
        panel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 280, 30));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRES:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 30));

        btnJugar.setBackground(new java.awt.Color(51, 255, 0));
        btnJugar.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        panel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, 60));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 204));
        btnIngresar.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 160, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Historial de Ganadores y Ayuda del juego");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 380, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Por favor escriba su id o nombre usuario para el sistemas");
        panel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 400, 20));

        btnsalir.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        panel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 130, 50));

        txtPerfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPerfilKeyPressed(evt);
            }
        });
        panel1.add(txtPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 280, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Si desea crear juego de preguntas");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 330, 20));

        btnAyuda.setBackground(new java.awt.Color(0, 204, 204));
        btnAyuda.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setText("AYUDA");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        panel1.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 160, 60));

        btnHistorial.setBackground(new java.awt.Color(204, 0, 204));
        btnHistorial.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("HISTORIAL");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        panel1.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 160, 60));

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 690));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 770, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        login_registrar registrar = new login_registrar(null, true);
        registrar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de USUARIO no puede estar vacio");
            txtNombre.requestFocus();
        } else if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de NOMBRE no puede estar vacio");
            txtNombre.requestFocus();
        } else {
            jugarM = new jugarModel(txtPerfil.getText(), txtNombre.getText());
            if (jugarM.buscar()) {
                JOptionPane.showMessageDialog(null, "Este Id o Usuario ya existe. por favor utilice otro");
            } else {
                if (jugarM.guardar()) {
                    play = new jugar(null, true);
                    play.txtJugador.setText(txtNombre.getText());
                    play.setPerfil(txtPerfil.getText());
                    play.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error no se pudo Guardar jugador");
                }

            }
        }

    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        ayuda ayud = new ayuda(null, true);
        ayud.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        historial_ganadores historial = new historial_ganadores(null, true);
        historial.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void txtPerfilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerfilKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtPerfilKeyPressed

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
            java.util.logging.Logger.getLogger(login_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login_usuario dialog = new login_usuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnHistorial;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPerfil;
    // End of variables declaration//GEN-END:variables

}
