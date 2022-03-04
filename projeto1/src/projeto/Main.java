package projeto;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		AppStore c = new AppStore();
		
		//Registar novos utilizadores e atribuir automaticamente n�meros �nicos
		Utilizador programador1 = new Programador(null, "Jo�o", 25);
		Utilizador programador2 = new Programador(null, "Pedro", 30);
		Utilizador cliente1 = new Cliente(null, "Ana", 40);
		Utilizador cliente2 = new Cliente(null, "Joana", 12);
		
		//Incluir novas aplica��es com a informa��o necess�ria
		Aplicacao inst = new Aplicacao ("insta", 2, TipoAplicacao.Entertainment);
		
		c.adicionarUtilizadorAApp(programador1);
		c.adicionarUtilizadorAApp(programador2);
		c.adicionarUtilizadorAApp(cliente1);
		c.adicionarUtilizadorAApp(cliente2);
		
		c.adicionarAplicacaoAApp(inst);
		
		// cliente1.comprarAplicacao(inst);
		
		inst.avaliar(5, "Gostei muito");
		
	}

}
