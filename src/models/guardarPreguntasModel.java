package models;

import conexionBD.conectar;

public class guardarPreguntasModel {

    private String Pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private int categoria;
    private int premio;
    private int ronda;
    private conectar conexion;
    private String sql;
    private int correcta;

    public guardarPreguntasModel() {
    }

    public guardarPreguntasModel(String Pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, int categoria, int premio, int ronda, int correcta) {
        this.Pregunta = Pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.categoria = categoria;
        this.premio = premio;
        this.ronda = ronda;
        this.correcta = correcta;
        conexion = new conectar();
    }

    public String getPregunta() {
        return Pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getPremio() {
        return premio;
    }

    public int getRonda() {
        return ronda;
    }

    public int getCorrecta() {
        return correcta;
    }

    public boolean guardarPreguntas() {

        sql = "INSERT INTO preguntas(nombre,categoria,premio,ronda,resp1,resp2,resp3,resp4,correcta) values ('"
                + getPregunta() + "'," + getCategoria() + "," + getPremio() + "," + getRonda() + ",'" + getRespuesta1() + "','" + getRespuesta2() + "','" + getRespuesta3() + "','"
                + getRespuesta4() + "'," + getCorrecta() + ")";
        boolean resp = conexion.manipuladorDatos(sql);

        return resp;
    }

}
