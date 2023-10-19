package labs.day2Lab.b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDate orderDate;
	private List<OrderLine> orderLines;
	
	public Order(LocalDate orderDate,int orderNo,double price,int qty) {
		this.orderDate = orderDate;
		
		this.orderLines = new ArrayList<OrderLine>();
		this.orderLines.add(new OrderLine(this,orderNo,price,qty));
	}
	
	public void addOrderLine(int orderNo,double price,int qty) {
		this.orderLines.add(new OrderLine(this, orderNo, price, qty));
	}
	
	public List<OrderLine> getOrderLines(){
		return this.orderLines;
	}
	public LocalDate getOrderDate() {
		return this.orderDate;
	}
}
