 package model;
/*This is the class for the pellets */
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class pellet {

	private int reward;
	private int radius = 3;
	private Color color = Color.WHITE;
	private Circle pellet;
	
	public pellet() {
		reward = 100;
		pellet.setCenterX(3);
		pellet.setCenterY(3);
		pellet.setFill(color);
	}
	
	public Circle createPellet() {
		return pellet;
	}
	
}
