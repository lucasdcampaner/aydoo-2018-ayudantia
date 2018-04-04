package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void ponerBoteEnTablero() {
		
		Bote unBote = new Bote();
		Tablero unTablero = new Tablero();
		Posicion posicion = new Posicion(1, 1);
		
		unTablero.ponerBote(unBote, posicion);
		
		Assert.assertFalse(unTablero.estaDisponible(posicion));
		
	}
	

	
}