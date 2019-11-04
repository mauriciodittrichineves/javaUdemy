package model.services;

import model.entitties.AluguelCarro;
import model.entitties.Fatura;

public class ServicoAluguel {
	private double precoPorDia;
	private double precoPorHora;
	
	private TaxaImpostoBrasil impostoBrasil;

	public ServicoAluguel(double precoPorDia, double precoPorHora, TaxaImpostoBrasil impostoBrasil) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.impostoBrasil = impostoBrasil;
	}
	double taxaBasica;
	public void notaPagamento(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getRetirada().getTime();
		long t2 = aluguelCarro.getDevolucao().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		if (horas <= 12) {
			taxaBasica = Math.ceil(horas) * precoPorHora;
		}
		else {
			taxaBasica = Math.ceil(horas / 24 ) * precoPorDia ;
		}
	double imposto = impostoBrasil.taxaImposto(taxaBasica);	
	aluguelCarro.setFatura(new Fatura(taxaBasica, imposto));
	
	
	
	}
	
	

}
