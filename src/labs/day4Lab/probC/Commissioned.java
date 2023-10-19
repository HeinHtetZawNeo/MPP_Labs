package labs.day4Lab.probC;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {

	private List<Order> orderList;
	private double commission;
	private int baseSalary;

	public Commissioned(String empId, double commission, int baseSalary, List<Order> orderList) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orderList = orderList;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		double totalGrossPay = baseSalary;

		int monthToRetrieve = (month - 1 == 0) ? 12 : month - 1;
		LocalDate orderDate;
		for (Order o : orderList) {
			orderDate = o.getOrderDate();
			if (orderDate.getMonthValue() == monthToRetrieve && orderDate.getYear() == year)
				totalGrossPay += o.getOrderAmount() * this.commission;
		}
		return totalGrossPay;
	}

}
