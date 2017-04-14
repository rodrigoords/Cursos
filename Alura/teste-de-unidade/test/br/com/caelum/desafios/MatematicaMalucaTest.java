package br.com.caelum.desafios;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaMalucaTest {

	@Test
	public void numeroMenorQueDez() {
		int numero = 2;
		MatematicaMaluca matematicaMaluca = new MatematicaMaluca();
		
		int resultado = matematicaMaluca.contaMaluca(numero);
		
		Assert.assertEquals(numero*2, resultado);
	}
	
	@Test
	public void numeroIgualADez() {
		int numero = 10;
		MatematicaMaluca matematicaMaluca = new MatematicaMaluca();
		
		int resultado = matematicaMaluca.contaMaluca(numero);
		
		Assert.assertEquals(numero*2, resultado);
	}
	
	@Test
	public void numeroMaiorQueDezEMenorQueTrinta() {
		int numero = 11;
		MatematicaMaluca matematicaMaluca = new MatematicaMaluca();
		
		int resultado = matematicaMaluca.contaMaluca(numero);
		
		Assert.assertEquals(numero*3, resultado);
	}
	
	@Test
	public void numeroIgualATrinta() {
		int numero = 30;
		MatematicaMaluca matematicaMaluca = new MatematicaMaluca();
		
		int resultado = matematicaMaluca.contaMaluca(numero);
		
		Assert.assertEquals(numero*3, resultado);
	}
	
	@Test
	public void numeroMaiorQueTrinta() {
		int numero = 31;
		MatematicaMaluca matematicaMaluca = new MatematicaMaluca();
		
		int resultado = matematicaMaluca.contaMaluca(numero);
		
		Assert.assertEquals(numero*4, resultado);
	}

}
