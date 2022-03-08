package projeto;

import java.util.ArrayList;
import java.util.List;

public abstract class Utilizador {
	// Cada utilizador é caraterizado por um nome, idade, e número de utilizador
	// único.
	private static int num = 0;
	private int id;
	private String nome;
	private int idade;

	private List<Aplicacao> aplicacoes;

	public Utilizador(String nome, int idade) {
		this.id = Utilizador.num;
		Utilizador.num++;
		this.nome = nome;
		this.idade = idade;
		aplicacoes = new ArrayList<Aplicacao>();
	}

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

	public static int getNum() {
		return num;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void listarAplicacoes() {
		for (Aplicacao apli : aplicacoes) {
			System.out.println("Nome : " + apli.getNome());
		}
	}
}
