
package question;

import java.util.ArrayList;

public class GameScene {

	// Data Fields
	private ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
	private Ball ball;

	private int targetX;
	private int targetY = 0;

	private static final int MAX_ANGLE = 90;
	private static final int MAX_VELOCITY = 100;
	private static final int MIN_VELOCITY = 20;
	
	//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
	public GameScene(ArrayList<Obstacle> obstacles, Ball ball, int targetX) {//The constructor of GameScene
		this.obstacles = obstacles;
		this.ball = ball;
		this.targetX = targetX;
	}
	public void setTargetX(int targetX) {//Set method for targetX to reach targetX 
		this.targetX = targetX;
		
	}

	//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE

	public double findVelocity(double angle) {

		//DO_NOT_EDIT_ANYTHING_ABOVE_THIS_LINE
		if(angle > MAX_ANGLE) {//Controlling the angle 
			return -1.0;
		}
		if(ball.getVelocity() < MIN_VELOCITY || ball.getVelocity() > MAX_VELOCITY) {//Controlling the max and min velocity 
			return -1.0;
		}
		double radianAngle = Math.toRadians(angle);//Converting angle to radian
		double cosAngle = Math.cos(radianAngle);//Finding the cosine value of the angle  		 
		double sinAngle = Math.sin(radianAngle);//Finding the sinus value of the angle
		double vX = ball.getVelocity() * cosAngle;//Finding the horizontal velocity
		double vY = ball.getVelocity() * sinAngle;//Finding the vertical velocity
		double g = 9.81;//The gravity acceleration
		double t = 2*vY/g;//finding the time
		if(vX*t < targetX) {//Comparing the distance that ball can reach with targetX
			double newVelocity = Math.sqrt(targetX*g/(2*Math.sin(radianAngle)*Math.cos(radianAngle)));//Changing the value of velocity
			ball.setVelocity(newVelocity);//and setting the velocity
			if(ball.getVelocity() < MIN_VELOCITY || ball.getVelocity() > MAX_VELOCITY) {//Comparing the given velocity with max and min velocity
				return -1.0;
			}
			vX = ball.getVelocity() * cosAngle;//Determining the horizontal velocity of ball
			vY = ball.getVelocity() * sinAngle;//Determining the vertical velocity of ball
		}
		for(Obstacle eachObstacle:obstacles) {//Creating for loop to reach all elements of obstacle array list 
			double leftOfObstacle = eachObstacle.getX();
			double rightOfObstacle = eachObstacle.getX() + eachObstacle.getWidth();
			double heightOfobstacle = eachObstacle.getHeight();
			double tAtLeftOfObstacle = leftOfObstacle / vX;
			double tAtRightOfObstacle = rightOfObstacle / vX;
			double yAtTimeTLeft = vY * tAtLeftOfObstacle - (1/2)*g*tAtLeftOfObstacle*tAtLeftOfObstacle;
			double yAtTimeTRight = vY * tAtRightOfObstacle - (1/2)*g*tAtRightOfObstacle*tAtRightOfObstacle;
			if(yAtTimeTLeft < heightOfobstacle ) {//if height of obstacle is bigger than the ball's height on the left then return -1
				return -1.0;
			}
			if(yAtTimeTRight < heightOfobstacle ) {//if height of obstacle is bigger than the ball's height on the right then return -1
				return -1.0;
			}
		
		}
		return ball.getVelocity();

		//DO_NOT_EDIT_ANYTHING_BELOW_THIS_LINE
	}
}


