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
	private static int sideLength = 220;
	private static int topLength = 500;
	private static Color test = Color.RED;

	
	//The Start method sets up the scene and adds in the game board
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
		
		Rectangle borderBottom = new Rectangle(25, 25, 525, 25);
		borderBottom.setFill(border);
		borderBottom.setX(400);
		borderBottom.setY(650);
		root.getChildren().add(borderBottom);
		
		Rectangle leftCorner = new Rectangle(25,25, 50, 40);
		leftCorner.setFill(border);
		leftCorner.setX(450);
		leftCorner.setY(155);
		root.getChildren().add(leftCorner);
		
		Rectangle leftTopCorner = new Rectangle(25,25, 50, 55);
		leftTopCorner.setFill(border);
		leftTopCorner.setX(450);
		leftTopCorner.setY(75);
		root.getChildren().add(leftTopCorner);
		
		//horizontal wall on top left
		Rectangle wall = new Rectangle(25,25,75, 25);
		wall.setFill(border);
		wall.setX(425);
		wall.setY(220);
		root.getChildren().add(wall);
		
		//verticle wall that points down and meets in the middle
		Rectangle wall2 = new Rectangle(25,25,25,85);
		wall2.setFill(border);
		wall2.setX(475);
		wall2.setY(225);
		root.getChildren().add(wall2);
		
		//verticle wall the is on the bottom left side
		Rectangle wall3 = new Rectangle(25, 25, 25, 200);
		wall3.setFill(border);
		wall3.setX(400);
		wall3.setY(450);
		root.getChildren().add(wall3);
		
		//horizontal wall that points in towords the middle
		Rectangle wall4 = new Rectangle(25,25,75, 25);
		wall4.setFill(border);
		wall4.setX(400);
		wall4.setY(430);
		root.getChildren().add(wall4);
		
		//verticle wall that goes in the middle left 
		Rectangle wall5 = new Rectangle(25,25,25,85);
		wall5.setFill(border);
		wall5.setX(475);
		wall5.setY(370);
		root.getChildren().add(wall5);
		
		//verticle wall the is on the bottom right side
		Rectangle wall6 = new Rectangle(25, 25, 25, 200);
		wall6.setFill(border);
		wall6.setX(900);
		wall6.setY(450);
		root.getChildren().add(wall6);
		
		//horizontal wall that points in towords the middle
		Rectangle wall7 = new Rectangle(25,25,75, 25);
		wall7.setFill(border);
		wall7.setX(850);
		wall7.setY(430);
		root.getChildren().add(wall7);
		
		//verticle wall that goes in the middle left 
		Rectangle wall8 = new Rectangle(25,25,25,85);
		wall8.setFill(border);
		wall8.setX(825);
		wall8.setY(370);
		root.getChildren().add(wall8);
		
		//horizontal wall on top right
		Rectangle wall9 = new Rectangle(25,25,75, 25);
		wall9.setFill(border);
		wall9.setX(825);
		wall9.setY(220);
		root.getChildren().add(wall9);
	
		//verticle wall that points down and meets in the middle
		Rectangle wall10 = new Rectangle(25,25,25,85);
		wall10.setFill(border);
		wall10.setX(825);
		wall10.setY(225);
		root.getChildren().add(wall10);
				
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
