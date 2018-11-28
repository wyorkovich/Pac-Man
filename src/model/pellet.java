 package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class pellet {

	private int reward;
	private int radius;
	private Color color = Color.WHITE;
	private Circle pellet;
	
	public pellet() {
		reward = 100;
		pellet.setCenterX(radius);
		pellet.setCenterY(radius);
		pellet.setFill(color);
	}
	
	public Circle createPellet() {
		return pellet;
	}
	
}
