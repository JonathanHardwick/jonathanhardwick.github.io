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
	
	public int quadrant() {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		} else {
			return 0;
		}
	}
	
	public void flip() {
		int temp = x;
		x = -y;
		y = -temp;
	}
}

