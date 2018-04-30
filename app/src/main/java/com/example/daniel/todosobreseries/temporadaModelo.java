package com.example.daniel.todosobreseries;

import java.io.Serializable;

/**
 * Created by Daniel on 29/04/2018.
 */

public class temporadaModelo implements Serializable{
    private String titulo, temporada, capitulo, descripcion;
    private int fotoSerie;

    public temporadaModelo(String titulo, String temporada, String capitulo, String descripcion, int fotoSerie) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.capitulo = capitulo;
        this.descripcion = descripcion;
        this.fotoSerie = fotoSerie;
    }

    public temporadaModelo() {
    }

    public temporadaModelo(String titulo, String temporada, int fotoSerie) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.fotoSerie = fotoSerie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getFotoSerie() {
        return fotoSerie;
    }

    public void setFotoSerie(int fotoSerie) {
        this.fotoSerie = fotoSerie;
    }

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
