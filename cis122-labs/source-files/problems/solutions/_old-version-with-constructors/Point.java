public class Point {
	int x;
	int y;

	public Point(int initX, int initY) {
		x = initX;
		y = initY;
	}

	public double distanceFromOrigin() {
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}

	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

