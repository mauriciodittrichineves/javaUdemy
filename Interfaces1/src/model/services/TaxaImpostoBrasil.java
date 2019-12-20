package model.services;

public class TaxaImpostoBrasil implements TaxaServico {

	public double taxaImposto(double taxaImposto) {
		
		if(taxaImposto  <= 100) {
			
			return	taxaImposto * 0.2;
			 
		}
		else {
			return taxaImposto * 0.15;
		}
		
		
	}

}
