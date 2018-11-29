package controller;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.stage.Stage;


public class ActionHandlerReturn implements EventHandler{

	
	@Override
	public void handle(Event event) {
		
		((Node)(event.getSource())).getScene().getWindow().hide(); 
		
	}

}