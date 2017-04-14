package br.alura.refatoracao.cap1;

public class NotaFiscalDao {
	public void salva(NotaFiscal nf) {
		// salva no banco
		String sql = "insert into notafiscal (cliente, valor)"+
					 "values (?," + nf.getValorLiquido() + ")";
		
		System.out.println("Salvando no banco" + sql);
	}
}
