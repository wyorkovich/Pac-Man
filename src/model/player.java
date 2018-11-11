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
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class player implements gameSprite{

	private static final int      KEYBOARD_MOVEMENT_DELTA = 5;
	private String imagePath = "file:/Pacman/ImgResources/Pac-ManRight.gif";
	private Circle pacman = new Circle(10,10,10);
	
	public player() {

		pacman.setFill(Color.YELLOW);
		pacman.setTranslateX(650);
		pacman.setTranslateY(523);
		pacman.setOnKeyPressed(event -> {
			
			  switch (event.getCode()) {
	          case UP:    pacman.setCenterY(pacman.getCenterY() - KEYBOARD_MOVEMENT_DELTA); break;
	          case RIGHT: pacman.setCenterX(pacman.getCenterX() + KEYBOARD_MOVEMENT_DELTA); break;
	          case DOWN:  pacman.setCenterY(pacman.getCenterY() + KEYBOARD_MOVEMENT_DELTA); break;
	          case LEFT:  pacman.setCenterX(pacman.getCenterX() - KEYBOARD_MOVEMENT_DELTA); break;
	        }	
			
		});
	
	
	}
	
	@Override
	public Circle createSprite() {
		// TODO Auto-generated method stub
		return pacman;
	}

	private void moveCircleOnKeyPress(Scene scene, final Circle circle) {
	    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
	      @Override public void handle(KeyEvent event) {
	        switch (event.getCode()) {
	          case UP:    circle.setCenterY(circle.getCenterY() - KEYBOARD_MOVEMENT_DELTA); break;
	          case RIGHT: circle.setCenterX(circle.getCenterX() + KEYBOARD_MOVEMENT_DELTA); break;
	          case DOWN:  circle.setCenterY(circle.getCenterY() + KEYBOARD_MOVEMENT_DELTA); break;
	          case LEFT:  circle.setCenterX(circle.getCenterX() - KEYBOARD_MOVEMENT_DELTA); break;
	        }
	      }
	    });
	  }
	
	
	
}//end of class
