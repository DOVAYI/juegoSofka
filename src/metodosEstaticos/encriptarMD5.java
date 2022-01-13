package metodosEstaticos;

import conexionBD.conectar;
import java.sql.ResultSet;
import org.apache.commons.codec.digest.DigestUtils;

public class encriptarMD5 {

    public static String encriptar(String password) {//debido a sqlite no tiene opcion de encriptar en la sentencia como mysql, recurrimos a una libreria externa para simplificar
        
        String encriptMD5 = DigestUtils.md5Hex(password);
        
        return encriptMD5;
    }

    public static int totalPrengutas() {//este metodo nos entrega en total de preguntas registradas
        
        conectar conexion = new conectar();
        int numero = 0;
        
        String query = "SELECT idp FROM preguntas WHERE idp=(SELECT MAX(idp) FROM preguntas)";
        ResultSet rst = conexion.select(query);
        try {
            while (rst.next()) {
                numero = rst.getInt("idp");
            }
        } catch (Exception e) {
            System.out.println("error metodo estatico TOTAL PREGUNTAS");
        }

        return numero;
    }
}
