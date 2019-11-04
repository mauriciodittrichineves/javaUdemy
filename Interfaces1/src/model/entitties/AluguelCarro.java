package model.entitties;

import java.util.Date;

public class AluguelCarro {
	private Date retirada;
	private Date devolucao;
	
	
	private Veiculos veiculo;
	private Fatura fatura;
	
	
	public AluguelCarro(Date retirada, Date devolucao, Veiculos veiculo) {
		super();
		this.retirada = retirada;
		this.devolucao = devolucao;
		this.veiculo = veiculo;
	}


	public Date getRetirada() {
		return retirada;
	}


	public void setRetirada(Date retirada) {
		this.retirada = retirada;
	}


	public Date getDevolucao() {
		return devolucao;
	}


	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}


	public Veiculos getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}


	public Fatura getFatura() {
		return fatura;
	}


	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	
}
