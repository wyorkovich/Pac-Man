package view;

//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

import model.buttonQuit;
import model.buttonSettings;
import model.buttonStartGame;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.awt.event.ActionListener;


public class View extends Application {

	// private JTextField myTextField;
	// private JButton button;

	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	
	public buttonStartGame start = new buttonStartGame();
	public buttonSettings settings = new buttonSettings();
	public buttonQuit quit = new buttonQuit();

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.CORNFLOWERBLUE);
			
			VBox centerBox = addCenterBox();
			root.setCenter(centerBox);
			centerBox.setStyle("-fx-background-color: #0000FF");
					
			primaryStage.setTitle(TITLE);
			primaryStage.setScene(scene);
			primaryStage.show();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void fullLaunch(String[] args) {
		launch(args);
	}
	
	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();
		box.setSpacing(25);
		ObservableList<Node> list = box.getChildren();

		list.addAll(start.createButton(), settings.createButton(), quit.createButton());
		box.setAlignment(Pos.CENTER);
		return box;
	}
	
	
	

}