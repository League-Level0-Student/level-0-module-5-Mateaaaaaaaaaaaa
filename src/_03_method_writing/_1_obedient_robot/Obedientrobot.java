package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedientrobot {

	static Robot rob=new Robot();

	static void drawSquare() {

		for (int i=0; i<4;i++){
			rob.move(200);
			rob.turn(90);

		}

	}



	public static void main(String[] args) {


		rob.setSpeed(50);
		rob.penDown();



		
		String shape =JOptionPane.showInputDialog("What shape do you want");
		if(shape.equals("Square")) {
			drawSquare();
		}

		if(shape.equals("triangle")) {
			drawTriangle();
		}

		if(shape.equals("circle")) {
			drawCircle();
		}
	}

	static void drawTriangle() {

		for (int i=0; i<3;i++) {

			rob.move(200);
			rob.turn(120);


		}

	}



	static void drawCircle() {

		for (int i=0; i<36;i++) {

			rob.move(10);
			rob.turn(10);

		}

	}








}











