package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class blue_Inky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle blue;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public blue_Inky() {
		blue = new Rectangle(8,8);
		blue.setTranslateX(662);
		blue.setTranslateY(490);
		blue.setFill(Color.BLUE);
		xPos = createSprite().getX() + 4; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 4; // getX -> upper left corner + 4 = center of side of square
		
		xCoord.add(xPos);
		yCoord.add(yPos);
	}
	
	public Rectangle createSprite() {
		return blue;
	}
	
	public void move() {
		//TODO: Matt add movement styles
	}

	@Override
	public double getX() {
		return xPos;
	}

	@Override
	public double getY() {
		return yPos;
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

}
