package br.com.metrocamp.exercicio;

public class Filme {
	private Integer codigo;
	private String titulo;
	private String genero;
	private Integer ano;
	private Integer duracao;
	private String direcao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	
	@Override
	public String toString() {
		String dados;
		
		dados = "Código............: "+ getCodigo();
		dados += "\nTítulo Original: " + getTitulo();
		dados += "\nGênero.........: "+getGenero();
		dados += "\nAno de Produção: "+getAno();
		dados += "\nDuração (min)..: " + getDuracao();
		dados += "\nDireção........: "+getDirecao();
		
		return dados;
	}
	
}
