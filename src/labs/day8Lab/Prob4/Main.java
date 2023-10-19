package labs.day8Lab.Prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		Consumer<String> comInter = t -> System.out.println(t);
		fruits.forEach(comInter);

		fruits.stream().forEach((Consumer<String>) System.out::println);
	}

}
