package entities;

public class OutsourcedEmployee extends Employee {
	private double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour, additionalCharge);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment(int hours, double valuePerHour) {
		super.payment(hours, valuePerHour);
		salaryEmployee += (additionalCharge * 1.1);
		return salaryEmployee;
	}

}
