package program;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Object> list = new ArrayList<>();
		System.out.println("Entre com o número de contribuintes. ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com f para pessoa fisica, e j para pessoa Juridica");
			char tipoPessoa = sc.next().charAt(0);
			System.out.println(tipoPessoa);
			
			if (tipoPessoa == 'f'){
				System.out.println("Entre com o nome do contribuinte: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite a renda no Ano: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Entre com o valor gasto em saude no ano: ");
				double gastoSaude = sc.nextDouble();
				PessoaFisica contribuinte = new PessoaFisica(nome, rendaAnual, gastoSaude);
				list.add(contribuinte);
			} else {
				System.out.println("Entre com o nome do contribuinte: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite a renda no Ano: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Qual o numero de Funcionários: ");
				int numeroFuncionarios = sc.nextInt(); 
				PessoaJuridica contribuinte = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				list.add(contribuinte);
			}
			
			
			
		}
		System.out.println("Tributaveis:");
			for (Object contr : list) {
				System.out.println(contr);
			} 
		}

}
