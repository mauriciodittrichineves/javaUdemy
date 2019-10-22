import java.util.Locale;
public class Main {

	public static void main(String[] args) {

		System.out.println("Hello Worold!!!");
		System.out.println("Mundo véio sem porteira");
		
		int y = 32;
		
		System.out.print(y);
		
		System.out.println("");
		double x = 12.2002;
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		//Para concatenação utilizar o operador +
		System.out.println("O resultado da soma é " + x);
		//Concatenação utilizando o printf deve utilizar:
		//%f e no final deve acompanhar a variavel exemplo:
		System.out.printf("Resultado = %.2f metros%n", x);
		//O valor de x substitui o %.2f
		String nome = "Mauricio";
		int idade = 33;
		double renda = 22.50;
		System.out.printf("%s tem %d anos e seu saldo atual é : R$ %.2f reais %n",nome, idade, renda);
		
		
		
		
		
		
		
		
		
	}

}
