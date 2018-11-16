package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import controller.ActionHandlerPacman;
import javafx.event.EventHandler;
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
	        createSprite().setCenterY(createSprite().getCenterY() + 5);
	        break;
	    case UP:
	    	createSprite().setCenterY(createSprite().getCenterY() - 5);
	        break;
	    case LEFT:
	    	createSprite().setCenterX(createSprite().getCenterX() - 5);
	        break;
	    case RIGHT:
	    	createSprite().setCenterX(createSprite().getCenterX() + 5);
	        break;
	    }
		
	}
	
	public void stopMove() {
		pacman.setTranslateX(50);
	}
	
	public void checkCollision(Shape block) {
		boolean collisionDetected = false;
		
	}
	
}//end of class
