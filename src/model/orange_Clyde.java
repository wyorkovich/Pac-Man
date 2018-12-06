package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class orange_Clyde implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle orange;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public orange_Clyde() {
		orange = new Rectangle(8,8);
		orange.setTranslateX(666);
		orange.setTranslateY(490);
		orange.setFill(Color.ORANGE);
		xPos = createSprite().getX() + 4; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 4; // getX -> upper left corner + 4 = center of side of square
		
		xCoord.add(xPos);
		yCoord.add(yPos);
	}

	public Rectangle createSprite() {
		return orange;
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
