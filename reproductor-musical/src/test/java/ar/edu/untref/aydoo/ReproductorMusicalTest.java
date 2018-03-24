package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ReproductorMusicalTest {

    @Test
    public void agregarUnaCancionAlReproductorLaIncorporaASuLista() {
        
        ReproductorMusical reproductorMusical = new ReproductorMusical();
        Cancion cancionParaMiMuerte = new Cancion();
        
        reproductorMusical.agregarCancion(cancionParaMiMuerte);
        
        Assert.assertNotNull(reproductorMusical.obtenerListaDeCanciones());
        Assert.assertEquals(reproductorMusical.obtenerListaDeCanciones().size(), 1);
    }

}