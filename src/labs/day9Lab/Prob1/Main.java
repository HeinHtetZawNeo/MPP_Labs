package labs.day9Lab.Prob1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> myStream = Arrays.asList("Bill", "Thomas", "Mary").stream();
		System.out.println(myStream.collect(Collectors.joining(",")));
	}

}
