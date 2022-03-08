package projeto;

import java.util.HashMap;
import java.util.Map;

public class Saco {
	private Map<Aplicacao, Integer> itens;

	public Saco() {
		itens = new HashMap<Aplicacao, Integer>();
	}

	public void colocarSaco(Aplicacao app, int quantidade) {
		if (!itens.containsKey(app)) {
			itens.putIfAbsent(app, quantidade);
		}

		else {
			itens.put(app, itens.get(app) + quantidade);
		}
	}

	public Double valorConteudo() {
		double soma = 0;
		for (Map.Entry<Aplicacao, Integer> set : itens.entrySet()) {
			soma += set.getKey().getPreco() * set.getValue();
		}
		return soma;
	}

	public boolean saberSeAppEstaNoSaco(Aplicacao app) {
		boolean appEstaNoSaco = false;

		for (Aplicacao ap : itens.keySet()) {
			if (ap.getNome().equals(app.getNome())) {
				appEstaNoSaco = true;
			}
		}

		return appEstaNoSaco;
	}

}
