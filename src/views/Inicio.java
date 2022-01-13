
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicio extends javax.swing.JDialog {

    private int auxiliar = 0;
    private boolean realizado = false;
    private hilo ejecutar;

    public Inicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        ejecutar = new hilo();
        this.setSize(650, 448);
        Inicio.this.getRootPane().setOpaque(false);
        Inicio.this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        Inicio.this.setBackground(new Color(0, 0, 0, 0));
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        barra = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "JUEGO DE PREGUNTAS Y RESPUESTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gabriola", 3, 24), new java.awt.Color(255, 102, 0))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 540, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DOVAYIsoft @Luis Alfredo Romero Cuello");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 170, 20));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 440));
        panel1.getAccessibleContext().setAccessibleName("SISTEMA DE GESTION DE  PAGOS ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        if (realizado == false) {
            realizado = true;
            barra.setMaximum(49);
            barra.setMinimum(0);
            barra.setStringPainted(true);
            barra.setForeground(new Color(7, 250, 246));
            ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inicio dialog = new Inicio(new javax.swing.JFrame(), true);
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

    private class hilo extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    auxiliar++;
                    barra.setValue(auxiliar);
                    repaint();
                    switch (auxiliar) {
                        case 3:
                            text.setText("Cargando...");
                            text.setForeground(Color.white);

                            break;
                        case 20:
                            text.setText("Leyendo preferencias...");

                            break;
                        case 30:
                            text.setText("Cargando programa...");

                            break;
                        case 50:
                            text.setText("Carga finalizada...");

                            break;
                        case 60:

                            login_usuario objeto = new login_usuario(null, true);
                            Inicio.this.dispose();
                            objeto.setVisible(true);
                            objeto.setLocationRelativeTo(Inicio.this);

                            break;
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel6;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
