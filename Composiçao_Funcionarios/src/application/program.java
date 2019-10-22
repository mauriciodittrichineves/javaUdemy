package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat ddmmyy = new SimpleDateFormat("dd/MM/yyy");

		///////////////// Instanciando Worker//////////////////////

		// Declarando as Variáveis para gerar o Worker

		System.out.println("Enter Department name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		// Instanciando o Worker
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		// Declarando as Variáveis para gerar os contratos
		System.out.println("How many contracts to this worker ? ");
		int contractsWorker = sc.nextInt();

		for (int i = 1; i <= contractsWorker; i++) {
			System.out.println("Enter contract #" + (i) + "data:");
			System.out.print("DATE (DD/MM/YYYY): ");
			Date contractDate = ddmmyy.parse(sc.next());
			System.out.print("Value per Hour: ");
			double contractValue = sc.nextDouble();
			System.out.println("Duration: ");
			int contractHour = sc.nextInt();

			HourContract contract = new HourContract(contractDate, contractValue, contractHour);

			// Após instanciar o Objeto, devemos colocar ele na lista, para isso foi criado
			// um metodo
			// em Worker.

			worker.addContract(contract);

		}
		
		
		System.out.println("");
		// Solicitando o mês e ano para solicitar a pesquisa e exibir os contratos referentes.
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String my = sc.next();
		int month = Integer.parseInt(my.substring(0, 2));
		int year = Integer.parseInt(my.substring(3, 7));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + month + "/" + year + ":  " + String.format("%.2f", worker.income(year, month)));
		
		
		
		

		sc.close();
	}

}
