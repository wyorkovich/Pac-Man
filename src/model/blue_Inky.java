package model;

import javafx.scene.Node;

public class blue_Inky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;

	public blue_Inky() {
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
