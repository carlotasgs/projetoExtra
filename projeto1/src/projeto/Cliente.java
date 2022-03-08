package projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cliente extends Utilizador {
	private List<Aplicacao> aplicacoesC;
	private HashMap<String, Boolean> verificarAvaliacao;

	public Cliente(String nome, int idade) {
		super(nome, idade);
		aplicacoesC = new ArrayList<Aplicacao>();
		verificarAvaliacao = new HashMap<String, Boolean>();
	}

	// Os clientes realizam compras na App Store
	public void comprarAplicacao(Aplicacao k, AppStore c) {

		List<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
		aplicacoes.add(k);

		aplicacoesC.add(k);
		verificarAvaliacao.put(k.getNome(), false);
		k.incrementarTotalVendas();
		k.getProgramador().incrementarTotalCompras(k.getPreco());
		avaliar(k);

		Compra compra = new Compra(c.getCalendario().getTime(), k.getPreco(), this, aplicacoes);

		c.adicionarCompras(compra);
	}

	public void avaliar(Aplicacao x) {

		boolean temAplicacao = false;

		for (Aplicacao apli : aplicacoesC) {
			if (apli.getNome().equals(x.getNome())) {
				temAplicacao = true;
				break;
			}
		}

		if (!temAplicacao) {
			System.out.println("Não pode avaliar a aplicação " + x.getNome() + " sem ter comprado a aplicação");
		}

	}

	public List<Aplicacao> getAplicacoesC() {
		return aplicacoesC;
	}

	public void setAplicacoesC(List<Aplicacao> aplicacoesC) {
		this.aplicacoesC = aplicacoesC;
	}

	public void subscrever(Aplicacao aplicacao) {

	}
}
