package labs.day9Lab.Prob2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(3, 4, 5, 6, 21, 31, 44, 1, 2, 4, -4);

		// change to summaryStatic
		IntSummaryStatistics listSummary = mylist.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(listSummary.getMax());
		System.out.println(listSummary.getMin());

	}

}
