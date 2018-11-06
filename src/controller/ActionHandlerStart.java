package controller;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.buttonStartGame;
import view.GameScreen;
import view.View;

public class ActionHandlerStart implements EventHandler{

	
	//Opens the gamescreen windows
	Stage stage = new Stage();
	GameScreen screen = new GameScreen();
	
	public void ActionHandlerStart() {};
	
	@Override
	public void handle(Event arg0) {
		
		try {
			screen.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
