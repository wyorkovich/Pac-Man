package model;

import controller.ActionHandlerReturn;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonReturn implements GameButton{

	private Button button;
	private EventHandler breturn = (EventHandler) new ActionHandlerReturn(); 
	
	@SuppressWarnings("unchecked")
	public buttonReturn() {
		button = new Button("Return");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, breturn);
	}
	
	public Button createButton() {
		return button;
	}

}