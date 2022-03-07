package projeto;

public class Avaliacao {

	private Cliente cliente;
	private int avaliacaoPontuacao;
	private String comentario;

	private final int avaliacaoMin = 1;
	private final int avaliacaoMax = 5;

	private double mediaAvaliacoes;

	public Avaliacao(Cliente cliente, int avaliacaoPontuacao, String comentario) {
		this.cliente = cliente;
		this.avaliacaoPontuacao = avaliacaoPontuacao;
		this.comentario = comentario;
	}

	public Avaliacao(Cliente cliente, int avaliacaoPontuacao) { // PARA CASOS SEM COMENTARIO?
		this.avaliacaoPontuacao = avaliacaoPontuacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAvaliacaoPontuacao() {
		return avaliacaoPontuacao;
	}

	public void setAvaliacaoPontuacao(int avaliacaoPontuacao) {
		this.avaliacaoPontuacao = avaliacaoPontuacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getMediaAvaliacoes() {
		return mediaAvaliacoes;
	}

	public void setMediaAvaliacoes(double mediaAvaliacoes) {
		this.mediaAvaliacoes = mediaAvaliacoes;
	}

	public int getAvaliacaoMin() {
		return avaliacaoMin;
	}

	public int getAvaliacaoMax() {
		return avaliacaoMax;
	}

}
