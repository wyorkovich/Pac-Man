package view;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
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
	//public Stage window = new Stage();
	Optional<String> result;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}//end of start
	
public String getName()
{

	TextInputDialog dialog = new TextInputDialog("walter");
	dialog.setTitle("New High Score!");
	dialog.setHeaderText("You've reached the leaderboards!");
	dialog.setContentText("Please enter your name:");
	
    result = dialog.showAndWait();
	return result.get();
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
