package views;

import javax.swing.JOptionPane;
import metodosEstaticos.encriptarMD5;
import models.guardarPreguntasModel;

public class cuestionario extends javax.swing.JDialog {

    guardarPreguntasModel guardar;

    public cuestionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(1040, 730);
        setLocationRelativeTo(this);
        setResizable(false);
        txtTotalPreguntas.setText(String.valueOf(encriptarMD5.totalPrengutas()));
        TextAreaPrincipal.setLineWrap(true);
    }

    private boolean validarCampos() {
        boolean resp = false;

        if (TextAreaPrincipal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar La pregunta");
            TextAreaPrincipal.requestFocus();
        } else if (txtRespuesta1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar La la respuesta 1");
            txtRespuesta1.requestFocus();
        } else if (txtRespuesta2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar La la respuesta 2");
            txtRespuesta2.requestFocus();
        } else if (txtRespuesta3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar La la respuesta 3");
            txtRespuesta3.requestFocus();
        } else if (txtRespuesta4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar La la respuesta 4");
            txtRespuesta4.requestFocus();
        } else {
            resp = true;
        }

        return resp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuestaCorrecta = new javax.swing.ButtonGroup();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaPrincipal = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalPreguntas = new javax.swing.JTextField();
        Radio1 = new javax.swing.JRadioButton();
        txtRespuesta1 = new javax.swing.JTextField();
        Radio2 = new javax.swing.JRadioButton();
        txtRespuesta2 = new javax.swing.JTextField();
        Radio3 = new javax.swing.JRadioButton();
        txtRespuesta3 = new javax.swing.JTextField();
        Radio4 = new javax.swing.JRadioButton();
        txtRespuesta4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRonda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPremio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextAreaPrincipal.setColumns(20);
        TextAreaPrincipal.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TextAreaPrincipal.setRows(5);
        jScrollPane1.setViewportView(TextAreaPrincipal);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 920, 140));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Preguntas:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nota:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 30));

        txtTotalPreguntas.setEnabled(false);
        panel1.add(txtTotalPreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 60, 30));

        respuestaCorrecta.add(Radio1);
        panel1.add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 20, 30));
        panel1.add(txtRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 410, 30));

        respuestaCorrecta.add(Radio2);
        panel1.add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 20, 30));
        panel1.add(txtRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 410, 30));

        respuestaCorrecta.add(Radio3);
        panel1.add(Radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 20, 30));
        panel1.add(txtRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 410, 30));

        respuestaCorrecta.add(Radio4);
        panel1.add(Radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 20, 30));
        panel1.add(txtRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 410, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Tiene cuatro espacios para escribir opciones de respuesta, es decir escribe en 3 de los espacios en blanco\nrespuestas incorrectas y en el otro la respuesta correcta, que ademas la marcaras con el circulo que tiene\nen la parte izquierda. para asi confirmar que es la respuesta correcta  a la pregunta. ");
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 920, 90));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escriba La Pregunta");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 30));

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Escriba Las Respuestas");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, 30));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ronda:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 30));

        txtCategoria.setEnabled(false);
        panel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 50, 30));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Premio:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardar.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 120, 50));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 120, 50));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, 30));

        txtRonda.setEnabled(false);
        panel1.add(txtRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 50, 30));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puntos");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, -1, 30));

        txtPremio.setEnabled(false);
        panel1.add(txtPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 50, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 255, 51));
        btnLimpiar.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        boolean resp = validarCampos();

        if (resp) {
            
            int num = 0;
            if (Radio1.isSelected()) {
                num = 1;
            } else if (Radio2.isSelected()) {
                num = 2;
            } else if (Radio3.isSelected()) {
                num = 3;
            } else if (Radio4.isSelected()) {
                num = 4;
            }
            
            if (num == 0) {
                JOptionPane.showMessageDialog(null, "OJO...POR FAVOR MARQUE LA OPCION CORRECTA EN EL CIRCULO AL LADO DE LA RESPUESTA");
            } else {

                guardar = new guardarPreguntasModel(TextAreaPrincipal.getText(), txtRespuesta1.getText(), txtRespuesta2.getText(), txtRespuesta3.getText(), txtRespuesta4.getText(), Integer.parseInt(txtCategoria.getText()), Integer.parseInt(txtPremio.getText()), Integer.parseInt(txtRonda.getText()), num);

                if (guardar.guardarPreguntas()) {

                    JOptionPane.showMessageDialog(null, "Pregunstas GUARDADAS con !Exito¡");
                    txtTotalPreguntas.setText(String.valueOf(encriptarMD5.totalPrengutas()));
                    btnGuardar.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudieron guardar Preguntas");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        TextAreaPrincipal.setText(null);
        txtRespuesta1.setText(null);
        txtRespuesta2.setText(null);
        txtRespuesta3.setText(null);
        txtRespuesta4.setText(null);
        respuestaCorrecta.clearSelection();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cuestionario dialog = new cuestionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JRadioButton Radio4;
    private javax.swing.JTextArea TextAreaPrincipal;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.ButtonGroup respuestaCorrecta;
    public javax.swing.JTextField txtCategoria;
    public javax.swing.JTextField txtPremio;
    private javax.swing.JTextField txtRespuesta1;
    private javax.swing.JTextField txtRespuesta2;
    private javax.swing.JTextField txtRespuesta3;
    private javax.swing.JTextField txtRespuesta4;
    public javax.swing.JTextField txtRonda;
    public javax.swing.JTextField txtTotalPreguntas;
    // End of variables declaration//GEN-END:variables
}
