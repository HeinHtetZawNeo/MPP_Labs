package labs.day4Lab.probC;

public abstract class Employee {
	private String empId;
	
	Employee(String empId){
		this.empId = empId;
	}
	
	public String getEmpId() {
		return this.empId;
	}
	public Paycheck calcCompensation(int month, int year) {
		return new Paycheck(calcGrossPay(month,year));
	}
	public abstract double calcGrossPay(int month,int year);
	
	public void print(int month, int year) {
		Paycheck pc = calcCompensation(month, year);
		
		System.out.printf("\nEmployee Id : %s \n", this.getEmpId());
		System.out.printf("Paystub: \n");
		System.out.printf("Gross Pay: %,.2f \n",pc.getGrossPay());
		System.out.printf("Fica: %,.2f \n",pc.getFica());
		System.out.printf("State: %,.2f \n",pc.getState());
		System.out.printf("Local: %,.2f \n",pc.getLocal());
		System.out.printf("Medicare: %,.2f \n",pc.getMedicare());
		System.out.printf("Social Security: %,.2f \n",pc.getSocialSecurity());
		System.out.printf("NET PAY: %,.2f \n",pc.getNetPay());
	}
}
