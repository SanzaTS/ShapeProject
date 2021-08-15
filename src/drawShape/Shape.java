package drawShape;

import java.awt.Point;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRect rect = new MyRect();
		
		System.out.println("Setting and Displaying rectangle with coordinates top left : 25, 50, and Bottom left 25, 50,");
		rect.buildRect(25, 50, 25, 50);
		rect.displayRect();
		
		System.out.println("Setting and Displaying rectangle with points  top left point ( 30, 55) and Bottom left point (30, 55)");
		rect.buildRect(new Point(30, 55), new Point(30, 55) );
		rect.displayRect();
		
	}
 
	
}
