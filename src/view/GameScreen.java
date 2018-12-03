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
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import model.gameBoard;
import model.pellet;
import model.player;

public class GameScreen extends Application{

	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	private static Stage window = new Stage();
	private static gameBoard board = new gameBoard();
	private static player pacman = new player();
	private static pauseWindow pause = new pauseWindow();
	private static pellet food = new pellet();
	private static winWindow win = new winWindow();
	Group root = new Group();
	Group pellets = food.addPellets();
	private static int pelletCount = 275;
	//The Start method sets up the scene and adds in the game board
	@Override
	public void start(Stage screen) throws Exception {
		
		//BorderPane root = new BorderPane();
		
		
		VBox centerBox = addCenterBox();
		//root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: BLACK");
		//root.setBottom(label);

		//adds all images and characters into the scene
		root.getChildren().add(board.addBoard());
		root.getChildren().add(board.addSides());
		root.getChildren().add(pellets);
		root.getChildren().add(pacman.createSprite());
		
		//listens for key presses
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.P) {
				pause.createWindow();
			}//end of if
			else {
				pacman.move(e);
				root.getChildren().remove(pellets);
				pellets = eatFood();
				root.getChildren().add(pellets);
			}//end of else
			});
		
		window.setTitle(TITLE);
		window.setScene(scene);
		window.setMaximized(true);
		window.show();
		
	}
	
	public Group eatFood() {
		System.out.println(pelletCount);
		Stage stage = new Stage();
		if(pelletCount == 0) {
			try {
				win.start(stage);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(Node n: pellets.getChildren()) {
			if(collide(n)) {
				n.setTranslateX(2000);
				pelletCount--;
				}
		}
		return pellets;
	}
	
	public boolean collide(Node other) {			
		return (pacman.createSprite().getBoundsInParent().intersects(other.getBoundsInParent()));
	}//end of collide
	
	public void close() {
		window.close();
	}
	
	private VBox addCenterBox() {  //test comment
		VBox box = new VBox();

		box.setAlignment(Pos.CENTER);
		return box;
	}
	
}
