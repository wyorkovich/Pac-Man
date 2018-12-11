package model;

import javafx.scene.Node;
import javafx.scene.shape.Circle;

public interface gameSprite {

	public double getX();
	public double getY();
	
	public boolean checkSides();
	public boolean checkCollisions();
	public boolean collide(Node other);
	Circle createSprite();
	
	
}//end of interface
