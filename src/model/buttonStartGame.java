package model;


import java.awt.event.ActionListener;

import controller.ActionHandlerStart;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonStartGame implements GameButton{

	private Button button;
	private EventHandler start = (EventHandler) new ActionHandlerStart();

	//Creates the buttons attributes
	public buttonStartGame() {
		button = new Button("Start");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, start);			
		
	}//end of buttonQuit

	@Override
	public Button createButton() {
		return button;
	}

}//end of class
