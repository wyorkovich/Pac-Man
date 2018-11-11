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
import model.gameBoard;
import model.player;

public class GameScreen extends Application{

	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	private static Stage window = new Stage();
	private static Color border = Color.MIDNIGHTBLUE;
	private static int sideLength = 220;
	private static int topLength = 500;
	private static Color test = Color.RED;
	private static gameBoard board = new gameBoard();
	private static player pacman = new player();
	
	//The Start method sets up the scene and adds in the game board
	@Override
	public void start(Stage screen) throws Exception {

		BorderPane root = new BorderPane();
		VBox centerBox = addCenterBox();
		root.setCenter(centerBox);
		centerBox.setStyle("-fx-background-color: BLACK");
		
		root.getChildren().add(board.addBoard());
		root.getChildren().add(pacman.createSprite());
		
		
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		
		scene.setOnKeyPressed(e -> {
			
			 switch (e.getCode()) {
			    case DOWN:
			        pacman.createSprite().setCenterY(pacman.createSprite().getCenterY() + 5);
			        break;
			    case UP:
			    	pacman.createSprite().setCenterY(pacman.createSprite().getCenterY() - 5);
			        break;
			    case LEFT:
			    	pacman.createSprite().setCenterX(pacman.createSprite().getCenterX() - 5);
			        break;
			    case RIGHT:
			    	pacman.createSprite().setCenterX(pacman.createSprite().getCenterX() + 5);
			        break;
			    }
			
		});
		
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
