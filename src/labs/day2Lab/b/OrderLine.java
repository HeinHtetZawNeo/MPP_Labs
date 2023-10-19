package labs.day2Lab.b;

public class OrderLine {
	private int orderlinenum;
	private double price;
	private int quantity;
	private Order order;
	
	OrderLine(Order o, int orderNo, double price, int qty) {
		this.order = o;
		this.price = price;
		this.quantity = qty;
		this.orderlinenum = orderNo;
	}
	public int getOrderLineNum() {
		return this.orderlinenum;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public Order getOrder() {
		return this.order;
	}
}
