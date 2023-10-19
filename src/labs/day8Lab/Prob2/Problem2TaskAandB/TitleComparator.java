package labs.day8Lab.Prob2.Problem2TaskAandB;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
