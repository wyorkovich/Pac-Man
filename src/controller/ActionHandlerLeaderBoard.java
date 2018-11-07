package controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import view.Leaderboard;
/*
 * This class is the event handler for the leaderboard button
 */
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
