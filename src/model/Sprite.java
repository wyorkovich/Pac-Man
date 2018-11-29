package model;

import java.awt.Graphics;

import javafx.scene.shape.Circle;

public abstract class Sprite {
	
	protected int x, y, size;
	protected int speed = 10; //10 is merely a placeholder at this point.
	protected MoveStrategy ms;
	protected Circle sprite;
	
	Sprite(int x, int y, int size, int speed, Circle spriteImg){
		setPos(x, y);
		setSize(size);
		this.sprite = spriteImg;
	}
	
	Sprite(Sprite s){
		this.x = s.x;
		this.y = s.y;
		this.speed = s.speed;
	}
	
	//getters and setters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setMoveStrategy(MoveStrategy ms){
		this.ms = ms;
	}
	
	public void setPos(int x, int y) {
		this.x = x - getSize() / 2;
		this.y = y - getSize() / 2;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
//	public void update(Graphics g) {
	
}
