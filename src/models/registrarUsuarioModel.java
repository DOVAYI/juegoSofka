package models;

import conexionBD.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import metodosEstaticos.encriptarMD5;

public class registrarUsuarioModel {

    private int identificacion;
    private String nombres;
    private String correo;
    private String celular;
    private conectar conexion;
    private String password;

    public registrarUsuarioModel() {//constructor vacio
    }

    public registrarUsuarioModel(int identificacion, String nombres, String correo, String celular, String password) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.correo = correo;
        this.celular = celular;
        this.password = password;
        conexion = new conectar();
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean buscarId() {// buscar una identificacion para que no duplicar identificacion
        boolean respuesta = false;
        String encontrado = "";
        String query = "SELECT idu FROM usuarios WHERE idu=" + getIdentificacion();
        ResultSet rst = conexion.select(query);
        try {

            while (rst.next()) {
                encontrado = rst.getString("idu");
                respuesta = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "algo salio mal");
        }
        return respuesta;
    }

    public boolean guardar() {
        boolean resp = false;
        String password = encriptarMD5.encriptar(getPassword());
        String sql = "INSERT INTO usuarios(idu,nombres,correo,celular,password) VALUES (" + getIdentificacion() + ",'" + getNombres() + "','" + getCorreo() + "','"
                + getCelular() + "','" + password + "')";
        resp = conexion.manipuladorDatos(sql);

        return resp;
    }

    public void cerrarConexionBd() {
        conexion.cerrarConexion();
    }

}
