import com.aluracursos.screenmatch.calculos.CalculadoraTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Encanto");
        pelicula.setFechaLanzamiento(2021);
        pelicula.setDuracion(120);
        pelicula.setIncluidoPlan(true);

        //pelicula.muestraFicha();

        pelicula.evalua(10);
        pelicula.evalua(10);
        pelicula.evalua(7.8);
       // System.out.println(pelicula.getTotalEvaluaciones());
        //System.out.println(pelicula.calculaMedia());
       // System.out.println("Média de evaluaciones de la película: " +pelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisodiosTemporada(10);
        //casaDragon.muestraFicha();

        Pelicula otraPelicula = new Pelicula("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracion(180);

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(pelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
       //` System.out.println("Tiempo necesario para ver todos los titulos: "+calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
      //  filtroRecomendacion.filtra(pelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Tar");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        //filtroRecomendacion.filtra(episodio);


        var pelicula2 = new Pelicula("Avatar");
        pelicula2.setDuracion(150);
        pelicula2.setFechaLanzamiento(2001);


        System.out.println("*********************************");

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pelicula);
        peliculas.add(otraPelicula);
        peliculas.add(pelicula2);

        System.out.println("Cantidad de peliculas ingresadas: " +peliculas.size());
        System.out.println("Nombre de la primer pelicula ingresada:  " +peliculas.get(0).getNombre());

        /*
         */
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula1 = peliculas.get(i);
            System.out.println("Nombre de la pelicula " + (i+1) + ": " +pelicula1.getNombre());
        }

        System.out.println(peliculas.toString());

        System.out.println("toString de la pelicula: " +peliculas.get(0).toString());



    }
}
