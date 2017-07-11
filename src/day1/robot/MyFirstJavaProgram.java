package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Jeff = new Robot();
	Jeff.penDown();
	Jeff.setRandomPenColor();
	Jeff.move(100);
	Jeff.setRandomPenColor();
	Jeff.move(-200);	
	Jeff.setRandomPenColor();
Jeff.turn(90);		
Jeff.moveTo(10,-10);
	}
}
