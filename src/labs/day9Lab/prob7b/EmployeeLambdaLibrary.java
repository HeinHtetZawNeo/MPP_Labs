package labs.day9Lab.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeLambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> query1 = (list, salary,
			filterChar) -> list.stream().filter(x -> x.getSalary() > salary)
					.filter(x -> x.getLastName().charAt(0) > filterChar).filter(x -> x.getLastName().charAt(0) <= 'Z')
					.map(x -> x.getFirstName() + " " + x.getLastName()).sorted().collect(Collectors.joining(", "));
}
