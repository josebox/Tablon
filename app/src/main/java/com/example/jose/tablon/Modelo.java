package com.example.jose.tablon;

/**
 * Created by jose on 27/01/2018.
 */

public class Modelo {
    private String titulo,descripcion;
    private int imgFoto;

    public Modelo(String titulo, String descripcion, int imgFoto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imgFoto = imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }
}
