package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ReproductorMusicalTest {
    
    
    @Test
    public void agregarCancionLaAgregaAListaDeReproduccion() {
        
        ReproductorMusical reproductorMusical = new ReproductorMusical();
        Cancion cancion = new Cancion();
        
        reproductorMusical.agregarCancion(cancion);
        
        Assert.assertTrue(reproductorMusical.tieneLaCancion(cancion));
        
    }
    
    @Test
    public void noAgregoUnaCancionEntoncesNoExisteEnMiReproductor() {
        
        ReproductorMusical reproductorMusical = new ReproductorMusical();
        Cancion miPerroDinamita = new Cancion();
        
        Assert.assertFalse(reproductorMusical.tieneLaCancion(miPerroDinamita));
        
    }

}