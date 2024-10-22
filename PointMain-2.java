import javax.swing.JFrame;
public class PointMain {

	public static void main(String[] args) {
		
		 JFrame frame = new JFrame( "Points And Rectangles Project" );
		  frame.getContentPane().add( new Canvas() );
		  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  frame.pack();
		  frame.setSize( 480, 504 );
		  frame.setVisible( true );
	}

}