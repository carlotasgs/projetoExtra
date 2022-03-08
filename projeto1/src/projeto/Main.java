package projeto;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

		AppStore c = new AppStore();

		// Registar novos utilizadores e atribuir automaticamente n�meros �nicos
		Utilizador programador1 = new Programador("Jo�o", 25);
		Utilizador programador2 = new Programador("Pedro", 30);
		Utilizador cliente1 = new Cliente("Ana", 40);
		Utilizador cliente2 = new Cliente("Joana", 12);

		// Incluir novas aplica��es com a informa��o necess�ria
		Aplicacao inst = new Aplicacao("insta", 2.0, TipoAplicacao.Entertainment, (Programador) programador1);
		Aplicacao face = new Aplicacao("facebook", 10.5, TipoAplicacao.Entertainment, (Programador) programador2);
		Aplicacao youtube = new Aplicacao("yt", 3.0, TipoAplicacao.Games, (Programador) programador2);

		c.adicionarUtilizadorAApp(programador1);
		c.adicionarUtilizadorAApp(programador2);
		c.adicionarUtilizadorAApp(cliente1);
		c.adicionarUtilizadorAApp(cliente2);

		c.adicionarAplicacaoAApp(inst);
		c.adicionarAplicacaoAApp(face);
		c.adicionarAplicacaoAApp(youtube);

		c.listarUtilizadores();

		System.out.println(programador1.getId());
		System.out.println(programador2.getId());

		// Realizar compras de aplica��es.
		((Cliente) cliente1).comprarAplicacao(inst, c);
		((Cliente) cliente1).comprarAplicacao(face, c);
		((Cliente) cliente2).comprarAplicacao(face, c);

		System.out.println(c.getCalendario().getTime());
		System.out.println(c.getCalendario().get(Calendar.WEEK_OF_YEAR));

		c.mudarData(9, 3, 2022);

		System.out.println(c.getCalendario().getTime());
		System.out.println(c.getCalendario().get(Calendar.WEEK_OF_YEAR));

		// Listar todos os utilizadores da App Store. Para cada utilizador � mostrado o
		// nome, idade, e n�mero de utilizador.
		c.listarUtilizadores();

		// Atribuir a uma aplica��o uma avalia��o (e coment�rios) dados por um
		// utilizador e atualizar a classifica��o do programador e da aplica��o.
		inst.avaliar(((Cliente) cliente1), 2);
		((Programador) programador1).getMediaAvaliacao();
		inst.getMediaAvaliacao();

		((Cliente) cliente1).avaliar(face);
		((Cliente) cliente1).avaliar(inst);
		((Cliente) cliente1).avaliar(youtube);

		// Fazer listagens seletivas das apps por categoria e por classifica��o dos
		// utilizadores.
		c.listaPorClassificacao(2);
		c.listaPorCategoria(TipoAplicacao.Entertainment);

		// Fazer listagens ordenadas das apps por nome, por n�mero de vendas
		c.listarOrdenadoPorNome();
		c.listarPorNumeroVendas();

		// Listar as classifica��es e coment�rios (se houver) de uma aplica��o em
		// concreto.
		inst.listarClassificacoes();

		// Listar as aplica��es de um utilizador em concreto
		((Cliente) cliente1).listarAplicacoes();

		// Imprimir o valor total que a App Store recebeu do conjunto dos seus
		// utilizadores.
		c.dinheiroPorAplicacao();

		// Imprimir o valor total que cada programador recebeu do conjunto das suas
		// apps.
		((Programador) programador1).getTotalCompras();

	}

}
