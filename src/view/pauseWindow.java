package view;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import model.buttonQuit;
import model.buttonReturn;
import model.buttonSettings;

public class pauseWindow  extends Application{

	

	public void start(Stage primaryStage) throws Exception {
		
		
	}//end of start
	public void createWindow() {
		final Stage dialog = new Stage();
        dialog.initModality(Modality.NONE);
        dialog.initOwner(null);
        
        VBox dialogVbox = new VBox(10);
        dialogVbox.setStyle("-fx-background-color: BLUE");
        dialogVbox.setSpacing(25);
        
        Text pauseText= new Text("You have paused the game");
        pauseText.setFill(Color.YELLOW);
        pauseText.setTextAlignment(TextAlignment.CENTER);
        
        buttonQuit popQuit = new buttonQuit();
        buttonSettings pauseSettings = new buttonSettings();
        buttonReturn preturn = new buttonReturn();
      
        
        ObservableList<Node> popList = dialogVbox.getChildren();
        popList.addAll(pauseText,popQuit.createButton(), pauseSettings.createButton(), preturn.createButton());
        dialogVbox.setAlignment(Pos.CENTER); 
       
        
        Scene dialogScene = new Scene(dialogVbox, 600, 400, Color.BLACK);
        dialog.setScene(dialogScene);
        dialog.show();
	}

}