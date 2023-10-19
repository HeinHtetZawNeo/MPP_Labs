package labs.day8Lab.Prob3;

import java.util.Comparator;

import labs.day8Lab.Prob2.Product;

public class FuntorCompareByPrice implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
