package labs.day2Lab.bMain;

import java.time.LocalDate;
import java.util.List;

import labs.day2Lab.b.*;

public class Main {

	public static void main(String[] args) {
		Order myOrder1 = new Order(LocalDate.now(), 1, 100, 4);
		myOrder1.addOrderLine(2, 200, 3);
		myOrder1.addOrderLine(3, 400, 1);
		
		List<OrderLine> myOrderLineList = myOrder1.getOrderLines();
		
		System.out.println("Order Date"+myOrder1.getOrderDate());
		for(OrderLine ol:myOrderLineList) {
			System.out.println("=======");
			System.out.println("Order Line Number :"+ol.getOrderLineNum());
			System.out.println("Order Price :"+ol.getPrice());
			System.out.println("Order Quantity :"+ol.getQuantity());
			System.out.println("Order Date :"+ol.getOrder().getOrderDate());
			System.out.println("=======");
		}
	}

}
