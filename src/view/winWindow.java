package view;

import java.io.IOException;

import Database.Database;
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
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import model.Score;

public class winWindow extends Application {

	private static String TITLE = "Settings";
	private static int SCENE_WIDTH = 600;
	private static int SCENE_HEIGHT = 500;
	private static Stage window = new Stage();
	Database leaderBoard = new Database();
	Score score = new Score();
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: CORNFLOWERBLUE");
		
		
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		//leaderBoard.addHighScore(highScore newScore);
		window.setTitle(TITLE);
		window.setScene(scene);
		window.show();
		
	}

	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();
		box.setSpacing(25);
		ObservableList<Node> list = box.getChildren();

		Text text = new Text ("YOU WIN");

		text.setScaleX(10);
		text.setScaleY(10);
		text.setScaleZ(10);
		text.setFill(Color.RED);
		
		 Text highScores = new Text(leaderBoard.printHighScore());
	        highScores.setFill(Color.YELLOW);
	        highScores.setTextAlignment(TextAlignment.CENTER);
		
		list.addAll(text, highScores);


		box.setAlignment(Pos.CENTER);
		return box;
	}
	
	public Stage getWindow() {
		return window;
	}
	
}
