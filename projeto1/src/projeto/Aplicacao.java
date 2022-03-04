package projeto;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
	private String nome;
	private double preco;
	private TipoAplicacao tipo;
	private Long idProgramador;
	private List <Avaliacao> avaliacaoA;
	
	public Aplicacao(String nome, double preco, TipoAplicacao tipo, Long idProgramador) {
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
		this.idProgramador=idProgramador;
		this.avaliacaoA= new ArrayList<Avaliacao>();
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

	public Long getIdProgramador() {
		return idProgramador;
	}
	
}
