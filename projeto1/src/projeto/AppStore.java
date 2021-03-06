package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppStore {
	private List<Utilizador> utilizadores;
	private List<Aplicacao> aplicacoes;
	private List<Compra> compras;

	public AppStore() {
		utilizadores = new ArrayList<Utilizador>();
		aplicacoes = new ArrayList<Aplicacao>();
		compras = new ArrayList<Compra>();
	}

	public List<Utilizador> getUtilizadores() {
		return utilizadores;
	}

	public void setUtilizadores(List<Utilizador> utilizadores) {
		this.utilizadores = utilizadores;
	}

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

	public void adicionarUtilizadorAApp(Utilizador x) {
		utilizadores.add(x);
	}

	public void adicionarAplicacaoAApp(Aplicacao y) {
		aplicacoes.add(y);
	}

	public void listarUtilizadores() {

		for (Utilizador uti : utilizadores) {
			System.out.println("N?mero: " + uti.getId() + " Nome: " + uti.getNome() + " Idade: " + uti.getIdade());
		}

	}

	public void listarAplicacoes() {

		for (Aplicacao apli : aplicacoes) {
			System.out.println(" Nome: " + apli.getNome() + " Preco: " + apli.getPreco() + " Programador: "
					+ apli.getProgramador().getNome());
		}

	}

	public void listaPorCategoria(TipoAplicacao x) {

		for (Aplicacao apli : aplicacoes) {

			if (apli.getTipo().equals(x)) {
				System.out.println("Nome: " + apli.getNome());
			}

		}

	}

	public void listaPorClassificacao(int x) {

		for (Aplicacao apli : aplicacoes) {

			for (Avaliacao av : apli.getAvaliacaoA()) {

				if (av.getAvaliacaoPontuacao() == x) {

					System.out.println("Nome: " + apli.getNome());

					break;

				}
			}

		}

	}

	public void listarOrdenadoPorNome() {
		Collections.sort(aplicacoes, Comparator.comparing(Aplicacao::getNome));
		listarAplicacoes();
	}

	public void listarPorNumeroVendas() {
		Collections.sort(aplicacoes, Comparator.comparing(Aplicacao::getTotalVendas));
		listarAplicacoes();
	}

	public void listarClassificacao() {
		Collections.sort(aplicacoes, Comparator.comparing(Aplicacao::getMediaAvaliacao));
		listarAplicacoes();
	}

	public double dinheiroPorAplicacao() {
		double dinheiro = 0;

		for (Compra com : compras) {
			dinheiro += com.getPreco();
		}

		return dinheiro;
	}
}
