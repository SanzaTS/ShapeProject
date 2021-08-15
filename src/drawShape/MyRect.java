package drawShape;

import java.awt.Point;
import java.awt.Rectangle;

public class MyRect {

	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public MyRect() {
		super();
		
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	public MyRect buildRect(int x1, int y1 , int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2; 
		
		Point topLeft  = new Point();
		
		Point bottomRight = new Point();
		
		topLeft.x = this.x1;
		topLeft.y = this.y1;
		
		bottomRight.x = this.x2;
		bottomRight.y = this.y2;

		
		return this;
		
		
	}
	
	public MyRect buildRect(Point topLeft, Point bottomRight )
	{
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = bottomRight.x;
		y2 = bottomRight.y;
		
		return this;
	}
	
	
	public void displayRect()
	{
		System.out.print("My Rectangle Coordiantes are  : (" + x1 + ", " + y1 +") , (" + x2 + ", " + y2 + ") \n ");
		System.out.println();
	}
	
}
