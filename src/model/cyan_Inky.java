package model;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class cyan_Inky implements ghost {

	private static double xPos;
	private static double yPos;
	private static double dest_x;
	private static double dest_y;
	private static int speed;
	private static Rectangle blue;
	private static gameBoard board = new gameBoard();
	private ArrayList<Double> xCoord = new ArrayList<Double>();
	private ArrayList<Double> yCoord = new ArrayList<Double>();

	public cyan_Inky() {
		blue = new Rectangle(12,12);
		blue.setTranslateX(670);
		blue.setTranslateY(323);
		blue.setFill(Color.CYAN);
		xPos = createSprite().getX() + 6;
		yPos = createSprite().getY() + 6;

		xCoord.add(xPos);
		yCoord.add(yPos);
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
	public Rectangle createSprite() {
		return blue;
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

}
