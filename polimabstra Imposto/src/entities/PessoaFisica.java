package entities;

public class PessoaFisica extends DadosContribuinte {

	private double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	
	
	
	
	
	
	@Override
	public double CalculaImposto() {
		double imposto = 0.0;
		if (rendaAnual < 20000.00) {
			imposto = rendaAnual * 0.16;
			imposto -= (gastoSaude * 0.5);
		} else {
			imposto = rendaAnual * 0.25;
			imposto -= (gastoSaude * 0.5);
		}
		
		return  imposto;
	}
	
	
	
	
	
}
