package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReproductorMusicalTest {

    private ReproductorMusical reproductorMusical;

    @Before
    public void inicializarReproductorMusical() {
        reproductorMusical = new ReproductorMusical();
    }

    @Test
    public void agregarUnaCancionAlReproductorLaIncorporaASuLista() {

        Cancion cancionParaMiMuerte = new Cancion(5);

        reproductorMusical.agregarCancion(cancionParaMiMuerte);

        Assert.assertNotNull(reproductorMusical.obtenerListaDeCanciones());
        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 1);
    }

    @Test
    public void agregarUnaListaDeCancionesAlReproductorLasIncorporaASuLista() {

        List<Cancion> listaDeCanciones = new ArrayList<>();
        Cancion cancionParaMiMuerte = new Cancion(5);
        Cancion miUnicornioAzul = new Cancion(3);
        listaDeCanciones.add(cancionParaMiMuerte);
        listaDeCanciones.add(miUnicornioAzul);

        reproductorMusical.agregarListaDeCanciones(listaDeCanciones);

        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 2);
    }

    @Test
    public void agregarUnaCancionYUnaListaDeCancionesAlReproductorLasIncorporaASuLista() {

        Cancion cancionDelElegido = new Cancion(7);
        List<Cancion> listaDeCanciones = new ArrayList<>();
        Cancion cancionParaMiMuerte = new Cancion(5);
        Cancion miUnicornioAzul = new Cancion(3);
        listaDeCanciones.add(cancionParaMiMuerte);
        listaDeCanciones.add(miUnicornioAzul);

        reproductorMusical.agregarCancion(cancionDelElegido);
        reproductorMusical.agregarListaDeCanciones(listaDeCanciones);

        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 3);
    }

    @Test
    public void laDuracionTotalDeReproduccionEs0CuandoNoHayListaDeCanciones() {

        int duracionTotalDeReproduccion = reproductorMusical.obtenerDuracionTotalDeReproduccion();

        Assert.assertEquals(duracionTotalDeReproduccion, 0);
    }

    @Test
    public void laDuracionTotalDeReproduccionEsLaSumaDeLasDuracionesDeCadaCancion() {

        List<Cancion> listaDeCanciones = new ArrayList<>();
        Cancion cancionParaMiMuerte = new Cancion(5);
        Cancion miUnicornioAzul = new Cancion(3);
        listaDeCanciones.add(cancionParaMiMuerte);
        listaDeCanciones.add(miUnicornioAzul);
        reproductorMusical.agregarListaDeCanciones(listaDeCanciones);

        int duracionTotalDeReproduccion = reproductorMusical.obtenerDuracionTotalDeReproduccion();

        Assert.assertEquals(duracionTotalDeReproduccion, 8);
    }

}