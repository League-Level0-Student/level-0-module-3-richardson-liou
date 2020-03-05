//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String robColor = JOptionPane.showInputDialog("What color would you like?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (robColor.equals ("red")) {
			rob.setPenColor(Color.red);
		}
		else if (robColor.equals("Blue")) {
			rob.setPenColor(Color.BLUE);
		}
		else if (robColor.equals("Orange")) {
			rob.setPenColor(Color.ORANGE);
		}
		else if (robColor.equals("Yellow")) {
			rob.setPenColor(Color.YELLOW);
		}
		else {
			rob.setRandomPenColor();
		}
		rob.penDown();
		rob.setSpeed(50);
		rob.move(500);
		rob.turn(90);
		rob.move(20);
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
