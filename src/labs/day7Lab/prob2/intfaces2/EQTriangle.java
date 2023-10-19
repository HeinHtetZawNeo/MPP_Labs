package labs.day7Lab.prob2.intfaces2;

public class EQTriangle implements Polygon {

	private double side;

	@Override
	public double[] getLengths() {
		double[] result = new double[4];
		result[0] = this.side;
		result[1] = this.side;
		result[2] = this.side;
		return result;
	}

	public EQTriangle(double side) {
		super();
		this.side = side;
	}

}
