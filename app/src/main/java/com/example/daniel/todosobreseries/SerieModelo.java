package com.example.daniel.todosobreseries;

import java.io.Serializable;

/**
 * Created by Daniel on 29/04/2018.
 */

public class SerieModelo implements Serializable{
    private String titulo, temporadas, etiquetas, generos, tempTitulo, numtempo;
    private int fotoSerie, fotoTemp;

    public SerieModelo() {
    }

    public SerieModelo(String titulo, String temporadas, String etiquetas, String generos, int fotoSerie) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.etiquetas = etiquetas;
        this.generos = generos;
        this.fotoSerie = fotoSerie;
    }

    public String getTempTitulo() {
        return tempTitulo;
    }

    public void setTempTitulo(String tempTitulo) {
        this.tempTitulo = tempTitulo;
    }

    public String getNumtempo() {
        return numtempo;
    }

    public void setNumtempo(String numtempo) {
        this.numtempo = numtempo;
    }

    public int getFotoTemp() {
        return fotoTemp;
    }

    public void setFotoTemp(int fotoTemp) {
        this.fotoTemp = fotoTemp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public int getFotoSerie() {
        return fotoSerie;
    }

    public void setFotoSerie(int fotoSerie) {
        this.fotoSerie = fotoSerie;
    }
}
