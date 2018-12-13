package model;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class blue_Inky implements Ghost {

	private static double xPos;
	private static double yPos;
	private static double dest_x;
	private static double dest_y;
	private static int speed;
	private static Rectangle blue;
	private static gameBoard board = new gameBoard();
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();
	
	public blue_Inky() {
		blue = new Rectangle(12,12);
		
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
		return null;
	}



}
