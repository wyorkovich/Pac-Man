package controller;
/*
 * This class is the eventHandler for the quit button
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;

public class ActionHandlerQuit implements EventHandler {

	
	public void ActionHadlerQuit() {
		
	}
	
	@Override
	public void handle(Event arg0) {
		Platform.exit();
	}

}
