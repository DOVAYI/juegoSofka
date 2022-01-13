package models;

import conexionBD.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodosEstaticos.encriptarMD5;

public class ingresoModel {

    //private String contrasena;
    private String aux1;
    private String usuario;
    private boolean fil = false;
    private conectar conexion;
    private String nombre;

    public ingresoModel() {
        // se crea el constructor vacio por buenas practicas
    }

    public ingresoModel(String aux1, String usuario) {
        this.aux1 = aux1;
        this.usuario = usuario;
        conexion = new conectar();
    }

    public String getAux1() {
        return aux1;
    }

    public void setAux1(String aux1) {
        this.aux1 = aux1;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean Buscar() { // con este metodo validas que el usuario exista, el  que registrara las preguntas

        String encriptar = encriptarMD5.encriptar(getAux1());

        String query = "SELECT nombres FROM usuarios WHERE password= '" + encriptar + "' AND idu=" + getUsuario();
        ResultSet rst = conexion.select(query);
        try {

            while (rst.next() && fil == false) {
                nombre = rst.getString("nombres");
                fil = true;

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro no encontrado ");
        }

        return fil;

    }
}
