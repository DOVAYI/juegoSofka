package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conectar {//en esta clase creamos todas variables y metodos necesarios para conexion y desconexion a la base de datos

    private static String url;
    private Connection conn = null;
    private Statement stm;

    public conectar() {
        url = "jdbc:sqlite:juego.db";
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection(url);

            if (conn != null) {
                stm = conn.createStatement();
            }

        } catch (ClassNotFoundException e) {
            System.err.println("error en la clase");
            Logger.getLogger(conectar.class.getName()).log(Level.INFO, null, "no se encontro la clase");
        } catch (SQLException e) {
            System.out.println("error al conectar base de datos");

        }

    }

    public ResultSet select(String sentencia) {
        ResultSet rs = null;
        try {
            rs = this.stm.executeQuery(sentencia);
        } catch (SQLException ex) {
            System.out.print("Se presento ERROR al utilizar metodo select...Detalle de Exception: ");

        }
        return rs;
    }

    public boolean manipuladorDatos(String sentencia) {
        boolean resp = false;

        try {
            this.stm.executeUpdate(sentencia);
            resp = true;

        } catch (SQLException ex) {
            System.out.print(
                    "Se presento ERROR al utilizar metodo manipuladorDatos...Detalle de Exception: " + ex.toString());

        }
        return resp;
    }

    public void cerrarConexion() {
        try {
            this.stm.close();
            ;
            this.conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al cerrar la Conexion a la Base de Datos");
        }
    }

}
