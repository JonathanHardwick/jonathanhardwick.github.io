import java.awt.*;

public class Butterfly extends Critter {
	private int moves;
	
	public Color getColor() {
		return Color.YELLOW;
	}
	
	public String toString() {
		if (moves % 2 == 0) {
			return "x";
		} else {
			return "-";
		}
	}
	
	// N, W, N, E, repeat
	public Direction getMove() {
		moves = moves % 4 + 1;
		if (moves == 1 || moves == 3) {
			return Direction.NORTH;
		} else if (moves == 2) {
			return Direction.WEST;
		} else {
			return Direction.EAST;
		}
	}
}
