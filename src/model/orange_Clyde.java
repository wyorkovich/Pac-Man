package model;

import javafx.scene.Node;
import javafx.scene.shape.Circle;

public class orange_Clyde implements ghost {

	public orange_Clyde() {
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

	@Override
	public boolean checkState() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePosition(player p) {
		// TODO Auto-generated method stub
		
	}

}
