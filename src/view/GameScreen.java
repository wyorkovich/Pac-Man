package view;
import controller.ActionHandlerPacman;
//This is the window where the game will be played
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import model.gameBoard;
import model.player;

public class GameScreen extends Application{

//	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	private static Image gameboard = new Image("file:Pac-Man/ImgResources/pacmanboard.png");
//	private static Stage window = new Stage();
//	private static gameBoard board = new gameBoard();
//	private static player pacman = new player();
	Group root = new Group();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(root);
		Canvas canvas = new Canvas(SCENE_WIDTH, SCENE_HEIGHT);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		root.getChildren().add(canvas);
		primaryStage.setTitle("Pac-Man");
		primaryStage.setScene(scene);
		
		gc.drawImage(gameboard, SCENE_WIDTH, SCENE_HEIGHT);
		
		primaryStage.show();
	}
	
	//The Start method sets up the scene and adds in the game board
//	@Override
//	public void start(Stage screen) throws Exception {
//		
//		//BorderPane root = new BorderPane();
//		
//		
//		VBox centerBox = addCenterBox();
//		//root.setCenter(centerBox);
//		centerBox.setStyle("-fx-background-color: BLACK");
//		//root.setBottom(label);
//
//		//adds all images and characters into the scene
//		root.getChildren().add(board.addBoard());
//		root.getChildren().add(board.addSides());
//		root.getChildren().add(pacman.createSprite());
//		
//				
//		//listens for key presses
//		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
//		scene.setOnKeyPressed(e -> {
//			pacman.move(e);
//		});
//		
//		window.setTitle(TITLE);
//		window.setScene(scene);
//		window.setMaximized(true);
//		window.show();
//		
//	}
	
//	public void close() {
//		window.close();
//	}
	
//	private VBox addCenterBox() {  //test comment
//		VBox box = new VBox();
//
//		box.setAlignment(Pos.CENTER);
//		return box;
//	}
	
}
