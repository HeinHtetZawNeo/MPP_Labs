package labs.day7Lab.prob1.partB;

import java.util.Objects;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name, salary);
//	}
//
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return e.name.equals(name) && e.salary == salary;
		}
		return false;
	}
//
//	@Override
//	public boolean equals(Employee e) {
//		//System.out.println(e.name.equals(name) && e.salary == salary);
//		return e.name.equals(name) && e.salary == salary;
//	}
	
}
