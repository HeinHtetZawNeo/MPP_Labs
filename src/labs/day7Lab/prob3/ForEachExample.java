package labs.day7Lab.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		list.forEach(new myCustomComsumer());

	}

	// implement a Consumer
}

class myCustomComsumer implements Consumer {

	@Override
	public void accept(Object t) {
		System.out.println(((String) t).toUpperCase());
	}

}