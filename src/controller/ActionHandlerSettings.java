package controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.GameScreen;
import view.SettingsScreen;

public class ActionHandlerSettings implements EventHandler {

	Stage stage = new Stage();
	SettingsScreen screen = new SettingsScreen();
	
	@Override
	public void handle(Event arg0) {
		
		try {
			screen.start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end of handle

}//end of class
