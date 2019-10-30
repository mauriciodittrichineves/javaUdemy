package br.com.zup.exercicioTryCatch;

import java.util.Locale;
import java.util.Scanner;

import br.com.zup.exercicioTryCatch.exceptions.AccountExceptions;

public class App {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta");
			System.out.println("Digite o Numero da Conta");
			int conta = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do Proprietário da conta.");
			String nome = sc.nextLine();
			System.out.println("Digite o Saldo atual da conta.");
			double saldo = sc.nextDouble();
			System.out.println("Digite o Limite da conta");
			double limiteConta = sc.nextDouble();
			System.out.println("Entre com o valor do saque");
			double valorSaque = sc.nextDouble();
			saldo = deposito(valorSaque, saldo, limiteConta);
			 
			System.out.println("Novo Saldo: " + saldo);
		} catch (AccountExceptions e) {
			System.out.println(e.getMessage());
		}

	}

	public static double  deposito (double saque, double saldo, double limiteConta) {
    	System.out.println("Entrou na função");
		if (saldo < saque) {
    		throw new AccountExceptions("Saldo insuficiente em conta.");
    	} if (saque > limiteConta) {
    		throw new AccountExceptions ("Valor Solicitado ultrapassa o limite de saque diário");
    	} if (saldo - saque < 0) {
    		throw new AccountExceptions ("Não é possível realizar este saque, saldo insuficiente");
    	} 
    	System.out.println("passou pelos trows");
    	 saldo -= saque;
    	return saldo;
    }

}
