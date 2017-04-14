package br.com.caelum.desafios;


import org.junit.Assert;
import org.junit.Test;


public class AnoBissextoTest {
	
	AnoBissexto anoBissexto = new AnoBissexto();
	
	@Test
	public void deveRetornarAnoBissexto() {        

	    Assert.assertTrue(anoBissexto.isBissexto(2016));
	    Assert.assertTrue(anoBissexto.isBissexto(2012));
	}
	
	@Test
	public void deveRetornarTrueAnoMultiplosDe400() {
		Assert.assertTrue(anoBissexto.isBissexto(2000));
	}
	
	@Test
	public void deveRetornarTrueAnoMultiploDe4EnaoDe100(){
		Assert.assertTrue(anoBissexto.isBissexto(1996));
	}
	
	@Test
	public void deveRetornarFalseAnoMultiploDe100MasNaoDe400(){
		Assert.assertFalse(anoBissexto.isBissexto(2100));
	}
	
	@Test
	public void deveRetornarFalseOutrosAnos(){
		Assert.assertFalse(anoBissexto.isBissexto(2017));
	}
	
	@Test
	public void naoDeveRetornarAnoBissexto() {                

		Assert.assertFalse(anoBissexto.isBissexto(2015));
		Assert.assertFalse(anoBissexto.isBissexto(2011));
	}
}
