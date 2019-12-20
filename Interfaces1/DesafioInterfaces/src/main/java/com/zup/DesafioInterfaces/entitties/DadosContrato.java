package com.zup.DesafioInterfaces.entitties;

import java.util.Date;

public class DadosContrato {
	
	int numeroContrato;
	Date inicioContrato;
	double valorContrato;
	
	public DadosContrato(int numeroContrato, Date inicioContrato, double valorContrato) {
		
		this.numeroContrato = numeroContrato;
		this.inicioContrato = inicioContrato;
		this.valorContrato = valorContrato;
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(Date inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	
	
	

}
