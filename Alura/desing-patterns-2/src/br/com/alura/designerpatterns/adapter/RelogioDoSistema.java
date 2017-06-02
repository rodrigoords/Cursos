package br.com.alura.designerpatterns.adapter;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio{

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
