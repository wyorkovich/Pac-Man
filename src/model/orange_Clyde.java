package model;

import javafx.scene.Node;

public class orange_Clyde implements GhostInterface {
	
	private static double xPos;
	private static double yPos;

	public orange_Clyde() {
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
