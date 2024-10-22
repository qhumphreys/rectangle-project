import java.awt.Graphics;
public class Triangle {
		Point top;
		double base;
		double height;
		//creates instance variables for the top left corner, base, and height
		public Triangle(Point toppy, double b, double h){
			top = toppy;
			base = b;
			height = h;
		}
		//sets the base equal to whatever double you give it
		public void setB (double b) {
			base = b;
		}
		//returns the base of the Triangle
		public double getB () {
			return base;
		}
		//sets the height equal to whatever double you give it
		public void setH (double h) {
			height = h;
		}
		//returns the height of the Triangle
		public double getH() {
			return height;
		}
		//sets the top left corner equal to whatever coordinates you give it
		public void setPoint(Point toppy) {
			top = toppy;
		}
		//returns the top left corner of the Triangle
		public Point getTop() {
			return top;
		}
		//determines the bottom right corner by changing the x and y coordinates of the top left point, returns a new point
		public Point getBottomRight() {
				return new Point(top.getX()+(0.5*base),top.getY()+height);
		}
		//determines the bottom left corner by changing the x and y coordinates of the top left point, returns a new point
		public Point getBottomLeft() {
				return new Point(top.getX()-(0.5*base),top.getY()+height);
			}
		//returns the Triangles information as a string
		public String toString() {
			return "[Triangle: top left Point: "+top.toString()+", base: "+base+", height: "+height+"]";
		}
		//decreases base and height by d percent
		public void shrink(double d) {
			height = 0.01*d*height;
			base = 0.01*d*base;
		}
		//draws four lines between the given points 
		public void draw(Graphics g) {
			g.drawLine((int)top.getX(),(int)top.getY(),(int)getBottomLeft().getX(),(int)getBottomLeft().getY());
			g.drawLine((int)top.getX(),(int)top.getY(),(int)getBottomRight().getX(),(int)getBottomRight().getY());
			g.drawLine((int)getBottomRight().getX(),(int)getBottomRight().getY(),(int)getBottomLeft().getX(),(int)getBottomLeft().getY());
		}
}
