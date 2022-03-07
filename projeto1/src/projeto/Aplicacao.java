package projeto;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	private String nome;
	private double preco;
	private TipoAplicacao tipo;
	private Programador programador;
	private List<Avaliacao> avaliacaoA;
	private int totalAvaliacao;
	private int mediaAvaliacao;

	private int totalVendas;

	public Aplicacao(String nome, double preco, TipoAplicacao tipo, Programador programador) {
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.programador = programador;
		this.avaliacaoA = new ArrayList<Avaliacao>();
		totalAvaliacao = 0;
		mediaAvaliacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public TipoAplicacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoAplicacao tipo) {
		this.tipo = tipo;
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}

	public List<Avaliacao> getAvaliacaoA() {
		return avaliacaoA;
	}

	public void setAvaliacaoA(List<Avaliacao> avaliacaoA) {
		this.avaliacaoA = avaliacaoA;
	}

	public int getMediaAvaliacao() {
		return mediaAvaliacao;
	}

	public void setMediaAvaliacao(int mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	public int getTotalAvaliacao() {
		return totalAvaliacao;
	}

	public void setTotalAvaliacao(int totalAvaliacao) {
		this.totalAvaliacao = totalAvaliacao;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public void avaliar(Cliente x, int y, String k) {
		Avaliacao a = new Avaliacao(x, y, k);
		avaliacaoA.add(a);
		totalAvaliacao += y;
		setMediaAvaliacao(totalAvaliacao / avaliacaoA.size());
	}

	public void incrementarTotalVendas() {
		this.totalVendas++;
	}

}
