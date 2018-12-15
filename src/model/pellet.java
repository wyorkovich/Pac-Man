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
	private Group root = new Group();
	
	public pellet() {
		addPellets();
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
	
	public void removePellet() {
		count--;
	}
	
	public Group getPelletGroup() {
		return root;
	}
	
	public Group addPellets() {
		
		//horizontal stretch left of pacman
		int startingX = 530;
		for(int i = 1; i < 7; i++) {
			Circle px = new Circle(3,3,3);
			px.setFill(color);
			px.setTranslateX(startingX);
			px.setTranslateY(530);
			root.getChildren().add(px);
			startingX += space;
			count++;
			System.out.println(px.getBoundsInParent());
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
			count++;
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
			count++;
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
			count++;
		}
		
		//very bottom row
		startingX = 435;
		startingY = 635;
		for(int i =0; i < 23; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}
		
		//first verticle hallway on the left from the bottom
		startingX = 435;
		startingY = 615;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;
		}
		
		//right verticle hallway on the right from the bottom
		startingX = 880;
		startingY = 615;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;
		}
		
		//horizontal left hallway in bottom
		startingX = 455;
		startingY = 575;
		for(int i =0; i < 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}
		
		//horizontal right hallway in bottom
		startingX = 855;
		startingY = 575;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX -= space;
			root.getChildren().add(p);
			count++;
		}
		
		//middle left horizontal hallway bottom
		startingX = 565;
		startingY = 580;
		for(int i =0; i < 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}
		
		//middle right horizontal hallway bottom
		startingX = 685;
		startingY = 580;
		for(int i =0; i < 5; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}
		
		//middle left verticle
			startingX = 635;
			startingY = 595;
			for(int i =0; i < 2; i++) {
				Circle p = new Circle(3,3,3);
				p.setFill(color);
				p.setTranslateX(startingX);
				p.setTranslateY(startingY);
				startingY += space;
				root.getChildren().add(p);
				count++;
			}		
		
		//middle right verticle
		startingX = 685;
		startingY = 600;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}				
		
		//middle left verticle 2
		startingX = 560;
		startingY = 545;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}		
		
		//middle right verticle 2
		startingX = 760;
		startingY = 545;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}	
		
		//left verticle hallway
		startingX = 435;
		startingY = 520;
		for(int i =0; i< 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;	
		}

		//right verticle hallway
		startingX = 885;
		startingY = 520;
		for(int i =0; i< 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;	
		}

		//left verticle hallway 2
		startingX = 460;
		startingY = 560;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;	
		}

		//right verticle hallway 2
		startingX = 860;
		startingY = 560;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY -= space;
			root.getChildren().add(p);
			count++;	
		}		
		
		//left middle of top of bottom half
		startingX = 460;
		startingY = 460;
		for(int i =0; i< 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}

		//right middle of top of bottom half
		startingX = 860;
		startingY = 460;
		for(int i =0; i< 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX -= space;
			root.getChildren().add(p);
			count++;	
		}		
		
		//middle left section of bottom
		startingX = 535;
		startingY = 465;
		for(int i =0; i< 5; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}

		//middle right section of bottom
		startingX = 785;
		startingY = 465;
		for(int i =0; i< 5; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX -= space;
			root.getChildren().add(p);
			count++;	
		}

		//middle left section horizontal of bottom
		startingX = 635;
		startingY = 465;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;	
		}	

		//middle right section horizontal of bottom
		startingX = 685;
		startingY = 465;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;	
		}	
		
		//bottom section of ghost box
		startingX = 580;
		startingY = 410;
		for(int i =0; i< 9; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}	

		//top section of ghost box
		startingX = 580;
		startingY = 265;
		for(int i =0; i< 9; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}		

		//left section of ghost box
		startingX = 560;
		startingY = 265;
		for(int i =0; i< 10; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;	
		}	

		//right section of ghost box
		startingX = 760;
		startingY = 265;
		for(int i =0; i< 10; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;	
		}	
		
		//left hallway on top
		startingX = 435;
		startingY = 60;
		for(int i =0; i < 8; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}	

		//right verticle hallway on top
		startingX = 885;
		startingY = 60;
		for(int i =0; i < 8; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}			

		//left horizontal hallway on top
		startingX = 455;
		startingY = 60;
		for(int i =0; i < 10; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}		

		//right horizontal hallway on top
		startingX = 685;
		startingY = 60;
		for(int i =0; i < 10; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;
		}

		//middle left verticle hallway on top
		startingX = 635;
		startingY = 80;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}

		//middle right verticle hallway on top
		startingX = 685;
		startingY = 80;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}
	
		//top horizontal hallway
		startingX = 530;
		startingY = 140;
		for(int i =0; i< 14; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}	
	
		//top horizontal hallway left top small part
		startingX = 450;
		startingY = 140;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}		
	
		//bottom horizontal hallway left bottom small part
		startingX = 450;
		startingY = 200;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}	

		//top horizontal hallway right top small part
		startingX = 825;
		startingY = 140;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}		
	
		//top horizontal hallway right bottom small part
		startingX = 825;
		startingY = 200;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}			

		//left middle verticle hallway
		startingX = 560;
		startingY = 160;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}	
		
		//right middle verticle hallway
		startingX = 760;
		startingY = 160;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}	

		//bottom horizontal hallway left bottom small part
		startingX = 450;
		startingY = 200;
		for(int i =0; i< 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}

		//left middle horizontal hallway
		startingX = 560;
		startingY = 205;
		for(int i =0; i< 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}	
		
		//right middle horizontal hallway
		startingX = 690;
		startingY = 205;
		for(int i =0; i< 4; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingX += space;
			root.getChildren().add(p);
			count++;	
		}	

		//bottom left verticle hallway on top
		startingX = 635;
		startingY = 205;
		for(int i =0; i < 3; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}

		//bottom right verticle hallway on top
		startingX = 685;
		startingY = 225;
		for(int i =0; i < 2; i++) {
			Circle p = new Circle(3,3,3);
			p.setFill(color);
			p.setTranslateX(startingX);
			p.setTranslateY(startingY);
			startingY += space;
			root.getChildren().add(p);
			count++;
		}

		return root;
	}
	
	
	
}
