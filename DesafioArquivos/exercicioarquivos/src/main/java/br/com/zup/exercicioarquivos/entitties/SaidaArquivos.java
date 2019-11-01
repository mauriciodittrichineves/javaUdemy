package br.com.zup.exercicioarquivos.entitties;

public class SaidaArquivos {
	
		private String nome;
		private double preco;
		private int quantidade;
		private double valorEstoque;
		
		public SaidaArquivos(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
		
		public void setvalorEstoque() {
			this.valorEstoque = linhaSaida(preco, quantidade);
		}
		public double getvalorEstoque() {
			valorEstoque = linhaSaida(preco, quantidade);
			return valorEstoque;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		
		
		public double linhaSaida(double preco, int quantidade) {
			valorEstoque = preco * quantidade;
			return valorEstoque;
		}
		
		
		
}
