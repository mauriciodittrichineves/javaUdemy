package model.entitties;

public class Fatura {
	public double taxaBasica;
	public double imposto;
	
	
	public Fatura(double taxaBasica, double imposto) {
		this.taxaBasica = taxaBasica;
		this.imposto = imposto;
	}


	public double getTaxaBasica() {
		return taxaBasica;
	}


	public void setTaxaBasica(double taxaBasica) {
		this.taxaBasica = taxaBasica;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getPagamentoTotal() {
		return getTaxaBasica() + getImposto();
	}
	
	

}
