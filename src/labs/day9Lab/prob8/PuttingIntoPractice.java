package labs.day9Lab.prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class PuttingIntoPractice {
	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		transactions.stream().filter(x -> x.getYear() >= 2011)
				.sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue())).forEach(System.out::println);
		// Query 2: What are all the unique cities where the traders work?
		transactions.stream().map(x -> x.getTrader().getCity()).distinct().forEach(System.out::println);
		// Query 3: Find all traders from Cambridge and sort them by name.
		transactions.stream().filter(x -> x.getTrader().getCity().equals("Cambridge")).map(x -> x.getTrader())
				.sorted((t1, t2) -> t1.getName().compareTo(t2.getName())).distinct().forEach(System.out::println);
		// Query 4: Return a string of all traders names sorted alphabetically.
		transactions.stream().map(x -> x.getTrader().getName()).sorted().distinct().forEach(System.out::println);
		// Query 5: Are there any trader based in Milan?

		Optional<Trader> milanTrader = transactions.stream().map(x -> x.getTrader())
				.filter(x -> x.getCity().equals("Milan")).findAny();
		System.out.println(milanTrader.isPresent());
		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		/*
		 * transactions.stream().map((Function<? super Transaction, ? extends
		 * Transaction>) x -> { if (x.getTrader().getCity().equals("Milan")) {
		 * x.getTrader().setCity("Cambridge_1"); } return x;
		 * }).forEach(System.out::println);
		 */
		transactions.stream().filter(x -> x.getTrader().getCity().equals("Milan")).map(x -> x.getTrader())
				.forEach(x -> x.setCity("Cambridge_2"));
		transactions.forEach(System.out::println);
		// Query 7: What's the highest value in all the transactions?
		Optional<Transaction> maxTransaction = transactions.stream()
				.max((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
		System.out.println(maxTransaction.get());
	}
}
