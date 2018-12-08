package model;

import javafx.scene.Node;
import javafx.scene.shape.Circle;

public class blue_Inky implements Ghost {
	
	private static double xPos;
	private static double yPos;

	public blue_Inky() {
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
