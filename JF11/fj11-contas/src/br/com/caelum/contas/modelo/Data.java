package br.com.caelum.contas.modelo;
public class Data {
	private Dia dia;
	private Mes mes;
	private Ano ano;

	public Data(Dia dia, Mes mes, Ano ano) {

		if (dia != null && mes != null && ano != null) {
			if (!ano.isDiaMesValidoParaAno(dia, mes)) {
				return;
			}
		} else {
			return;
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String imprimeData() {
		return (dia.getDia() + "/" + mes.getMes() + "/" + ano.getAno());
	}
}
