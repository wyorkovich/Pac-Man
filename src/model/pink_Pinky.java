package model;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class pink_Pinky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle pink;

	public pink_Pinky() {
		pink = new Rectangle(8,8);
		pink.setTranslateX(658);
		pink.setTranslateY(490);
		pink.setFill(Color.PINK);
		
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
