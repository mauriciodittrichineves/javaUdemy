package Application;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1430.44);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 650.00);

		// @@@@@@@@@@@@@@@@ UPCASTING @@@@@@@@@@@@@//
		// � possivel atribuir um elemento da subclasse para a super classe.
		Account acc1 = bacc;
		// � poss�vel instanciar um objeto da super classe tipo Account com um da
		// subclasse
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1021, "Aleksander Ivannovic", 0.0, 23041.02);

		// @@@@@@@@@@@@@@@@ DOWNCASTING @@@@@@@@@@@@@//

		/*
		 * Para realizar o DownCasting, o sistema ir� acusar erro, pois n�o � poss�vel
		 * implementar uma vari�vel da SuperClasse para uma vari�vel de SubClasse.para
		 * isso devemos indicar um valor de subclasse para a super classe, conforme
		 * abaixo.
		 */

		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(1200.00);

		/*
		 * J� o comando abaixo, tende a quebrar o c�digo, pois a BusinessAcount que est�
		 * recebendo o acc3 que na verdade foi atribuido com uma Savings Account. Como a
		 * classe BusinessAccount n�o � um extends de SavingsAccount, n�o poderemos
		 * realizar o DownCasting
		 */

		// BusinessAccount acc5 = (BusinessAccount)acc3;

		/*
		 * Para evitar o erro acima reportado, podemos utilizar a palavra reservada
		 * instanceof com ela conseguuiremos verificar se o obj � mesmo uma inst�ncia do
		 * outro.
		 */

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			System.out.println("Foi poss�vel instanciar ");
			acc5.loan(200.00);
			System.out.println("LOAN !!!");
		}

		/*
		 * Ent�o para conseguir a inst�ncia com o objeto acc3 podemos verificar se ela �
		 * uma inst�ncia da outra classe, no caso a SavingsAccount.
		 */
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("LOAN 2 !!!");
		}
		
		Account acc12 = new Account(12020, "Mauraum Dittrichi", 33221.14);
		acc12.withdraw(3200);
		System.out.println(acc12.getBalance());
		
		Account acc13 = new SavingsAccount(12422, "Cris Tomanik", 120244.32, 2.32);
		acc13.withdraw(14224.00);
		System.out.println(acc13.getBalance());
		
		
		Account teste2 = new SavingsAccount(1212, "Mauricio Neves", 12402.00, 1.2);
		teste2.withdraw(120.00);
		System.out.println(teste2.getBalance());
		
		Account teste3 = new BusinessAccount(1212, "Mauricio Dittrichi", 12402.00, 1.2);
		teste3.withdraw(120.00);
		System.out.println(teste3.getBalance());
		
		
	}
}
