package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable){
        if(clasificable.getClasificacion() >=4){
            System.out.println("Muy bien evaluado");
        } else if (clasificable.getClasificacion() >=2) {
            System.out.println("popular");
        }else {
            System.out.println("Miralo despues");
        }


    }


}
