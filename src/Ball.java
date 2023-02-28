
package question;

public class Ball {


	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	
	
	private double velocity;//Properties of ball
	private double angle;
	private double x = 0;
	private double y = 0;
	
	
	public Ball(double velocity){//Ball constructor
		this.velocity = velocity;
		
	}
	
		public double getVelocity() {//Get method to reach the velocity of ball
		return velocity;
		
	}
	
	public void setVelocity(double velocity) {//Set method to change the velocity of ball when we need to increase or decrease it
		this.velocity = velocity;
		
	}


	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	
}

