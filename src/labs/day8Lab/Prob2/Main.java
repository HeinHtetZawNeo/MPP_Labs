package labs.day8Lab.Prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import labs.day8Lab.Prob3.FuntorCompareByPrice;
import labs.day8Lab.Prob3.FuntorCompareByTitle;

public class Main {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Product A", 11.0, 2000));
		productList.add(new Product("Product B", 1.0, 2000));
		productList.add(new Product("Product C", 6.0, 2000));
		productList.add(new Product("Product D", 5.0, 2000));
		productList.add(new Product("Product A", 100.0, 2000));
		productList.add(new Product("Product F", 12.0, 2000));

		Collections.sort(productList, new FuntorCompareByPrice());
		productList.stream().forEach(System.out::println);

		Collections.sort(productList, new FuntorCompareByTitle());
		productList.stream().forEach(System.out::println);

		Comparator<Product> compareByPrice = (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice());
		productList.stream().sorted(compareByPrice).forEach(System.out::println);

		Comparator<Product> compareByTitle = (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
		productList.stream().sorted(compareByTitle).forEach(System.out::println);

		Comparator<Product> compareByTitleAndPrice = (o1, o2) -> {
			if (o1.getTitle().equals(o2.getTitle()))
				return Double.compare(o1.getPrice(), o2.getPrice());
			else
				return o1.getTitle().compareTo(o2.getTitle());
		};
		productList.stream().sorted(compareByTitleAndPrice).forEach(System.out::println);
	}

}
