package entities;

public class PessoaJuridica extends DadosContribuinte {
	
	private int numeroFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double CalculaImposto() {
		double imposto = 0.0;
		if (numeroFuncionarios < 10) {
			imposto = rendaAnual * 0.16;
			
		} else {
			imposto = rendaAnual * 0.14;
		}
		return imposto;
	}
	
	
	
	
}
