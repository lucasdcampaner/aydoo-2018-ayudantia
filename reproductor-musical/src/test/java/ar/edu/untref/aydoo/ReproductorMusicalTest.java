package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReproductorMusicalTest {

    private ReproductorMusical reproductorMusical;

    @Before
    public void inicializacion() {
        reproductorMusical = new ReproductorMusical();
    }

    @Test
    public void agregarCancionLaAgregaAListaDeReproduccion() {

        Cancion cancion = new Cancion();

        reproductorMusical.agregarCancion(cancion);

        Assert.assertTrue(reproductorMusical.tieneLaCancion(cancion));

    }

    @Test
    public void noAgregoUnaCancionEntoncesNoExisteEnMiReproductor() {

        Cancion miPerroDinamita = new Cancion();

        Assert.assertFalse(reproductorMusical.tieneLaCancion(miPerroDinamita));

    }

    @Test
    public void agregarUnaListaLaAgregaAMiListaDeReproduccion() {

        List<Cancion> laMoscaEnLaSopa = new ArrayList<>();
        Cancion miPerroDinamita = new Cancion();
        Cancion tareaFina = new Cancion();
        laMoscaEnLaSopa.add(miPerroDinamita);
        laMoscaEnLaSopa.add(tareaFina);

        reproductorMusical.agregarListaDeCanciones(laMoscaEnLaSopa);

        Assert.assertTrue(reproductorMusical.tieneLaCancion(miPerroDinamita));
        Assert.assertTrue(reproductorMusical.tieneLaCancion(tareaFina));
    }

}