package projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente extends Utilizador {
	private List<Aplicacao> aplicacoesC;
	private boolean isComprado;

	private HashMap<String, Boolean> verificarAvaliacao;

	public Cliente(String nome, int idade) {
		super(nome, idade);
		aplicacoesC = new ArrayList<Aplicacao>();
		verificarAvaliacao = new HashMap<String, Boolean>();
	}

	public void comprarAplicacao(Aplicacao k) {
		aplicacoesC.add(k);
		verificarAvaliacao.put(k.getNome(), false);
		k.incrementarTotalVendas();
	}

	public void avaliar(Aplicacao x) {

		for (Aplicacao apli : aplicacoesC) {
			if (apli.getNome().equals(x.getNome())) {
				if (verificarAvaliacao.get(x.getNome())) {

				}

			} else {
				System.out.println("Não pode avaliar a aplicação " + x.getNome() + " sem ter comprado a aplicação");
			}
		}
	}

	public List<Aplicacao> getAplicacoesC() {
		return aplicacoesC;
	}

	public void setAplicacoesC(List<Aplicacao> aplicacoesC) {
		this.aplicacoesC = aplicacoesC;
	}

}
