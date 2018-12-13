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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.gameBoard;
import model.pellet;
import model.player;
import model.red_Blinky;

public class GameScreen extends Application{

	private static String TITLE = "Pac-Man";
	private static int SCENE_WIDTH = 300;
	private static int SCENE_HEIGHT = 400;
	private static Stage window = new Stage();
	private static gameBoard board = new gameBoard();
	private static player pacman = new player();
	private static pauseWindow pause = new pauseWindow();
	private static pellet food;
	private static winWindow win = new winWindow();
	private static HBox bottomBox;
	private static Text scoreText;

	private static red_Blinky blinky = new red_Blinky();
	private static ActionHandlerPacman pHandle = new ActionHandlerPacman();
	Group root = new Group();
	
	//The Start method sets up the scene and adds in the game board
	@Override
	public void start(Stage screen) throws Exception {
		
		VBox centerBox = addCenterBox();
		bottomBox = addBottomBox();
		centerBox.setStyle("-fx-background-color: BLACK");
		food = pacman.getFood();
		
		//adds all images and characters into the scene
		root.getChildren().add(board.getBoardGroup());
		root.getChildren().add(food.getPelletGroup());
		root.getChildren().add(pacman.createSprite());
		root.getChildren().add(blinky.createSprite());
		root.getChildren().add(bottomBox);
		
		//listens for key presses
		Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.BLACK);
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.P) {
				pause.createWindow();
			}//end of if
			else {
				//Can i make this more MVC compliant?
				pHandle.move(e,pacman);
				blinky.updatePosition(pacman);
				root.getChildren().remove(food.getPelletGroup());
				scoreText.setText("Score: " + updateScore());
				root.getChildren().add(food.getPelletGroup());
			}//end of else
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

	private HBox addBottomBox() { // For scorekeeping
		HBox box = new HBox();		
		ObservableList<Node> list = box.getChildren();
		
		Rectangle rect = new Rectangle(525, 50);
		rect.setStroke(Color.RED);
		rect.setStrokeWidth(2);
		rect.setTranslateX(400);
		rect.setTranslateY(675);
		
		int score = pacman.getScore();
		
		scoreText = new Text("Score: " + score);
		scoreText.setTranslateY(675);
		scoreText.setTranslateX(-100);
		scoreText.setFont(Font.font("Impact", 20));
		scoreText.setFill(Color.WHITE);
		
		list.add(rect);
		list.add(scoreText);

		return box;
	}
	
	public int updateScore() {
		return pacman.getScore();
	}

}
