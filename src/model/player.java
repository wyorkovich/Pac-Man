package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.ActionHandlerPacman;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class player implements gameSprite{

	private static final int      KEYBOARD_MOVEMENT_DELTA = 5;
	private String imagePath = "file:/Pacman/ImgResources/Pac-ManRight.gif";
	private Circle pacman = new Circle(10,10,10);
	private static gameBoard board = new gameBoard();
	private static pellet food = new pellet();
	public player() {

		pacman.setFill(Color.YELLOW);
		pacman.setTranslateX(650);
		pacman.setTranslateY(523);
		
	
	}
	
	
	//Draws pacman
	@Override
	public Circle createSprite() {
		// TODO Auto-generated method stub
		return pacman;
	}

	
	
	
	@SuppressWarnings("incomplete-switch")
	public void move(KeyEvent e) {

		//checks which key was pressed and moves accodingly
		//Before it moves it calls the checkCollisons method to see if there is any problems moving in that direction 
		switch (e.getCode()) {
	    case DOWN:
	    	
	    	checkFood();
	    	if(!checkCollisions()) {
				createSprite().setCenterY(createSprite().getCenterY() + 2);
			}//end of if
			else {
				createSprite().setCenterY(createSprite().getCenterY() -2);
			}
	        break;
	    case UP:
	    	
	    	checkFood();
	    	if(!checkCollisions()) {
	    	createSprite().setCenterY(createSprite().getCenterY() - 2);
	    	}//end of if
	    	else {
	    		createSprite().setCenterY(createSprite().getCenterY() + 2);
	    	}
	    	break;
	    case LEFT:
	    	checkFood();
	    	if(checkSides()) {
	    		createSprite().setCenterX(createSprite().getCenterX()+375);;
	    	}
	    	if(!checkCollisions()) {
	    		createSprite().setCenterX(createSprite().getCenterX() - 2);
	    	}
	    	else {
	    		createSprite().setCenterX(createSprite().getCenterX() + 2);	
	    	}
	    	break;
	    case RIGHT:
	    	checkFood();
	    	if(checkSides()) {
	    		createSprite().setCenterX(createSprite().getCenterX()-375);;
	    	}
	    	if(!checkCollisions()) {
	    	createSprite().setCenterX(createSprite().getCenterX() + 2);
	    	}//end of if
	    	else {
		    	createSprite().setCenterX(createSprite().getCenterX() - 2);	
	    	}
	    	break;
	    }//end of switch statement
		
	}//end of move
	
	//Checks to see if pacman intersects with the side tunnels
	public boolean checkSides() {
		for(Node n: board.addSides().getChildren()) {
			if(collide(n)) {
				return true;
			}//end of if
		}//end of for
		return false;
	}//end of checkSides
	
	//checks all rectangles in the board
		public boolean checkCollisions() {
			for(Node n : board.addBoard().getChildren()) {
					if(collide(n)) {
					return true;
					}
			}	
			return false;
		}//end of checkCollisions
		
		//checks to see if any shape collides with pacman
		public boolean collide(Node other) {			
			return (createSprite().getBoundsInParent().intersects(other.getBoundsInParent()));
		}//end of collide
		
	public boolean checkFood() {
		for(Node n: food.addPellets().getChildren()) {
			if(collide(n)) {
				n.setTranslateX(2000);
				return true;
			}
		}
		return false;
	}
	
	
}//end of class
