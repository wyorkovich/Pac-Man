package view;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.buttonChangeColor;

public class SettingsScreen extends Application{
	private static String TITLE = "Settings";
	private static int SCENE_WIDTH = 600;
	private static int SCENE_HEIGHT = 500;
	private static Stage window = new Stage();
	
	//defines the buttons that settings will have (WIP)
	private buttonChangeColor color = new buttonChangeColor();
	
	//The start method sets up the scene and displays it
	@Override
	public void start(Stage screen) throws Exception {

		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: #0000FF");
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		
		window.setTitle(TITLE);
		window.setScene(scene);
		window.show();
		
	}

	public void close() {
		window.close();
	}
	
	//Sets up a centerBox to add into the settings sceen
	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();
		box.setSpacing(25);
		ObservableList<Node> list = box.getChildren();

		list.addAll(color.createButton());
		box.setAlignment(Pos.CENTER);
		return box;
	}
}
