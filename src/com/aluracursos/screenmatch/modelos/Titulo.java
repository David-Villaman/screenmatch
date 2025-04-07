package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {

    private String nombre;
    private int fechaLanzamiento;
    private int duracion;
    private boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void muestraFicha(){

        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracion());

    }

    public void evalua(double nota){

        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){


        return sumaEvaluaciones / totalEvaluaciones;
    }




    public int getTotalEvaluaciones(){

        return totalEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
