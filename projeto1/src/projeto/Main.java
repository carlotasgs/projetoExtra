package projeto;

public class Main {

	public static void main(String[] args) {

		AppStore c = new AppStore();

		// Registar novos utilizadores e atribuir automaticamente números únicos
		Utilizador programador1 = new Programador("João", 25);
		Utilizador programador2 = new Programador("Pedro", 30);
		Utilizador cliente1 = new Cliente("Ana", 40);
		Utilizador cliente2 = new Cliente("Joana", 12);

		// Incluir novas aplicações com a informação necessária
		Aplicacao inst = new Aplicacao("insta", 2.0, TipoAplicacao.Entertainment, (Programador) programador1);
		Aplicacao face = new Aplicacao("facebook", 10.5, TipoAplicacao.Entertainment, (Programador) programador2);

		c.adicionarUtilizadorAApp(programador1);
		c.adicionarUtilizadorAApp(programador2);
		c.adicionarUtilizadorAApp(cliente1);
		c.adicionarUtilizadorAApp(cliente2);

		c.adicionarAplicacaoAApp(inst);
		c.adicionarAplicacaoAApp(face);

		c.listarUtilizadores();

		System.out.println(programador1.getId());
		System.out.println(programador2.getId());

		((Cliente) cliente1).comprarAplicacao(inst);
		((Cliente) cliente1).comprarAplicacao(face);

		// inst.avaliar(5, "Gostei muito");

		c.listarOrdenadoPorNome();

	}

}
