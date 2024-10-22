import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class Canvas extends JPanel { 

  public void paintComponent( Graphics g ){
    super.paintComponent( g );
    
 /* creates a triangle for the prism, six rainbow-colored lines in specified places, and a line for the light entering the prism
    Triangle timothy = new Triangle( p, 300, 200 );
    Graphics2D g2 = (Graphics2D) g;
    this.setBackground(new Color(0,0,0));
    g.setColor(new Color(255,255,255));
    g2.setStroke(new BasicStroke(4));
    g.drawLine(183, 240, 0, 280);   //light
    g.setColor(new Color(245,48,76));
    g2.setStroke(new BasicStroke(10));
    g.drawLine(315, 230, 2000, 400);   //red
    g.setColor(new Color(244,169,50));
    g.drawLine(319, 240, 2000, 410);   //orange
    g.setColor(new Color(252,233,35));
    g.drawLine(332, 250, 2000, 420);   //yellow
    g.setColor(new Color(147,203,68));
    g.drawLine(337, 260, 2000, 430);   //green
    g.setColor(new Color(99,174,239));
    g.drawLine(342, 270, 2000, 440);   //blue
    g.setColor(new Color(140,115,199));
    g.drawLine(349, 280, 2000, 450);   //purple
    g.setColor(new Color(255,255,255));
    g2.setStroke(new BasicStroke(10));
    timothy.draw(g); //TRIANGLE  */
    
    
    //creates increasingly small rectangles of random colors (light enough colors to show up on a black background)
    Point recPoint = new Point (50,150);
    Rectangle rec = new Rectangle (recPoint, 300, 200);
    int red = 149; int green = 245; int blue = 126;
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(2));
    this.setBackground(new Color(0,0,0));
    for(int i = 0; i<25; i ++){
    	g.setColor(new Color(red,green,blue));
    	rec.draw(g);
    	rec.shrink(90);
    	int min = 50; int max = 225;
    	red = (int)Math.floor(Math.random() *(max - min + 1) + min);
    	green = (int)Math.floor(Math.random() *(max - min + 1) + min);
    	blue = (int)Math.floor(Math.random() *(max - min + 1) + min);
    	}
  }
}
