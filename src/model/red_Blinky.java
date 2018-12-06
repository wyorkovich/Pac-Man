package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class red_Blinky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle red;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public red_Blinky() {
		red = new Rectangle(8,8);
		red.setTranslateX(650);
		red.setTranslateY(490);
		red.setFill(Color.RED);
		xPos = createSprite().getX() + 4; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 4; // getX -> upper left corner + 4 = center of side of square
		
		xCoord.add(xPos);
		yCoord.add(yPos);
	}

	public Rectangle createSprite() {
		return red;
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
