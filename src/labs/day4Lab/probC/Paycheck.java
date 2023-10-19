package labs.day4Lab.probC;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socicalSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socicalSecurity;
	}

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
		this.fica = 0.23;
		this.state = 0.05;
		this.local = 0.01;
		this.medicare = 0.03;
		this.socialSecurity = 0.075;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public void print() {
		System.out.printf("Gross Pay: /d", this.grossPay);
		System.out.printf("Fica: /d", this.fica);
	}

	public double getNetPay() {
		double combineTax = this.fica + this.state + this.local + this.medicare + this.socialSecurity;
		return this.grossPay * (1 - combineTax);
	}
}
