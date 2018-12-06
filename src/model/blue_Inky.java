package model;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class blue_Inky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle blue;

	public blue_Inky() {
		blue = new Rectangle(8,8);
		blue.setTranslateX(662);
		blue.setTranslateY(490);
		blue.setFill(Color.BLUE);
	}
	
	public Rectangle createSprite() {
		return blue;
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
