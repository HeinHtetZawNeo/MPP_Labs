package labs.day7Lab.prob2.intfaces2;

public interface Polygon extends ClosedCurve {
	 default double computePerimeter() {
		double result = 0.0;
		for (double d : getLengths()) {
			result += d;
		}
		return result;
	}

	double[] getLengths();
}
