package models;

import conexionBD.conectar;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jugarModel {

    private String perfil;
    private String nombre;
    private String sql;
    private conectar conexion;

    public jugarModel(String perfil, String nombre) {
        this.perfil = perfil;
        this.nombre = nombre;
        conexion = new conectar();
    }

    public String getPerfil() {
        return perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean buscar() {
        boolean resp = false;
        String encontrado = "";
        sql = "SELECT nombrePerfil FROM jugador WHERE nombrePerfil='" + getPerfil() + "'";
        ResultSet rst = conexion.select(sql);

        try {
            while (rst.next()) {
                encontrado = rst.getString("nombrePerfil");
                resp = true;

            }
        } catch (Exception e) {

        }
        return resp;
    }

    public boolean guardar() {
        sql = "INSERT INTO jugador(nombrePerfil,nombre) VALUES ('" + getPerfil() + "','" + getNombre() + "')";
        boolean resp = conexion.manipuladorDatos(sql);

        return resp;

    }

    public void guardarAcumulado(int premio) {

        int acum = premio + buscarAcumulado();
        sql = "UPDATE jugador SET acumulado=" + acum + " WHERE nombrePerfil='" + getPerfil() + "'";
        conexion.manipuladorDatos(sql);

    }

    private int buscarAcumulado() {

        int acumulado = 0;
        String sql2 = "SELECT acumulado FROM jugador WHERE nombrePerfil='" + getPerfil() + "'";
        ResultSet rst = conexion.select(sql2);
        try {
            while (rst.next()) {
                acumulado = rst.getInt("acumulado");

            }
        } catch (SQLException e) {
            System.out.println("prueba4");
        }

        return acumulado;
    }

}
