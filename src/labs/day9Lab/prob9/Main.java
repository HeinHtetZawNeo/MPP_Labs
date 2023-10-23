package labs.day9Lab.prob9;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		List<Dish> dishList = Dish.menu;

		System.out.println("Any Vegetrian :" + isAnyVegetrian(dishList));
		System.out.println("Any Healthy Dish :" + isAnyHealthyMenu(dishList));
		System.out.println("Any Unhealthy Dish :" + isAnyUnhealthyMenu(dishList));
		System.out.print("First Meat Dish :");
		getFirstMeatDish(dishList).ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

		System.out.println("Total Calories :" + calculateTotalCalories(dishList));
		System.out.println("Total Calories :" + calculateTotalCaloriesMethodReference(dishList));
	}

	public static boolean isAnyVegetrian(List<Dish> dishList) {
		Optional<Dish> vegetarianDish = dishList.stream().filter(x -> x.isVegetarian() == true).findAny();
		return vegetarianDish.isPresent();
	}

	public static Boolean isAnyHealthyMenu(List<Dish> dishList) {
		return dishList.stream().anyMatch(x -> x.getCalories() < 1000);
	}

	public static boolean isAnyUnhealthyMenu(List<Dish> dishList) {
		Optional<Dish> healthyDish = dishList.stream().filter(x -> x.getCalories() > 1000).findAny();
		return healthyDish.isPresent();
	}

	public static Optional<Dish> getFirstMeatDish(List<Dish> dishList) {
		return dishList.stream().filter(x -> x.getType().equals(Dish.Type.MEAT)).findFirst();
	}

	public static int calculateTotalCalories(List<Dish> dishList) {
		return dishList.stream().map(x -> x.getCalories()).reduce(0, (x1, x2) -> x1 + x2);
	}

	public static int calculateTotalCaloriesMethodReference(List<Dish> dishList) {
		return dishList.stream().map(Dish::getCalories).reduce(0, Integer::sum);
	}
}
