package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 3. Put the robot's pen down
		r2d2.penDown();
		// 8. Make the robot go at maximum speed (10)
		r2d2.setSpeed(10);
		// 9. Set the pen to a color that you like for the shape
		r2d2.setRandomPenColor();
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int numberOfSide =6;
		// 5. Make a variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6.
		int angle = 360/6;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
		for (int i = 0; i < 200; i++) {
			// 2. Move the robot 200 pixels
			r2d2.move(i);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
			r2d2.setRandomPenColor();
			// 6. Turn the robot the amount in your angle variable
		r2d2.turn(360/6);
			// 11. Turn the robot one more degree
		r2d2.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}