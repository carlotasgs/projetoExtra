package projeto;

import java.util.ArrayList;
import java.util.List;

public abstract class Utilizador {
	private static int num=0;
	private int id;
	private String nome;
	private int idade;
	
	public Utilizador(Long id, String nome, int idade) {
		this.id = this.num;
		this.num++;
		this.nome = nome;
		this.idade = idade;
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

}
