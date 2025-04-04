import com.aluracursos.screenmatch.calculos.CalculadoraTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();

        pelicula.setNombre("Encanto");
        pelicula.setFechaLanzamiento(2021);
        pelicula.setDuracion(120);
        pelicula.setIncluidoPlan(true);

        pelicula.muestraFicha();

        pelicula.muestraFicha();
        pelicula.evalua(10);
        pelicula.evalua(10);
        pelicula.evalua(7.8);
        System.out.println(pelicula.getTotalEvaluaciones());
        System.out.println(pelicula.calculaMedia());
        System.out.println("Média de evaluaciones de la película: " +pelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisodiosTemporada(10);
        casaDragon.muestraFicha();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracion(180);

        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(pelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver todos los titulos: "+calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Tar");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);

    }
}
