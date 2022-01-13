package models;

import conexionBD.conectar;
import metodosEstaticos.encriptarMD5;

public class cambiarClaveModel {

    private String password;
    private int identificacion;
    private conectar conexion;

    public cambiarClaveModel() {
    }

    public cambiarClaveModel(String password, int identificacion) {
        this.password = password;
        this.identificacion = identificacion;
        conexion = new conectar();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public boolean cambiarPassword() {
        
        boolean resp = false;
        
        String encriptar = encriptarMD5.encriptar(getPassword());
        String sql = "UPDATE usuarios SET password='" + encriptar + "' WHERE idu=" + getIdentificacion();
        resp = conexion.manipuladorDatos(sql);
        conexion.cerrarConexion();
        return resp;
    }

}
