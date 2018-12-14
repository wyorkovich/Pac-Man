package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.*;

public class orange_Clyde implements ghost {

	private static double xPos;
	private static double yPos;
	private static Rectangle orange;
	private static double dest_x;
	private static double dest_y;
	private static int speed;
	private static gameBoard board = new gameBoard();
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public orange_Clyde() {
		orange = new Rectangle(12,12);
		orange.setTranslateX(666);
		orange.setTranslateY(490);
		orange.setFill(Color.ORANGE);
		xPos = createSprite().getX() + 6; // getX -> upper left corner + 4 = center of side of square
		yPos = createSprite().getY() + 6; // getX -> upper left corner + 4 = center of side of square

		xCoord.add(xPos);
		yCoord.add(yPos);
	}

	@Override
	public Rectangle createSprite() {
		return orange;
	}

	public void updatePosition(player p) {

		moveX(p);
		moveY(p);

	}

	public void moveX(player p) {
		dest_x = p.getX();
		if(!checkCollisions()) {
			if (xPos < dest_x) {
				createSprite().setX(createSprite().getX() + 6 + speed);
				xPos += speed;
			} else if (xPos > dest_x) {
				createSprite().setX(createSprite().getX() + 6 - speed);
				xPos -= speed;
			}
		}
	}

	public void moveY(player p) {
		dest_y = p.getY();
		if(!checkCollisions()) {
			if (yPos < dest_y) {
				createSprite().setY(createSprite().getY() + 6 + speed);
				yPos += speed;
			} else if (yPos > dest_y) {
				createSprite().setY(createSprite().getY() + 6 - speed);
				yPos -= speed;
			}
		}
	}

	@Override
	public double getX() {
		return xPos;
	}

	@Override
	public double getY() {
		return yPos;
	}

	@Override
	public boolean checkSides() {
		for(Node n : board.addSides().getChildren()) {
			if(collide(n))
				return true;
		}
		return false;
	}

	@Override
	public boolean checkCollisions() {
		for(Node n : board.addBoard().getChildren()) {
			if(collide(n))
				return true;
		}
		return false;
	}

	@Override
	public boolean collide(Node other) {
		return createSprite().getBoundsInParent().intersects(other.getBoundsInParent());
	}

	@Override
	public boolean checkState() {
		// TODO Auto-generated method stub
		return false;
	}

}


