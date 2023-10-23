package labs.day9Lab.Prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Set<String>> mylist = new ArrayList<Set<String>>();
		Set<String> myset1 = new HashSet<String>();
		myset1.add("A");
		myset1.add("B");
		mylist.add(myset1);

		Set<String> myset2 = new HashSet<String>();
		myset2.add("D");
		mylist.add(myset2);

		Set<String> myset3 = new HashSet<String>();
		myset3.add("1");
		myset3.add("3");
		myset3.add("5");
		mylist.add(myset3);

		Set<String> result = union(mylist);
		result.forEach(System.out::println);
	}

	public static Set<String> union(List<Set<String>> sets) {
		return sets.stream().flatMap(x -> x.stream()).collect(Collectors.toSet());

	}

}
