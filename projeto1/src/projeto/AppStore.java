package projeto;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class AppStore {
	private List<Utilizador> utilizadores;
	private List<Aplicacao> aplicacoes;
	private List<Compra> compras;
	Calendar calendario;
	private int semanaAtual;

	public AppStore() {
		utilizadores = new ArrayList<Utilizador>();
		aplicacoes = new ArrayList<Aplicacao>();
		compras = new ArrayList<Compra>();
		calendario = Calendar.getInstance();
		semanaAtual = calendario.getWeeksInWeekYear();
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Calendar getCalendario() {
		return calendario;
	}

	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
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
			System.out.println("Número: " + uti.getId() + " Nome: " + uti.getNome() + " Idade: " + uti.getIdade());
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

	public void aplicacoesMenosCompradas() {

		HashMap<Aplicacao, Integer> xAplicacaoComprada = new HashMap<Aplicacao, Integer>(); // para atribuir a aplicacao
																							// o numero de vezes que foi
																							// comprada

		for (Compra com : compras) {

			Date dataFinal = calendario.getTime();
			Date dataInicial = com.getData();

			LocalDate dataF = dataFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate dataI = dataInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

			int dias = (int) ChronoUnit.DAYS.between(dataF, dataI);
			System.out.println("Data final:  " + dataF);
			System.out.println("Data inicial: " + dataI);
			System.out.println("dias: " + dias);

			if (dias < -7 && dias > 0) {
				continue; // para nao entrar no for, quando a condicao nao for cumprida
			}

			for (Aplicacao apli : com.getAplicacoes()) {

				// numero de x que a aplicacao foi comprada por semana

				// data atual -7 , verificar se a compra esta entre data atual e data 7 dias
				// atras, se sim somar, senao

				if (xAplicacaoComprada.containsKey(apli)) {
					xAplicacaoComprada.put(apli, xAplicacaoComprada.get(apli) + 1);
				} else {
					xAplicacaoComprada.put(apli, 1);
				}

			}

		}

		// xAplicacaoComprada.

		// ordenar numero x que foi comprada, hashmap pelo int

		// buscar as primeiras 5, 1

		// for ao hashmap buscar 5 primeiros >= , if (verificar se tenho 5

		// ter atributo listaAplicacoesSemanais;

		// Aplicacao descontoMensal;
	}

	public void mudarData(int dia, int mes, int ano) { // para testar

		// calendario.set(Calendar.YEAR, ano);
		// calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.DAY_OF_MONTH, dia);

		if (semanaAtual != calendario.get(Calendar.WEEK_OF_YEAR)) {
			aplicacoesMenosCompradas();
			semanaAtual = calendario.get(Calendar.WEEK_OF_YEAR);
		}

	}

	public void adicionarCompras(Compra x) {
		compras.add(x);
	}
}
