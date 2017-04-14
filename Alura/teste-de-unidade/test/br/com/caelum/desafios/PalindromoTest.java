package br.com.caelum.desafios;

import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

	Palindromo palindromo = new Palindromo();

	@Test
	public void verificaPalavraUnicaTrue() {

		Assert.assertTrue(palindromo.ehPalindromo("Arara"));
	}

	@Test
	public void verificaPalavraUnicaFalse() {
		Assert.assertFalse(palindromo.ehPalindromo("Jaguar"));
	}

	@Test
	public void verificaFraseTrue() {
		Assert.assertTrue(palindromo.ehPalindromo("Socorram-me subi no onibus em Marrocos"));
	}

	@Test
	public void verificaFraseFalsa() {
		Assert.assertFalse(palindromo.ehPalindromo("Isso não é um palindromo"));
	}

}
