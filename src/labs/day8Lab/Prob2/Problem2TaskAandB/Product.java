package Lab8.Problem2TaskAandB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
	
	
	public static void main(String[]args) {
		Product one = new Product("Bike",120.5,1);
		Product two = new Product("Motor Bike",210.5,2);
		Product three = new Product("Baby Bike",155.5,2);
		Product four = new Product("Hover board",50.5,1);
		
		List<Product>list= new ArrayList<>() {{add(one);add(two);add(three);add(four);}};
		
		Collections.sort(list,new PriceComparator());
		System.out.println(list);
		
		Collections.sort(list,new TitleComparator());
		System.out.println(list);
	}
}
