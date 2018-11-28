package model;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class gameBoard {

	private static Color border = Color.MIDNIGHTBLUE;
	private static int sideLength = 220;
	private static int topLength = 500;
	private player pacman = new player();
	private int [][] movement;
	
	
	
	//Note to self try using a 2D grid with points to test collision.
	
	public gameBoard() {
		movement = new int[][]{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1,0},
			{0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1,0},
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0},
			{0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,1,0},
			{0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,0},
			{0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0},
			{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},
			{0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,0},
			{0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1,0},
			{0,1,1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,1,0},
			{0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0},
			{0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0},
			{0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,0},
			{0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0},
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	}
	
	public Shape addBox() {
		
		Shape box;
		
		Rectangle gBoxTop = new Rectangle(25,25,175,25);
		gBoxTop.setFill(border);
		gBoxTop.setX(575);
		gBoxTop.setY(285);
		
		//Bottom of ghost box
		Rectangle gBoxBottom = new Rectangle(25,25,175,25);
		gBoxBottom.setFill(border);
		gBoxBottom.setX(575);
		gBoxBottom.setY(370);
		
		box = Shape.union(gBoxTop, gBoxBottom);
		
		//Left of ghost box
		Rectangle gBoxLeft = new Rectangle(25,25, 25,85);
		gBoxLeft.setFill(border);
		gBoxLeft.setX(575);
		gBoxLeft.setY(285);
		
		box = Shape.union(box, gBoxLeft);
		
		//Right of ghost box
		Rectangle gBoxRight = new Rectangle(25,25, 25,85);
		gBoxRight.setFill(border);
		gBoxRight.setX(725);
		gBoxRight.setY(285);
		
		box = Shape.union(box,  gBoxRight);
		
		box.setFill(border);
		
		return box;
	}
	
	public BorderPane addBoard() {
	
		BorderPane root = new BorderPane();
		
		Rectangle borderLeft = new Rectangle(25, 25, 25, sideLength);
		borderLeft.setFill(border);
		borderLeft.setX(400);
		root.getChildren().add(borderLeft);
		
		Rectangle borderRight = new Rectangle(25, 25, 25, sideLength);
		borderRight.setFill(border);
		borderRight.setX(900);
		root.getChildren().add(borderRight);
		
		Rectangle borderTop = new Rectangle(25, 25, topLength, 25);
		borderTop.setFill(border);
		borderTop.setX(400);
		root.getChildren().add(borderTop);
		
		Rectangle borderBottom = new Rectangle(25, 25, 525, 25);
		borderBottom.setFill(border);
		borderBottom.setX(400);
		borderBottom.setY(650);
		root.getChildren().add(borderBottom);
		
		Rectangle leftCorner = new Rectangle(25,25, 50, 40);
		leftCorner.setFill(border);
		leftCorner.setX(450);
		leftCorner.setY(155);
		root.getChildren().add(leftCorner);
		
		Rectangle leftTopCorner = new Rectangle(25,25, 50, 55);
		leftTopCorner.setFill(border);
		leftTopCorner.setX(450);
		leftTopCorner.setY(75);
		root.getChildren().add(leftTopCorner);
		
		//horizontal wall on top left
		Rectangle wall = new Rectangle(25,25,75, 25);
		wall.setFill(border);
		wall.setX(425);
		wall.setY(220);
		root.getChildren().add(wall);
		
		//verticle wall that points down and meets in the middle
		Rectangle wall2 = new Rectangle(25,25,25,85);
		wall2.setFill(border);
		wall2.setX(475);
		wall2.setY(225);
		root.getChildren().add(wall2);
		
		//verticle wall the is on the bottom left side
		Rectangle wall3 = new Rectangle(25, 25, 25, 200);
		wall3.setFill(border);
		wall3.setX(400);
		wall3.setY(450);
		root.getChildren().add(wall3);
		
		//horizontal wall that points in towords the middle
		Rectangle wall4 = new Rectangle(25,25,75, 25);
		wall4.setFill(border);
		wall4.setX(400);
		wall4.setY(430);
		root.getChildren().add(wall4);
		
		//verticle wall that goes in the middle left 
		Rectangle wall5 = new Rectangle(25,25,25,85);
		wall5.setFill(border);
		wall5.setX(475);
		wall5.setY(370);
		root.getChildren().add(wall5);
		
		//verticle wall the is on the bottom right side
		Rectangle wall6 = new Rectangle(25, 25, 25, 200);
		wall6.setFill(border);
		wall6.setX(900);
		wall6.setY(450);
		root.getChildren().add(wall6);
		
		//horizontal wall that points in towords the middle
		Rectangle wall7 = new Rectangle(25,25,75, 25);
		wall7.setFill(border);
		wall7.setX(850);
		wall7.setY(430);
		root.getChildren().add(wall7);
		
		//verticle wall that goes in the middle left 
		Rectangle wall8 = new Rectangle(25,25,25,85);
		wall8.setFill(border);
		wall8.setX(825);
		wall8.setY(370);
		root.getChildren().add(wall8);
		
		//horizontal wall on top right
		Rectangle wall9 = new Rectangle(25,25,75, 25);
		wall9.setFill(border);
		wall9.setX(825);
		wall9.setY(220);
		root.getChildren().add(wall9);
	
		//verticle wall that points down and meets in the middle
		Rectangle wall10 = new Rectangle(25,25,25,85);
		wall10.setFill(border);
		wall10.setX(825);
		wall10.setY(225);
		root.getChildren().add(wall10);

		//obsticle in top left middle 
		Rectangle leftMiddleCorner = new Rectangle(25,25, 95, 55);
		leftMiddleCorner.setFill(border);
		leftMiddleCorner.setX(525);
		leftMiddleCorner.setY(75);
		root.getChildren().add(leftMiddleCorner);
		
		//wall the is in top middle of screen
		Rectangle topWall = new Rectangle(25,25,25,100);
		topWall.setFill(border);
		topWall.setX(650);
		topWall.setY(30);
		root.getChildren().add(topWall);
		
		Rectangle rightCorner = new Rectangle(25,25, 50, 40);
		rightCorner.setFill(border);
		rightCorner.setX(825);
		rightCorner.setY(155);
		root.getChildren().add(rightCorner);
		
		
		Rectangle rightTopCorner = new Rectangle(25,25, 50, 55);
		rightTopCorner.setFill(border);
		rightTopCorner.setX(825);
		rightTopCorner.setY(75);
		root.getChildren().add(rightTopCorner);
		
		//obsticle in top right middle 
		Rectangle rightMiddleCorner = new Rectangle(25,25, 95, 55);
		rightMiddleCorner.setFill(border);
		rightMiddleCorner.setX(705);
		rightMiddleCorner.setY(75);
		root.getChildren().add(rightMiddleCorner);
		
		//verticle part of top left T
		Rectangle leftMiddle = new Rectangle(25,25,25,155);
		leftMiddle.setFill(border);
		leftMiddle.setX(525);
		leftMiddle.setY(155);
		root.getChildren().add(leftMiddle);
		
		//horizontal part of top left T
		Rectangle wall11 = new Rectangle(25,25,95, 25);
		wall11.setFill(border);
		wall11.setX(525);
		wall11.setY(220);
		root.getChildren().add(wall11);
				
		//verticle part of top righ T
		Rectangle rightMiddle = new Rectangle(25,25,25,155);
		rightMiddle.setFill(border);
		rightMiddle.setX(775);
		rightMiddle.setY(155);
		root.getChildren().add(rightMiddle);
				
		//horizontal part of top right T
		Rectangle wall12 = new Rectangle(25,25,75, 25);
		wall12.setFill(border);
		wall12.setX(705);
		wall12.setY(220);
		root.getChildren().add(wall12);
		
		//horizontal part of top left T
		Rectangle rightSide = new Rectangle(25,25,95, 25);
		rightSide.setFill(border);
		rightSide.setX(525);
		rightSide.setY(220);
		root.getChildren().add(rightSide);
		
		//horizontal part of middle T
		Rectangle wall13 = new Rectangle(25,25,175,40);
		wall13.setFill(border);
		wall13.setX(575);
		wall13.setY(155);
		root.getChildren().add(wall13);
		
		//Verticle part of middle T
		Rectangle wall14 = new Rectangle(25,25,25,90);
		wall14.setFill(border);
		wall14.setX(650);
		wall14.setY(155);
		root.getChildren().add(wall14);
		
		//verticle wall that goes in the middle left 
		Rectangle wall15 = new Rectangle(25,25,25,85);
		wall15.setFill(border);
		wall15.setX(525);
		wall15.setY(370);
		root.getChildren().add(wall15);
		
		//verticle wall that goes in the middle right
		Rectangle wall16 = new Rectangle(25,25,25,85);
		wall16.setFill(border);
		wall16.setX(775);
		wall16.setY(370);
		root.getChildren().add(wall16);
		/*
		Rectangle gBoxTop = new Rectangle(25,25,175,25);
		gBoxTop.setFill(border);
		gBoxTop.setX(575);
		gBoxTop.setY(285);
		root.getChildren().add(gBoxTop);
		
		//Bottom of ghost box
		Rectangle gBoxBottom = new Rectangle(25,25,175,25);
		gBoxBottom.setFill(border);
		gBoxBottom.setX(575);
		gBoxBottom.setY(370);
		root.getChildren().add(gBoxBottom);

		//Left of ghost box
		Rectangle gBoxLeft = new Rectangle(25,25, 25,85);
		gBoxLeft.setFill(border);
		gBoxLeft.setX(575);
		gBoxLeft.setY(285);
		root.getChildren().add(gBoxLeft);
		
		//Right of ghost box
		Rectangle gBoxRight = new Rectangle(25,25, 25,85);
		gBoxRight.setFill(border);
		gBoxRight.setX(725);
		gBoxRight.setY(285);
		root.getChildren().add(gBoxRight);
		*/
		//horizontal part of middle lower T
		Rectangle wall17 = new Rectangle(25,25,175,25);
		wall17.setFill(border);
		wall17.setX(575);
		wall17.setY(430);
		root.getChildren().add(wall17);		
		
		//verticle part of middle lower T
		Rectangle wall18 = new Rectangle(25,25,25,90);
		wall18.setFill(border);
		wall18.setX(650);
		wall18.setY(430);
		root.getChildren().add(wall18);	
		
		//Horizontal wall the goes to the right of the middle lower T
		Rectangle wall19 = new Rectangle(25,25,100,40);
		wall19.setFill(border);
		wall19.setX(700);
		wall19.setY(480);
		root.getChildren().add(wall19);

		//Horizontal wall the goes to the left of the middle lower T
		Rectangle wall20 = new Rectangle(25,25,100,40);
		wall20.setFill(border);
		wall20.setX(525);
		wall20.setY(480);
		root.getChildren().add(wall20);		
		
		//Left L horizontal
		Rectangle leftL = new Rectangle(25,25,50,25);
		leftL.setFill(border);
		leftL.setX(450);
		leftL.setY(480);
		root.getChildren().add(leftL);

		//Left L verticle
		Rectangle leftLVerticle = new Rectangle(25,25,25,90);
		leftLVerticle.setFill(border);
		leftLVerticle.setX(475);
		leftLVerticle.setY(480);
		root.getChildren().add(leftLVerticle);

		//right L horizontal
		Rectangle rightL = new Rectangle(25,25,25,25);
		rightL.setFill(border);
		rightL.setX(850);
		rightL.setY(480);
		root.getChildren().add(rightL);

		//right L verticle
		Rectangle rightLVerticle = new Rectangle(25,25,25,90);
		rightLVerticle.setFill(border);
		rightLVerticle.setX(825);
		rightLVerticle.setY(480);
		root.getChildren().add(rightLVerticle);		
		
		//middle lower T horizontal
		Rectangle wall21 = new Rectangle(25,25,175,25);
		wall21.setFill(border);
		wall21.setX(575);
		wall21.setY(545);
		root.getChildren().add(wall21);		
		
		//middle lower T verticle
		Rectangle wall22 = new Rectangle(25,25,25,80);
		wall22.setFill(border);
		wall22.setX(650);
		wall22.setY(545);
		root.getChildren().add(wall22);
		
		
		//lower left knob
		Rectangle leftKnob = new Rectangle(25,25,25,40);
		leftKnob.setFill(border);
		leftKnob.setX(425);
		leftKnob.setY(530);
		root.getChildren().add(leftKnob);
		
		//lower right knob
		Rectangle rightKnob = new Rectangle(25,25,25,40);
		rightKnob.setFill(border);
		rightKnob.setX(875);
		rightKnob.setY(530);
		root.getChildren().add(rightKnob);
		
		//lower left F
		Rectangle leftF = new Rectangle(25,25,170,30);
		leftF.setFill(border);
		leftF.setX(455);
		leftF.setY(595);
		root.getChildren().add(leftF);
		
		//lower left F verticle
		Rectangle leftFVerticle = new Rectangle(25,25,25,55);
		leftFVerticle.setFill(border);
		leftFVerticle.setX(525);
		leftFVerticle.setY(545);
		root.getChildren().add(leftFVerticle);
		
		//lower right F
		Rectangle rightF = new Rectangle(25,25,170,30);
		rightF.setFill(border);
		rightF.setX(700);
		rightF.setY(595);
		root.getChildren().add(rightF);		

		//lower right F verticle
		Rectangle rightFVerticle = new Rectangle(25,25,25,55);
		rightFVerticle.setFill(border);
		rightFVerticle.setX(775);
		rightFVerticle.setY(545);
		root.getChildren().add(rightFVerticle);
		
		
		//top left hall
		Rectangle hallLeft = new Rectangle(25,25,85, 25);
		hallLeft.setFill(border);
		hallLeft.setX(400);
		hallLeft.setY(285);
		root.getChildren().add(hallLeft);
	
		//bottom left hall
		Rectangle hallLeftB = new Rectangle(25,25,85, 25);
		hallLeftB.setFill(border);
		hallLeftB.setX(400);
		hallLeftB.setY(370);
		root.getChildren().add(hallLeftB);		
	
		//top right hall
		Rectangle hallRight = new Rectangle(25,25,85, 25);
		hallRight.setFill(border);
		hallRight.setX(840);
		hallRight.setY(285);
		root.getChildren().add(hallRight);
	
		//bottom right hall
		Rectangle hall2Right = new Rectangle(25,25,85, 25);
		hall2Right.setFill(border);
		hall2Right.setX(840);
		hall2Right.setY(370);
		root.getChildren().add(hall2Right);			
		
		//root.getChildren().add(pacman.createSprite());
		
		return root;
	}//end of addBox

	
}//end of class
