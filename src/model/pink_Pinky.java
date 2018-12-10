package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;

public class pink_Pinky implements Ghost {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle pink;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public pink_Pinky() {
		pink = new Rectangle(8,8);
		pink.setTranslateX(658);
		pink.setTranslateY(490);
		pink.setFill(Color.PINK);
		xPos = createSprite().getX() + 4; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 4; // getX -> upper left corner + 4 = center of side of square
		
		xCoord.add(xPos);
		yCoord.add(yPos);
	}
	
	@Override
	public Rectangle createSprite() {
		return pink;
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
