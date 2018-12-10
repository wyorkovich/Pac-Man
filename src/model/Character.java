package model;

import javafx.scene.Node;
import javafx.scene.shape.Shape;

public interface Character {
		
	public double getX();
	public double getY();
	
	public boolean checkSides();
	public boolean checkCollisions();
	public boolean collide(Node other);
	public Shape createSprite();
}
