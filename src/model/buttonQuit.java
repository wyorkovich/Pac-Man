package model;

import java.awt.event.ActionListener;

import controller.ActionHandlerQuit;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonQuit implements GameButton{

	private Button button;
	private EventHandler quit = (EventHandler) new ActionHandlerQuit();
	
	//Creates the buttons attributes
	@SuppressWarnings("unchecked")
	public buttonQuit() {
		button = new Button("Quit");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, quit);

	}//end of buttonQuit

	@Override
	public Button createButton() {
		return button;
	}

}//end of class
