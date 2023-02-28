
package question;

public class Obstacle {

	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	private int width;//properties of obstacles
	private int height;
	private double x;
	private double y;
	
	public Obstacle(int width,int height,int x) {//The constructor for obstacles
		this.width = width;
		this.height = height;
		this.x = x;

	}
	public double getX() {//Get method to reach X 
		return x;
	}
	public int getWidth() {//Get method to reach Width of obstacle
		return width;
	}

	public int getHeight() {//Set method to reach Height of obstacle
		return height;
	}



	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

