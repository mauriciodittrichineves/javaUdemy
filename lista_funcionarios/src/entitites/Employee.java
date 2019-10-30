package entitites;

public class Employee {

	
	// Declara os Atributos
	private int id;
	private String name;
	private double salary;
	
	//Declara a Função construtora
	public Employee (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	//Declara os Gets and Sets.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		salary += (salary * percentage/100);
	}
	
	
	
	// Declara a formatação do toString()
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	

}
