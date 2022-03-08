package projeto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Compra {
	private Date data;
	private double preco;
	private Cliente cliente;
	private List<Aplicacao> aplicacoes;
	private Saco saco;

	public Compra(Date data, double preco, Cliente cliente, Saco saco) {

		this.data = data;

		this.preco = saco.valorConteudo();

		this.cliente = cliente;
		this.saco = saco;
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

	public int compraPorSemana() {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario.get(Calendar.WEEK_OF_YEAR);
	}

}
