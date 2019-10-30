package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entitites.Employee;

public class Program {
	public static void main(String[] args) {
	
	//Seta linguagem para ingles
	Locale.setDefault(Locale.US);
	
	//Atribui um objeto Scanner
	Scanner sc = new Scanner(System.in);
	
	//Pergunta quantos empregados serão cadastrados.
	System.out.println("How many employees will be registered ? ");
	
	//Solicita ao usuário o numero de funcionários que serão cadastrados.
	int ne = sc.nextInt();
	
	//Cria um Array de funcionários que terá a função construtora.
	Employee[] vect = new Employee[ne];
	
	//Cria a Lista de usuários
	List <Employee> list = new ArrayList<>();
	
	
	
	// Solicitando os dados e instanciando os objetos.
	for (int i = 0; i < vect.length; i++) {
		System.out.println("Enter with Employee Code: ");
		int id = sc.nextInt();
		System.out.println("Enter with the Employee Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter with the Employee Salary: ");
		double salary = sc.nextDouble();
		
		list.add(new Employee(id, name, salary));
		
	}
	
	// Inserindo um aumento de salário
	
	System.out.println();
	System.out.print("Enter the employee id that will have salary increase: ");
	int id = sc.nextInt();
	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	if (emp == null) {
		System.out.println("This id does not exist!");
	}
	else {
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
	}
	
	
	
	// Exibindo Funcionarios da Lista.
	for (Employee obj : list) {
		System.out.println(obj);
	}
	
	
	
	sc.close();
	}
}
