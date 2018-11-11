package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class player implements gameSprite{

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

	
	
}//end of class
