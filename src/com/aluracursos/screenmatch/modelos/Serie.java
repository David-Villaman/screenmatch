package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    int temporadas;
    int episodiosTemporada;
    int minutosEpisodio;

    public Serie(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }


    @Override
    public int getDuracion() {
        return temporadas * episodiosTemporada * minutosEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre()+"(" + this.getFechaLanzamiento()+")";
    }
}
