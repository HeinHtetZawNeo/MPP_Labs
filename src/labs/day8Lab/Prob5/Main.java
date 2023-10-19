package labs.day8Lab.Prob5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names, String::compareToIgnoreCase);
		
		List<String> myList = List.of(names);
		myList.stream().forEach(System.out::println);
		
	}

}
