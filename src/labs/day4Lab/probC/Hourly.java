package labs.day4Lab.probC;

public class Hourly extends Employee{

	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage =hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(int month,int year) {
		return (this.hourlyWage*this.hoursPerWeek)*4;
	}

}
