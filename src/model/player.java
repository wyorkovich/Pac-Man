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
	
	public player() {

		pacman.setFill(Color.YELLOW);
		pacman.setTranslateX(650);
		pacman.setTranslateY(523);
		
	
	}
	
	
	
	@Override
	public Circle createSprite() {
		// TODO Auto-generated method stub
		return pacman;
	}

	
	
	
	@SuppressWarnings("incomplete-switch")
	public void move(KeyEvent e) {

		switch (e.getCode()) {
	    case DOWN:
			if(!checkCollisions()) {
				createSprite().setCenterY(createSprite().getCenterY() + 5);
			}//end of if
			else {
				createSprite().setCenterY(createSprite().getCenterY() -1);
			}
	        break;
	    case UP:
	    	if(!checkCollisions()) {
	    	createSprite().setCenterY(createSprite().getCenterY() - 5);
	    	}//end of if
	    	else {
	    		createSprite().setCenterY(createSprite().getCenterY() + 1);
	    	}
	    	break;
	    case LEFT:
	    	if(!checkCollisions()) {
	    		createSprite().setCenterX(createSprite().getCenterX() - 5);
	    	}
	    	else {
	    		createSprite().setCenterX(createSprite().getCenterX() + 1);	
	    	}
	    	break;
	    case RIGHT:
	    	if(!checkCollisions()) {
	    	createSprite().setCenterX(createSprite().getCenterX() + 5);
	    	}//end of if
	    	else {
		    	createSprite().setCenterX(createSprite().getCenterX() - 1);	
	    	}
	    	break;
	    }
		
	}
	
	public void stopMove() {
		pacman.setTranslateX(50);
	}
	
	//checks all rectangles in the board
		public boolean checkCollisions() {
			for(Node n : board.addBoard().getChildren()) {
					if(collide(n)) {
					System.out.println("COLLIDE");
					return true;
					}
			}	
			return false;
		}
		//checks to see if any shape collides with pacman
		public boolean collide(Node other) {
		
			return (createSprite().getBoundsInParent().intersects(other.getBoundsInParent()));
		}
		
	
	
	
}//end of class
