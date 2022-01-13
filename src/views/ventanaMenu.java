
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.edisoncor.gui.util.Avatar;
import views.registrar_preguntas;

public class ventanaMenu extends javax.swing.JFrame {

    private int identificacion;

    public ventanaMenu() {

        initComponents();
        llenarMenu();
        this.setSize(1300, 770);
        setLocationRelativeTo(this);

    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void llenarMenu() {
        List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Salir del Sistema", loadImage("/imagenes/salir.png")));
        avatars.add(new Avatar("Cambiar Clave", loadImage("/imagenes/clave.png")));
        avatars.add(new Avatar("Jugar", loadImage("/imagenes/jugar1.png")));
        avatars.add(new Avatar("Registrar Preguntas", loadImage("/imagenes/registrar.png")));
        menu.setAvatars(avatars);

    }

    private static Image loadImage(String FileName) {
        try {
            return ImageIO.read(ventanaMenu.class.getResource(FileName));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public int Modulo(int index) {

        switch (index) {
            case 0:
                dispose();
                break;
            case 1:
                cambiar_clave cambiar = new cambiar_clave(null, true);
                cambiar.txtUsuario.setText(String.valueOf(getIdentificacion()));
                cambiar.setVisible(true);
                break;
            case 2:
                login_usuario jugar = new login_usuario(null, true);
                jugar.btnIngresar.setEnabled(false);
                jugar.setVisible(true);
                break;
            case 3:
                registrar_preguntas registrar = new registrar_preguntas(null, true);
                registrar.setVisible(true);
                break;

        }
        return index;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new org.edisoncor.gui.panel.PanelAvatarChooser();
        buttonIpod1 = new org.edisoncor.gui.button.ButtonIpod();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        prueba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setForeground(new java.awt.Color(0, 153, 102));
        menu.setColorPrimario(new java.awt.Color(0, 204, 204));
        menu.setColorSecundario(new java.awt.Color(0, 204, 204));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        menu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuKeyPressed(evt);
            }
        });
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonIpod1.setBorder(null);
        buttonIpod1.setText("...");
        buttonIpod1.setColorDeSombra(new java.awt.Color(204, 0, 51));
        buttonIpod1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIpod1MouseClicked(evt);
            }
        });
        menu.add(buttonIpod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 247, 261));

        labelTask1.setBackground(new java.awt.Color(255, 255, 255));
        labelTask1.setForeground(new java.awt.Color(255, 0, 255));
        labelTask1.setText("SISTEMA DE GESTION DE PREGUNTAS Y RESPUESTA");
        labelTask1.setCategoryFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        labelTask1.setCategorySmallFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTask1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        labelTask1.setDescription("                             \"DOVAYIsotf\"");
        menu.add(labelTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 608, -1));

        prueba.setForeground(new java.awt.Color(33, 38, 48));
        menu.add(prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, 30));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void menuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuKeyPressed
    llenarMenu();
}//GEN-LAST:event_menuKeyPressed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
        llenarMenu();
    }//GEN-LAST:event_menuMouseClicked

    private void buttonIpod1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIpod1MouseClicked
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres entrar a este modulo"
                + "?" + "\n " + menu.getSelectedtitulo());
        if (eleccion == 0) {
            int index = menu.getAvatarIndex();
            Modulo(index);

        }

    }//GEN-LAST:event_buttonIpod1MouseClicked

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
            java.util.logging.Logger.getLogger(ventanaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventanaMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod buttonIpod1;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.panel.PanelAvatarChooser menu;
    public javax.swing.JLabel prueba;
    // End of variables declaration//GEN-END:variables

}
