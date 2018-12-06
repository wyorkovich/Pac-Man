package model;

import javafx.scene.shape.Circle;

public class Ghost implements gameSprite {
	
	private Circle ghost = new Circle(10, 10, 10);

	@Override
	public Circle createSprite() {
		return null;
	}

}
