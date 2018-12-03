package model;

import javafx.scene.Node;

public interface Character {
		
	public double getX();
	public double getY();
	
	public boolean checkSides();
	public boolean checkCollisions();
	public boolean collide(Node other);
	
}
