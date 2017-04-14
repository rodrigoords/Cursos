package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Avaliador {
	private double maiorLance = Double.NEGATIVE_INFINITY;
	private double menorLance = Double.POSITIVE_INFINITY;
	private double mediaLances;
	private List<Lance> maiores;

	public void avalia(Leilao leilao) {

		double valorTotalLances = 0;

		if (leilao.getLances().size() == 0)
			throw new IllegalArgumentException("Não é possível avaliar um leilão sem lances");

		for (Lance lance : leilao.getLances()) {

			atualizaMaiorLance(lance);
			atualizaMenorLance(lance);

			valorTotalLances += lance.getValor();
		}

		mediaLances = valorTotalLances / leilao.getLances().size();
		pegaOsMaioresNo(leilao);
	}

	private void pegaOsMaioresNo(Leilao leilao) {
		maiores = new ArrayList<Lance>(leilao.getLances());
		Collections.sort(maiores, new Comparator<Lance>() {
			public int compare(Lance o1, Lance o2) {
				if (o1.getValor() < o2.getValor())
					return 1;
				if (o1.getValor() > o2.getValor())
					return -1;
				return 0;
			}
		});
		maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
	}

	public double getMaiorLance() {
		return maiorLance;
	}

	public double getMenorLance() {
		return menorLance;
	}

	public double getMediaLances() {
		return mediaLances;
	}

	public List<Lance> getTresMaiores() {
		return this.maiores;
	}

	private void atualizaMenorLance(Lance lance) {
		if (lance.getValor() < this.menorLance) {
			menorLance = lance.getValor();
		}
	}

	private void atualizaMaiorLance(Lance lance) {
		if (lance.getValor() > this.maiorLance) {
			maiorLance = lance.getValor();
		}
	}
}
