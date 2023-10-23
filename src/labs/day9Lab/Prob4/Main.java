package labs.day9Lab.Prob4;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		printSquare(4);
	}

	public static void printSquare(int num) {
		Stream.iterate(1, n -> n + 1).map(x -> x * x).limit(num).forEach(System.out::println);
	}

}
