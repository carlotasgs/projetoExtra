package projeto;

import java.util.ArrayList;
import java.util.List;

public class AppStore {
	private List <Utilizador> utilizadores;
	private List <Aplicacao> aplicacoes;
	private List <Compras> compras;
	
	public AppStore() {
		utilizadores = new ArrayList <Utilizador> ();
		aplicacoes = new ArrayList <Aplicacao> ();
		compras = new ArrayList <Compras> ();
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
	
	public void adicionarUtilizadorAApp (Utilizador x) {
		utilizadores.add(x);
	}
	
	public void adicionarAplicacaoAApp (Aplicacao y) {
		aplicacoes.add(y);
	}


}

