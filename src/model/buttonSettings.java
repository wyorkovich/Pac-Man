package model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import model.GameButton;

public class buttonSettings implements GameButton{

	private Button button;
	
	public buttonSettings() {
		button = new Button("Settings");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
			}
		});	
	
	}//end of buttonQuit

	@Override
	public Button createButton() {
		return button;
	}
}
