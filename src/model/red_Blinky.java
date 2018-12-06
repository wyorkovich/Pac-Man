package model;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class red_Blinky implements GhostInterface {
	
	private static double xPos;
	private static double yPos;
	private static Rectangle red;

	public red_Blinky() {
		red = new Rectangle(8,8);
		red.setTranslateX(650);
		red.setTranslateY(490);
		red.setFill(Color.RED);
	}

	public Rectangle createSprite() {
		return red;
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
