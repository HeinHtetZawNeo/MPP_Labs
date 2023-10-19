package labs.day7Lab.prob2.intfaces2;

public class Rectangle implements Polygon {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double[] getLengths() {
		double[] result = new double[4];
		result[0] = this.length;
		result[1] = this.length;
		result[2] = this.width;
		result[3] = this.width;
		return result;
	}
}
