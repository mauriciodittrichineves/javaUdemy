package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Declarando a váriavel Conta
		Account account;
		
		//Solicitando o numero da conta
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		//Solicitando o nome do titular da conta
		System.out.println("Enter account holder: ");
		//Entrando com uma leitura de linha antes, para que o programa não deixe de ler linha 1
		sc.nextLine();
		//Realizando a leitura da linha e inserindo na variavel temporária nome.
		String holder = sc.nextLine();
		
		//Oferecendo a realização de um deposito opcional.
		System.out.println("Is there an initial deposit (y/n) ?");
		char response = sc.next().charAt(0);
		
		
		//verificando se existe dep inicial, caso sim instancia se não instancisa sem
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			
		} else {
			account = new Account(number, holder);
		}
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(account);
		
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println(" ");
		System.out.print("Enter a withdraw value ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account Data: ");
		System.out.println(account);
		
		
		
		
		
		sc.close();
	}

}
