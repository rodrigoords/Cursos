package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Pessoa;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {
	private SeguroDeVida seguroDeVida;
	
	public void criaSeguro(Evento evento){
		this.seguroDeVida = new SeguroDeVida();
		this.seguroDeVida.setTitular(new Pessoa(evento.getString("titular")));
		this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
		this.seguroDeVida.setValor(evento.getDouble("valor"));
	}
}
