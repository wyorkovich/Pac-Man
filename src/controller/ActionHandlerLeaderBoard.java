package controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.Leaderboard;

public class ActionHandlerLeaderBoard implements EventHandler {

	
	Stage stage = new Stage();
	Leaderboard screen = new Leaderboard();
	
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
