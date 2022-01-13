package views;

import conexionBD.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class historial_ganadores extends javax.swing.JDialog {

    private DefaultTableModel modelo;
    private conectar conexion;

    public historial_ganadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(700, 520);
        setLocationRelativeTo(this);
        setResizable(false);
        conexion = new conectar();
        iniciarTablaProductos("SELECT * FROM jugador WHERE acumulado=" + 150);
    }

    private void iniciarTablaProductos(String sql) {

        ResultSet rs;
        rs = conexion.select(sql);
        String cabecera[] = {"Perfil Usuario", "Nombre", "Puntaje"};
        modelo = new DefaultTableModel(null, cabecera);
        String columnas[] = new String[3];
        try {
            while (rs.next()) {
                columnas[0] = rs.getString("nombrePerfil");
                columnas[1] = rs.getString("nombre");
                columnas[2] = rs.getString("acumulado");

                modelo.addRow(columnas);
                tablaHistorial.setModel(modelo);

            }

        } catch (SQLException e) {
            System.out.println("Error mostrar datos tabla ");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial Ganadores del Juego", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 3, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 520, 260));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        conexion.cerrarConexion();
        this.dispose();
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
            java.util.logging.Logger.getLogger(historial_ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historial_ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historial_ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historial_ganadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                historial_ganadores dialog = new historial_ganadores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}
