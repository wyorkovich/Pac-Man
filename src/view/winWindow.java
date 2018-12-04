package view;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class winWindow extends Application {

	private static String TITLE = "Settings";
	private static int SCENE_WIDTH = 600;
	private static int SCENE_HEIGHT = 500;
	private static Stage window = new Stage();
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: BLACK");
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		
		window.setTitle(TITLE);
		window.setScene(scene);
		window.show();
		
	}

	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();
		box.setSpacing(25);
		ObservableList<Node> list = box.getChildren();
		Text text = new Text ("YOU WIN");
		
		list.addAll(text);
		box.setAlignment(Pos.CENTER);
		return box;
	}
	
}
