package projeto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
	private Date data;
	private double preco;
	private Cliente cliente;
	private List<Aplicacao> aplicacoes;

	public Compra(Date data, double preco, Cliente cliente) {
		this.data = data;
		this.preco = preco;
		this.cliente = cliente;
		aplicacoes = new ArrayList<Aplicacao>();
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

	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(List<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
