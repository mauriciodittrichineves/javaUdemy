package system;

import java.util.Locale;
import java.util.Scanner;

import entities.alunos;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented ? ");
		int nestudantes = sc.nextInt();
		
		
		alunos[] vect = new alunos[nestudantes];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Please, enter the host name:  ");
			String name = sc.nextLine();
			
			
			System.out.println("Please, enter email from host");
			String email = sc.nextLine();
			
			
			System.out.println("Wich room will be hosted ?  ");
			int bedroom = sc.nextInt();
			
			vect[i] = new alunos(name, email, bedroom);
						
	}
		
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.println("Name: " + vect[i].getName());
			System.out.println("Email: " + vect[i].getEmail());
			System.out.println("Bedroom " + vect[i].getBedroom());
			System.out.println("");
							
		}
		
		for (int i = 0; i < 9; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + " " + vect[i].getEmail());
			} else {
				System.out.println("");
			}
			
		}
		
	
		
		sc.close();
	}
}
