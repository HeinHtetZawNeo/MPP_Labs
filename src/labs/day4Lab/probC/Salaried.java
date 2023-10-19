package labs.day4Lab.probC;

public class Salaried extends Employee {

	private int salary;

	public Salaried(String empId, int salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		return this.salary;
	}

}
