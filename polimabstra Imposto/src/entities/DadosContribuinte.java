package entities;

public abstract class DadosContribuinte {

	private String nome;
	protected double rendaAnual;
	
	public DadosContribuinte () {
		
	}

	public DadosContribuinte(String nome, double rendaAnual) {
		
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public String toString() {
		
		return   nome + " - " +  String.format("%.2f", CalculaImposto());
	}
	

	
	

	public abstract double CalculaImposto();
	
	
}
