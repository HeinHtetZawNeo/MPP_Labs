package labs.day4Lab.probC;

import java.time.LocalDate;

public class Order {

	private String orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	
	public Order(String orderNo, LocalDate orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}
}
