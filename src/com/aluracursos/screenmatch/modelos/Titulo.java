package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaLanzamiento;
    private int duracion;
    private boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;


    public void muestraFicha(){

        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracion());

    }

    void evalua(double nota){

        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calculaMedia(){


        return sumaEvaluaciones / totalEvaluaciones;
    }




    int getTotalEvaluaciones(){

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

}
