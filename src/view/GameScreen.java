package view;
//This is the window where the game will be played
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameScreen extends Application{

	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	private static Stage window = new Stage();
	private static Color border = Color.MIDNIGHTBLUE;
	private static int sideLength = 200;
	private static int topLength = 500;
	
	@Override
	public void start(Stage screen) throws Exception {

		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: BLACK");
		
		Rectangle borderLeft = new Rectangle(25, 25, 25, sideLength);
		borderLeft.setFill(border);
		borderLeft.setX(400);
		root.getChildren().add(borderLeft);
		
		Rectangle borderRight = new Rectangle(25, 25, 25, sideLength);
		borderRight.setFill(border);
		borderRight.setX(900);
		root.getChildren().add(borderRight);
		
		Rectangle borderTop = new Rectangle(25, 25, topLength, 25);
		borderTop.setFill(border);
		borderTop.setX(400);
		root.getChildren().add(borderTop);
		
		Rectangle borderBottom = new Rectangle(25, 25, topLength, 25);
		borderBottom.setFill(border);
		borderBottom.setX(400);
		borderBottom.setY(650);
		root.getChildren().add(borderBottom);
		
		Rectangle leftCorner = new Rectangle(25,25, 50, 25);
		leftCorner.setFill(border);
		leftCorner.setX(480);
		leftCorner.setY(170);
		root.getChildren().add(leftCorner);
		
		Rectangle leftTopCorner = new Rectangle(25,25, 50, 50);
		leftTopCorner.setFill(border);
		leftTopCorner.setX(480);
		leftTopCorner.setY(85);
		root.getChildren().add(leftTopCorner);
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		
		window.setTitle(TITLE);
		window.setScene(scene);
		window.setMaximized(true);
		window.show();
		
	}

	public void close() {
		window.close();
	}
	
	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();

		box.setAlignment(Pos.CENTER);
		return box;
	}
	
}
