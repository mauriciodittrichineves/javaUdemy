package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;
	protected Double salaryEmployee;

	public Employee() {
		super();
	}

	public Employee(String name, Integer hours, Double valuePerHour, Double salaryEmployee) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double payment(int hours, double valuePerHour) {
		salaryEmployee = hours * valuePerHour;
		return salaryEmployee;
	}

	public String toString() {
		return getName() + " - " + payment(hours, valuePerHour);
	}

}
