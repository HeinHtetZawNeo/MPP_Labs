package labs.day7Lab.prob2.intfaces2;

public class Ellipse implements ClosedCurve {

	private double semiaxis;
	private double elateral;

	
	public Ellipse(double semiaxis, double elateral) {
		super();
		this.semiaxis = semiaxis;
		this.elateral = elateral;
	}


	@Override
	public double computePerimeter() {
		return 4 * this.semiaxis * this.elateral;
	}

}
