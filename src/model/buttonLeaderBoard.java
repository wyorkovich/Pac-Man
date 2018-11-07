package model;

import controller.ActionHandlerLeaderBoard;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonLeaderBoard implements GameButton{

	Button button = new Button();
	EventHandler leader = new ActionHandlerLeaderBoard();
	
	public buttonLeaderBoard() {
		button = new Button("Leaderboard");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, leader );
	}
	
	
	@Override
	public Button createButton() {
		return button;
	}

}
