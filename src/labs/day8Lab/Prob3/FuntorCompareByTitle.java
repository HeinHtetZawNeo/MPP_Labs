package labs.day8Lab.Prob3;

import java.util.Comparator;

import labs.day8Lab.Prob2.Product;

public class FuntorCompareByTitle implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
