package Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		method1();

	}

	public static void method1() {
		System.out.println("***Method1 Start***");
		method2();
		System.out.println("***Method1 Stop***");

	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-->Method2 Start<--");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Voc� digitou uma posi��o errada entre com o codigo correto: ");
			e.printStackTrace();
			sc.next();//colocado apenas para parar o programa e conseguir ver o erro
		} catch (InputMismatchException e) {
			System.err.println("Entre apenas com numeros.");
			e.printStackTrace();
		}
		System.out.println("-->Method2 Stop<--");
		sc.close();
	}
}
//ArrayIndexOutOfBoundsException
