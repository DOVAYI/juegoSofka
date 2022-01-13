package views;

import conexionBD.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodosEstaticos.encriptarMD5;
import models.jugarModel;

public class jugar extends javax.swing.JDialog {

    private String perfil;
    private conectar conexion;
    private int ronda;
    private String sql;
    private String correctaOp;
    private jugarModel jm;

    public jugar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conexion = new conectar();
        setSize(1040, 730);
        setLocationRelativeTo(this);
        setResizable(false);
        TextAreaPrincipal.setLineWrap(true);
        setRonda(1);
        mostrarPreguntasRespuestas();

    }

    private void mostrarPreguntasRespuestas() {

        boolean resp = false;
        while (resp == false) {
            int numAleatorio = numeroRandom();
            sql = "SELECT * FROM preguntas WHERE ronda=" + getRonda() + " AND idp=" + numAleatorio;
            ResultSet rst = conexion.select(sql);
            try {
                while (rst.next() && resp == false) {
                    
                    TextAreaPrincipal.setText(rst.getString("nombre"));
                    txtRespuesta1.setText(rst.getString("resp1"));
                    txtRespuesta2.setText(rst.getString("resp2"));
                    txtRespuesta3.setText(rst.getString("resp3"));
                    txtRespuesta4.setText(rst.getString("resp4"));
                    txtPremio.setText(rst.getString("premio"));
                    txtRonda.setText(String.valueOf(getRonda()));
                    int aux = rst.getInt("correcta");
                    correctaOp = rst.getString((5 + aux));

                    buscarAcumulado();
                    resp = true;

                }
            } catch (SQLException e) {

            }
        }

    }

    private void buscarAcumulado() {

        sql = "SELECT acumulado FROM jugador WHERE nombrePerfil='" + getPerfil() + "'";
        ResultSet rst = conexion.select(sql);
        try {

            while (rst.next()) {
                txtAcumulado.setText(rst.getString("acumulado"));
            }

        } catch (SQLException e) {

        }

    }

    private int numeroRandom() {
        int numero = (int) (Math.random() * ((encriptarMD5.totalPrengutas() - 1) + 1)) + 1;

        return numero;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuestaCorrecta = new javax.swing.ButtonGroup();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaPrincipal = new javax.swing.JTextArea();
        Radio1 = new javax.swing.JRadioButton();
        txtRespuesta1 = new javax.swing.JTextField();
        Radio2 = new javax.swing.JRadioButton();
        txtRespuesta2 = new javax.swing.JTextField();
        Radio3 = new javax.swing.JRadioButton();
        txtRespuesta3 = new javax.swing.JTextField();
        Radio4 = new javax.swing.JRadioButton();
        txtRespuesta4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRonda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPremio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtJugador = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextAreaPrincipal.setColumns(20);
        TextAreaPrincipal.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TextAreaPrincipal.setRows(5);
        TextAreaPrincipal.setEnabled(false);
        jScrollPane1.setViewportView(TextAreaPrincipal);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 920, 140));

        respuestaCorrecta.add(Radio1);
        panel1.add(Radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 20, 30));

        txtRespuesta1.setEnabled(false);
        panel1.add(txtRespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 410, 30));

        respuestaCorrecta.add(Radio2);
        panel1.add(Radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 20, 30));

        txtRespuesta2.setEnabled(false);
        panel1.add(txtRespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 410, 30));

        respuestaCorrecta.add(Radio3);
        panel1.add(Radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 20, 30));

        txtRespuesta3.setEnabled(false);
        panel1.add(txtRespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 410, 30));

        respuestaCorrecta.add(Radio4);
        panel1.add(Radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 20, 30));

        txtRespuesta4.setEnabled(false);
        panel1.add(txtRespuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 410, 30));

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ronda:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, 30));

        txtAcumulado.setEnabled(false);
        panel1.add(txtAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 50, 30));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Premio:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 204));
        btnGuardar.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Responder");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 120, 50));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Puntos Acumulados");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, 30));

        txtRonda.setEnabled(false);
        panel1.add(txtRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 50, 30));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puntos");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, -1, 30));

        txtPremio.setEnabled(false);
        panel1.add(txtPremio, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 50, 30));

        btnLimpiar.setBackground(new java.awt.Color(204, 51, 0));
        btnLimpiar.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Retirarse");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 110, 50));

        txtJugador.setEditable(false);
        txtJugador.setBackground(new java.awt.Color(50, 231, 252));
        txtJugador.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        txtJugador.setForeground(new java.awt.Color(255, 255, 255));
        txtJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(txtJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 390, 35));

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USUARIO 1.png"))); // NOI18N
        jLabel9.setText("Jugador");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 167, 56));

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String respuesta = "";
        
        if (!Radio1.isSelected() && !Radio2.isSelected() && !Radio3.isSelected() && !Radio4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opción");
        } else {
            
            if (Radio1.isSelected()) {
                respuesta = txtRespuesta1.getText();
            } else if (Radio2.isSelected()) {
                respuesta = txtRespuesta2.getText();
            } else if (Radio3.isSelected()) {
                respuesta = txtRespuesta3.getText();
            } else if (Radio4.isSelected()) {
                respuesta = txtRespuesta4.getText();
            }

            if (respuesta.equals(correctaOp)) {
                setRonda(getRonda() + 1);

                jm = new jugarModel(getPerfil(), txtJugador.getText());
                jm.guardarAcumulado(Integer.parseInt(txtPremio.getText()));
                if (getRonda() > 5) {
                    JOptionPane.showMessageDialog(null, "yuuuujuuu HAS GANADO EL JUEGO,tu nombre aparecera en el historial de ganadores del juego");
                    conexion.cerrarConexion();
                    this.dispose();
                } else {
                    mostrarPreguntasRespuestas();
                    respuestaCorrecta.clearSelection();
                }
            } else {
                JOptionPane.showMessageDialog(null, "ohhh Perdistes... juego finalizado");
                this.dispose();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro de desea Retirarse, perdera los puntos acumulados y no podra volver a jugar");
        if (respuesta == 0) {
            conexion.cerrarConexion();
            this.dispose();
        }
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
                jugar dialog = new jugar(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.ButtonGroup respuestaCorrecta;
    public javax.swing.JTextField txtAcumulado;
    public javax.swing.JTextField txtJugador;
    public javax.swing.JTextField txtPremio;
    private javax.swing.JTextField txtRespuesta1;
    private javax.swing.JTextField txtRespuesta2;
    private javax.swing.JTextField txtRespuesta3;
    private javax.swing.JTextField txtRespuesta4;
    public javax.swing.JTextField txtRonda;
    // End of variables declaration//GEN-END:variables

}
