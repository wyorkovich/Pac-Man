package model;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class orange_Clyde implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle orange;

	public orange_Clyde() {
		orange = new Rectangle(8,8);
		orange.setTranslateX(666);
		orange.setTranslateY(490);
		orange.setFill(Color.ORANGE);
	}

	public Rectangle createSprite() {
		return orange;
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
