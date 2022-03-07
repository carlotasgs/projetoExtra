package projeto;

import java.util.ArrayList;
import java.util.List;

public class Programador extends Utilizador {
	private int totalAvaliacao;
	private int mediaAvaliacao;
	private List<Avaliacao> avaliacaoP;

	public Programador(String nome, int idade) {
		super(nome, idade);
		avaliacaoP = new ArrayList<Avaliacao>();
		totalAvaliacao = 0;
		mediaAvaliacao = 0;
	}

	public int getTotalAvaliacao() {
		return totalAvaliacao;
	}

	public void setTotalAvaliacao(int totalAvaliacao) {
		this.totalAvaliacao = totalAvaliacao;
	}

	public int getMediaAvaliacao() {
		return mediaAvaliacao;
	}

	public void setMediaAvaliacao(int mediaAvaliacao) {
		this.mediaAvaliacao = mediaAvaliacao;
	}

	public List<Avaliacao> getAvaliacaoP() {
		return avaliacaoP;
	}

	public void setAvaliacaoP(List<Avaliacao> avaliacaoP) {
		this.avaliacaoP = avaliacaoP;
	}

	public void avaliar(Cliente x, int y, String k) {
		Avaliacao a = new Avaliacao(x, y, k);
		avaliacaoP.add(a);
		totalAvaliacao += y;
		setMediaAvaliacao(totalAvaliacao / avaliacaoP.size());
	}

}
