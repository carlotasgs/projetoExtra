package projeto;

import java.util.List;

public class Programador extends  Utilizador {
	private double avaliacao;

	public Programador(Long id, String nome, int idade) {
		super (id, nome, idade);
		this.avaliacao=avaliacao;
		
	}

	public void avaliar (int valor, String comentario) {
		System.out.println("Valor: " + valor + "Comentário: " + comentario );
	}

}
