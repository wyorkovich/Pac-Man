package model;

import controller.ActionHandlerSettings;
import controller.ActionHandlerStart;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonSettings implements GameButton{

	private Button button;
	private EventHandler settings = (EventHandler) new ActionHandlerSettings();
	
	//Creates the buttons attributes
	public buttonSettings() {
		button = new Button("Settings");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, settings); 
	
	}//end of buttonQuit

	@Override
	public Button createButton() {
		return button;
	}
}
