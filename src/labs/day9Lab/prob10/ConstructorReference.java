package labs.day9Lab.prob10;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female candidates names
		Arrays.stream(list).filter((x) -> x.getGender().equals("Female")).forEach(x -> System.out.println(x.getName()));

		// Query 2 : Create an object by choosing suitable Interface to the specified
		// constructors(Totally 3 constructors)
		// using fourth type of Method Reference ClassName::new. Then print the object
		// status

		Function<String, Human> function = Human::new;
		Human ob = function.apply("Mr.A");
		System.out.println(ob);

		// Query 3 : Count the male candidates whose age is more than 30
		Function<Human[], Stream<Human>> function2 = Arrays::stream;
		long counter = function2.apply(list).filter(x -> x.getGender().equals("Male")).filter(x -> x.getAge() > 30)
				.count();
		System.out.println(counter);

	}

}
