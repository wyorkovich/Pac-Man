package model;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class buttonChangeColor implements GameButton {

	Button button = new Button();
	
	public buttonChangeColor() {
		button = new Button("Change Color Theme");
		button.setPrefSize(100, 20);
		button.setStyle("-fx-background-color: black");
		button.setTextFill(Color.YELLOW);
	}
	
	
	@Override
	public Button createButton() {
		return button;
	}

}
