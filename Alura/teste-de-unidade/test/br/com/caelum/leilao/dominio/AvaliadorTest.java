package br.com.caelum.leilao.dominio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.builder.CriadorDeLeilao;

public class AvaliadorTest {

	private Avaliador leiloeiro;
	private Usuario pedro;
	private Usuario joao;
	private Usuario maria;
	private Usuario gabriel;
	private Usuario raiany;
	private Usuario rodrigo;

	@Before
	public void setUp() {
		leiloeiro = new Avaliador();
		maria = new Usuario("Maria");
		joao = new Usuario("João");
		pedro = new Usuario("Pedro");
		rodrigo = new Usuario("Rodrigo");
		raiany = new Usuario("Raiany");
		gabriel = new Usuario("Gabriel");

	}

	@Test
	public void verificaOrdenacaoCrescente() {

		double menorValor = 250000.00;
		double maiorValor = 300000.00;

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(maria, 250000.00).lance(joao, 270000)
				.lance(pedro, 300000).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(maiorValor, leiloeiro.getMaiorLance(), 0.0000001);
		Assert.assertEquals(menorValor, leiloeiro.getMenorLance(), 0.0000001);

	}

	@Test
	public void verificaOrdenacaoDecrescente() {

		double menorValor = 250000.00;
		double maiorValor = 300000.00;

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(pedro, 300000.00).lance(joao, 270000)
				.lance(maria, 250000).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(maiorValor, leiloeiro.getMaiorLance(), 0.0000001);
		Assert.assertEquals(menorValor, leiloeiro.getMenorLance(), 0.0000001);

	}

	@Test
	public void verificaAvaliacaoComUmLance() {
		Leilao leilao = new CriadorDeLeilao().para("Computador Dell").lance(maria, 2000).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(2000, leiloeiro.getMaiorLance(), 0.000001);
		Assert.assertEquals(2000, leiloeiro.getMenorLance(), 0.000001);
	}

	@Test
	public void verificaAvaliadorComValoresRomdom() {

		Leilao leilao = new CriadorDeLeilao().para("Cadeira de escritório").lance(maria, 300).lance(joao, 450)
				.lance(pedro, 250).lance(rodrigo, 500).lance(raiany, 180).lance(gabriel, 320).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(500, leiloeiro.getMaiorLance(), 0.000001);
		Assert.assertEquals(180, leiloeiro.getMenorLance(), 0.000001);

	}

	@Test
	public void verificaCalculoMediaLances() {

		// given
		double primeroLance = 250000.00;
		double segundoLance = 300000.00;
		double terceitoLance = 270000.00;

		double mediaLances = (primeroLance + segundoLance + terceitoLance) / 3;

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(maria, primeroLance)
				.lance(joao, segundoLance).lance(pedro, terceitoLance).constroi();
		// when
		leiloeiro.avalia(leilao);

		// then
		Assert.assertEquals(mediaLances, leiloeiro.getMediaLances(), 0.000001);
	}

	@Test
	public void verificaListaComMenosDeTresLances() {

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(maria, 250000).lance(joao, 320000)
				.constroi();

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		Assert.assertEquals(2, leiloeiro.getTresMaiores().size());
	}

	@Test
	public void verificaListaComMaisTresLances() {

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(maria, 250000).lance(joao, 320000)
				.lance(maria, 400000).lance(joao, 500000).lance(maria, 310000).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(3, leiloeiro.getTresMaiores().size());
	}

	@Test
	public void verificaListaComTresLances() {

		Leilao leilao = new CriadorDeLeilao().para("Camaro Amarelo").lance(maria, 250000).lance(joao, 320000)
				.lance(maria, 400000).constroi();

		leiloeiro.avalia(leilao);

		Assert.assertEquals(3, leiloeiro.getTresMaiores().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {
		Leilao leilao = new CriadorDeLeilao().para("Playstation 3 Novo").constroi();

		leiloeiro.avalia(leilao);
	}
}
