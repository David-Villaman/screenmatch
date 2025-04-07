package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Encanto",2021);
        pelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.evalua(6);
        var pelicula2 = new Pelicula("Avatar", 2009);
        pelicula2.evalua(10);
        Serie casaDragon = new Serie("Casa del dragon", 2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula);
        lista.add(otraPelicula);
        lista.add(pelicula2);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula peliculacast) {
                System.out.println(peliculacast.getClasificacion());
            }

        }

        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Javier Bardem");
        listaArtistas.add("Nicole Kidman");
        listaArtistas.add("Joaquin Phoenix");
        System.out.println("Lista de artistas  no ordenada: " +listaArtistas);
        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada: " +listaArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista de titulos ordenada por fecha de lanzamiento: " + lista);
    }
}
