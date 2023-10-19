package labs.day3Lab.prob2;

public class Apartment {
	private double rent;
	{
		rent = 0.0;
	}

	public Apartment() {
	}

	public Apartment(double rent) {
		this.rent = rent;
	}

	public double getRent() {
		return this.rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
}
