package com.jherrera.myappcine;

public class DatosVO {
    private int imagen;
    private String texto1,texto2;

    private int sinopsis,puntuacion,director;

    public DatosVO() {
    }

    public DatosVO(int imagen, String texto1, String texto2) {
        this.imagen = imagen;
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    public DatosVO(int sinopsis, int puntuacion, int director) {
        this.sinopsis = sinopsis;
        this.puntuacion = puntuacion;
        this.director = director;
    }

    public int getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(int sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }
}
