
public class Point {

	double x;
	double y;
	//creates instance variables for the x and y coordinates
	public Point(double xCoord, double yCoord) { 
		x = xCoord;
		y = yCoord;
	}
	//sets x to whatever double you gave it
	public void setX (double xCoord) {
		x = xCoord;
	}
	//returns the x coordinate
	public double getX () {
		return x;
	}
	//sets y to whatever double you gave it
	public void setY (double yCoord) {
		x = yCoord;
	}
	//returns the y coordinate
	public double getY() {
		return y;
	}
	//turns it into a string
	public String toString() {
		String orderedPair= "("+x+","+y+")";
		return orderedPair;
	}
}