package br.com.zup.exercicioarquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import br.com.zup.exercicioarquivos.entitties.SaidaArquivos;

public class App {
	public static void main(String[] args) {
		File arquivo = new File("C:\\Trabalhos Mauricio\\JAVA\\JAVA UDEMY\\Desafio Arquivos fonte\\leituras\\source.csv");
		//Array que recebe os arquivos após a leitura.
		List<String> lista = new ArrayList<>();
		//Variaveis para montagem do Objeto.
		String nome = null;
		double preco;
		int quantidade; 
		//Lista para receber objetos e montar arquivo.
		List<String> listaFinal = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo.toString()))) {
			String linha ;
			//Lendo arquivo e gerando a lista para salvar.
			while ((linha = br.readLine())!= null) {
				//System.out.println(linha);
				lista.add(linha);
				String palavras[] = linha.split(Pattern.quote(","));
				nome = palavras[0];
				preco = Double.parseDouble(palavras[1]);
				quantidade = Integer.parseInt(palavras[2]);
				SaidaArquivos produto = new SaidaArquivos(nome,preco, quantidade);
				String produtoLinha = produto.getNome() + " " + produto.getvalorEstoque();
				listaFinal.add(produtoLinha);
			}
		} catch (IOException e) {
			System.out.println("ERRO: " + e);
			e.printStackTrace();
		}
		
		
		File arquivoNovo = new File ("C:\\Trabalhos Mauricio\\JAVA\\JAVA UDEMY\\Desafio Arquivos fonte\\leituras\\out\\summary.csv");

		try {
			
			arquivoNovo.createNewFile();	
		}
		catch(SecurityException e) {
			System.out.println("Erro: " + e);
		}
		catch(IOException e) {
			System.out.println("Erro: " + e);
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoNovo, true))){
			for (String li : listaFinal) {
				bw.write(li);
				bw.newLine();
			}
		}
		catch(IOException e) {
			
		}
		System.out.println(listaFinal);
		

	}
}
