package labs.day9Lab.Prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		// streamSection(nextStream(), 2, 5).forEach(System.out::println);
		streamSection(nextStream(), 6, 8).forEach(System.out::println);
	}

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n+1).skip(m);
	}

	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}
