package controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import model.gameBoard;
import model.pellet;
import model.player;

public class ActionHandlerPacman implements EventHandler{

	@Override
	public void handle(Event e) {
		// TODO Auto-generated method stub
		
	}
	
	public void move(KeyEvent e, player p) {
		p.move(e);
//		p.getScore();
	}
	
}
