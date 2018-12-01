 package model;
import javafx.scene.Group;
/*This is the class for the pellets */
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class pellet {

	private int reward = 100;
	private int radius = 3;
	private Color color = Color.WHITE;
	private Circle pellet;
	private int count = 0;
	private int space = 20;
	public pellet() {
			
	}
	
	public int reward() {
		return reward;
	}
	
	public Circle createPellet() {
		return pellet;
	}
	
	public int getPelletCount() {
		return count;
	}
	
	public Group addPellets() {
		
		Group root = new Group();
		
		
		//horizontal stretch left of pacman
		int startingX = 530;
		for(int i = 1; i < 7; i++) {
			Circle px = new Circle(3,3,3);
			px.setFill(color);
			px.setTranslateX(startingX);
			px.setTranslateY(530);
			root.getChildren().add(px);
			startingX += space;
		}
		
		//horizontal stretch right of pacman
		startingX = 690;
		for(int i = 1; i < 7; i++) {
			Circle px = new Circle(3,3,3);
			px.setFill(color);
			px.setTranslateX(startingX);
			px.setTranslateY(530);
			root.getChildren().add(px);
			startingX += space;
		}
		
		//left verticle hallway going down most of the map
		startingX = 510;
		int startingY = 80;
		for(int i =0; i < 25; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
		}
		
		//right verticle hallway going down most of the map
		startingX = 810;
		startingY = 80;
		for(int i =0; i < 25; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
		}
		
		
		return root;
	}
	
	
	
}
