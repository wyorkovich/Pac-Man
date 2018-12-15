package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class newScore extends Application{

	private static String TITLE = "Leaderboard";
	private static int SCENE_WIDTH = 600;
	private static int SCENE_HEIGHT = 500;
	private static Stage window = new Stage();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: #0000FF");
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		
		
		
		window.setTitle(TITLE);
		window.setScene(scene);
		window.show();
		
	}
	
	private VBox addCenterBox()  {  //test comment
		VBox box = new VBox();
		box.setSpacing(25);
		
		
       // highScores.setFill(Color.YELLOW);
       // highScores.setTextAlignment(TextAlignment.CENTER);
		//box.getChildren().add(highScores);
		box.setAlignment(Pos.CENTER);
		return box;
	}

}
