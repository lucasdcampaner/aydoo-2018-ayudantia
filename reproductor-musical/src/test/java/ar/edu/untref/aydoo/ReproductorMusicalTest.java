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

        Cancion cancionParaMiMuerte = new Cancion();

        reproductorMusical.agregarCancion(cancionParaMiMuerte);

        Assert.assertNotNull(reproductorMusical.obtenerListaDeCanciones());
        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 1);
    }

    @Test
    public void agregarUnaListaDeCancionesAlReproductorLasIncorporaASuLista() {

        List<Cancion> listaDeCanciones = new ArrayList<>();
        Cancion cancionParaMiMuerte = new Cancion();
        Cancion miUnicornioAzul = new Cancion();
        listaDeCanciones.add(cancionParaMiMuerte);
        listaDeCanciones.add(miUnicornioAzul);

        reproductorMusical.agregarListaDeCanciones(listaDeCanciones);

        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 2);
    }

}