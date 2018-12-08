package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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

public class player implements gameSprite, Character{

	private String imagePath = "file:/Pacman/ImgResources/Pac-ManRight.gif";
	private Circle pacman = new Circle(8,8,8);
	private static gameBoard board = new gameBoard();
	private static pellet food = new pellet();
	private static double xPos;
	private static double yPos;
	private int moveSpeed = 4;
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();
	private double[][] positions = new double[3][2];
	
	public player() {

		pacman.setFill(Color.YELLOW);
		pacman.setTranslateX(650);
		pacman.setTranslateY(523);
		xPos = createSprite().getCenterX();
		yPos = createSprite().getCenterY();
		

		xCoord.add(xPos);
		yCoord.add(yPos);
		
	}


	//Draws pacman
	@Override
	public Circle createSprite() {
		// TODO Auto-generated method stub
		return pacman;
	}

	//getX and getY store the pacmans current X and Y coords before collision
	@Override
	public double getX() {
		return xPos;
	}

	@Override
	public double getY() {
		return yPos;
	}

	@SuppressWarnings("incomplete-switch")
	public void move(KeyEvent e) {

		//checks which key was pressed and moves accordingly
		//Before it moves it calls the checkCollisons method to see if there is any problems moving in that direction 

		switch (e.getCode()) {
		case DOWN:

			checkFood();
			if(!checkCollisions()) {
				yPos = createSprite().getCenterY();
				xCoord.add(xPos);
				yCoord.add(yPos);
				createSprite().setCenterY(createSprite().getCenterY() + moveSpeed);
				
			}//end of if
			else {
				createSprite().setCenterX(getX());
				createSprite().setCenterY(getY());	
				
				for(int i = xCoord.size()-1; i >= 0; i--) {
                    createSprite().setCenterX(xCoord.get(i));
                    createSprite().setCenterY(yCoord.get(i));
                    
                    if(!checkCollisions()) {
                        break;
                    }
                    
                }
								
			}

			break;
	    case UP:
	    	
	    	checkFood();
	    	if(!checkCollisions()) {
	    		yPos = createSprite().getCenterY();
				xCoord.add(xPos);
				yCoord.add(yPos);
	    		createSprite().setCenterY(createSprite().getCenterY() - moveSpeed);
	    	}//end of if
	    	else {
	    		createSprite().setCenterX(getX());
				createSprite().setCenterY(getY());
				
				for(int i = xCoord.size()-1; i >= 0; i--) {
                    createSprite().setCenterX(xCoord.get(i));
                    createSprite().setCenterY(yCoord.get(i));
                    
                    if(!checkCollisions()) {
                        break;
                    }
                    
                }

				
			}
	    	
	    	break;
	    case LEFT:
	    	checkFood();
	    	if(checkSides()) {
	    		
	    		xPos += 375;
				xCoord.add(xPos);
				yCoord.add(yPos);
	    		createSprite().setCenterX(createSprite().getCenterX()+375);
	    	}
	    	if(!checkCollisions()) {
	    		
	    		xPos = createSprite().getCenterX();
				xCoord.add(xPos);
				yCoord.add(yPos);
	    		createSprite().setCenterX(createSprite().getCenterX() - moveSpeed);
	    	}
	    	else {
	    		createSprite().setCenterX(getX());
				createSprite().setCenterY(getY());
				for(int i = xCoord.size()-1; i >= 0; i--) {
                    createSprite().setCenterX(xCoord.get(i));
                    createSprite().setCenterY(yCoord.get(i));
                    
                    if(!checkCollisions()) {
                        break;
                    }
                    
                }

				
			}
	    	
	    	break;
	    case RIGHT:
	    	checkFood();
	    	if(checkSides()) {
	    		xPos -= 375;
				xCoord.add(xPos);
				yCoord.add(yPos);
	    		createSprite().setCenterX(createSprite().getCenterX()-375);
	    	}
	    	if(!checkCollisions()) {
	    		xPos = createSprite().getCenterX();
				xCoord.add(xPos);
				yCoord.add(yPos);
	    		createSprite().setCenterX(createSprite().getCenterX() + moveSpeed);
	    	}//end of if
	    	else {
	    		createSprite().setCenterX(getX());
				createSprite().setCenterY(getY());
				for(int i = xCoord.size()-1; i >= 0; i--) {
                    createSprite().setCenterX(xCoord.get(i));
                    createSprite().setCenterY(yCoord.get(i));
                    
                    if(!checkCollisions()) {
                        break;
                    }
                    
                }

				
			}
	    	break;
	    }//end of switch statement
		
	}//end of move

	//Checks to see if pacman intersects with the side tunnels
	@Override
	public boolean checkSides() {
		for(Node n: board.addSides().getChildren()) {
			if(collide(n)) {
				return true;
			}//end of if
		}//end of for
		return false;
	}//end of checkSides

	//checks all rectangles in the board
	@Override
	public boolean checkCollisions() {
		for(Node n : board.addBoard().getChildren()) {
			if(collide(n)) {
				return true;
			}
		}	
		return false;
	}//end of checkCollisions

	//checks to see if any shape collides with pacman
	@Override
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
