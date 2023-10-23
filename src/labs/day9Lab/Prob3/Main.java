package labs.day9Lab.Prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> mylist = Arrays.asList("abc", "ddcef", "aa", "c", "d");
		System.out.println(countWords(mylist, 'c', 'd', 3));
	}

	public static int countWords(List<String> words, char c, char d, int len) {

		return (int) words.stream().filter(x -> x.contains(c + "")).filter(x -> !x.contains(d + ""))
				.filter(x -> x.length() == len).count();

	}

}
