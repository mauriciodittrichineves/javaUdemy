package Application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Object> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + "data: ");
			System.out.println("Outsorced (y/n) :");
			char outsourced = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.println("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(employee);
				
			} else {
				Employee employee = new Employee(name, hours, valuePerHour, null);
				list.add(employee);
			}

		}
		//APÓS INSTANCIAR AS VARIAVEIS.
		System.out.println("PAYMENTS:");
		System.out.println("");
		for (Object x : list) {
			System.out.println(x);
		}
	sc.close();	
	}

}
