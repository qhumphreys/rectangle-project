import java.awt.Graphics;
public class Rectangle {
	Point topLeft;
	double width;
	double height;
	//creates instance variables for the top left corner, width, and height
	public Rectangle(Point topL, double w, double h){
		topLeft = topL;
		width = w;
		height = h;
	}
	//sets the width equal to whatever double you give it
	public void setW (double w) {
		width = w;
	}
	//returns the width of the rectangle
	public double getW () {
		return width;
	}
	//sets the height equal to whatever double you give it
	public void setH (double h) {
		height = h;
	}
	//returns the height of the rectangle
	public double getH() {
		return height;
	}
	//sets the top left corner equal to whatever coordinates you give it
	public void setPoint(Point topL) {
		topLeft = topL;
	}
	//returns the top left corner of the rectangle
	public Point getTopLeft() {
		return topLeft;
	}
	//determines the top right corner by changing the x and y coordinates of the top left point, returns a new point
	public Point getTopRight() {
		return new Point(topLeft.getX()+width,topLeft.getY());
	}
	//determines the bottom right corner by changing the x and y coordinates of the top left point, returns a new point
	public Point getBottomRight() {
			return new Point(topLeft.getX()+width,topLeft.getY()+height);
	}
	//determines the bottom left corner by changing the x and y coordinates of the top left point, returns a new point
	public Point getBottomLeft() {
			return new Point(topLeft.getX(),topLeft.getY()+height);
		}
	//returns the rectangles information as a string
	public String toString() {
		return "[Rectangle: top left Point: "+topLeft.toString()+", width: "+width+", height: "+height+"]";
	}
	//decreases width and height by d percent
	public void shrink(double d) {
		height = 0.01*d*height;
		width = 0.01*d*width;
	}
	//draws four lines between the given points 
	public void draw(Graphics g) {
		g.drawLine((int)topLeft.getX(), (int)topLeft.getY(), (int)getTopRight().getX(), (int)getTopRight().getY());
		g.drawLine((int)topLeft.getX(), (int)topLeft.getY(), (int)getBottomLeft().getX(), (int)getBottomLeft().getY());
		g.drawLine((int)getTopRight().getX(), (int)getTopRight().getY(), (int)getBottomRight().getX(), (int)getBottomRight().getY());
		g.drawLine((int)getBottomLeft().getX(), (int)getBottomLeft().getY(), (int)getBottomRight().getX(), (int)getBottomRight().getY());
	}
	
}