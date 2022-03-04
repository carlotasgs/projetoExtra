package projeto;

import java.util.Date;

public class Compras {
	private Date data;
	private double preco;
	private int numeroAplicacoes;
	
	public Compras(Date data, double preco, int numeroAplicacoes) {
		this.data = data;
		this.preco = preco;
		this.numeroAplicacoes = numeroAplicacoes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumeroAplicacoes() {
		return numeroAplicacoes;
	}

	public void setNumeroAplicacoes(int numeroAplicacoes) {
		this.numeroAplicacoes = numeroAplicacoes;
	}
	
	
	
	
}
