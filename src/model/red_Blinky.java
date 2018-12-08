package model;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class red_Blinky implements Ghost {

	private Circle blinky = new Circle(8,8,8);
	private double xPos;
	private double yPos;
	private int movespeed = 2;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();
	
	// First have ghost move at slower speed with no collision at the space pacman is on to make something 
	//playable. use animation timer.
	//TODO Make ghost move in same direction until collision then decide where to go using if statements
	// check to see if pacman is on same X or Y to make the corners, 
	
	
	public red_Blinky() {
		blinky.setFill(Color.RED);
		blinky.setTranslateX(650);
		blinky.setTranslateY(323);
		xPos = createSprite().getCenterX();
		yPos = createSprite().getCenterY();
		
		xCoord.add(xPos);
		yCoord.add(yPos);
		
	}

	@Override
	public double getX() {
		return 0;
	}

	@Override
	public double getY() {
		return 0;
	}

	@Override
	public boolean checkSides() {
		return false;
	}

	@Override
	public boolean checkCollisions() {
		return false;
	}

	@Override
	public boolean collide(Node other) {
		return false;
	}

	@Override
	public Circle createSprite() {
		// TODO Auto-generated method stub		
		return blinky;
	}

}
