package labs.day8Lab.Prob2.Problem2TaskD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	//enum to select compare method
	
	enum SortMethod{
		 BY_PRICE,BY_TITLE
	}
	
	static void sort(List<Product> list,SortMethod meth){
		list.sort((o1,o2)->{
			if(meth==SortMethod.BY_PRICE) {
				return o1.getPrice()<o2.getPrice()?-1:1;
			}
			return o1.getTitle().compareTo(o2.getTitle());
		});
	}
	
	
	public static void main(String[]args) {
		Product one = new Product("Bike",120.5,1);
		Product two = new Product("Motor Bike",210.5,2);
		Product three = new Product("Baby Bike",155.5,2);
		Product four = new Product("Hover board",50.5,1);
		
		List<Product>list= new ArrayList<>() {{add(one);add(two);add(three);add(four);}};
		
		sort(list,SortMethod.BY_PRICE);
		System.out.println(list);
		
		sort(list,SortMethod.BY_TITLE);
		System.out.println(list);
	}
		
}
