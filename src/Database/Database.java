package Database;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * This class is the skeleton for the gson file that will act as our database
 * to store the high scores
 */
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import javafx.scene.text.Text;
import model.pellet;
import model.player;

public class Database {

	player p = new player();
	int MAX_SIZE =10;
	
	Gson database = new Gson();
	
	ArrayList<highScore> scoreList = new ArrayList<highScore>();

	ArrayList<highScore> output = new ArrayList<highScore>();
	String json = database.toJson(scoreList);
	//this class creates a database object, and puts the default starting scores into the json leadboard file
	public Database() {
		
		highScore testScore1 = new highScore(5500, "George Costanza");
		highScore testScore2 = new highScore(6500, "Josh K");
		highScore testScore3 = new highScore(1000, "Pac-Man");

		scoreList.add(new highScore(6500, "Josh K"));
		scoreList.add(new highScore(5500, "George Costanza"));
		scoreList.add(new highScore(5000, "Rusy Venture"));
		scoreList.add(new highScore(4000, "Seinfeld"));
		scoreList.add(new highScore(3500, "Carl Johnson"));
		scoreList.add(new highScore(2500, "Big Smoke"));
		scoreList.add(new highScore(1500, "Mike Hawk"));
		scoreList.add(new highScore(1000, "Pac-Man"));
		scoreList.add(new highScore(750, "Homer Simpson"));
		scoreList.add(new highScore(500, "Brock Hampton"));
		
		String json = database.toJson(scoreList);
		try {
			FileWriter write = new FileWriter("src/leaderboard.json");
			
			write.write(json);
			write.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//this class pulls the array from the json leaderboard, saves it and returns it in a highscore arraylist
public ArrayList<highScore> pullHighScore ()
{
	String scores = "[{'name':'Josh K','score':6500},{'name':'George Costanza','score':5500},{'name':'Rusy Venture','score':5000},{'name':'Seinfeld','score':4000},{'name':'Carl Johnson','score':3500},{'name':'Big Smoke','score':2500},{'name':'Mike Hawk','score':1500},{'name':'Pac-Man','score':1000},{'name':'Homer Simpson','score':750},{'name':'Brock Hampton','score':500}]";
	java.lang.reflect.Type scoreListType = new TypeToken<ArrayList<highScore>>(){}.getType(); 
	output =new Gson().fromJson(scores, scoreListType);
	return output;
}
//This method prints the leaderboard array of highscores
public String printHighScore ()
{
	ArrayList<highScore> output1 = pullHighScore();
	//System.out.println(output1.toString());
	scoreList.toString();
	return output1.toString();
}
//this method will parse the leaderboard and find a place for the new high score
public void addHighScore (highScore newScore) 
{
	for(int i=0; i<scoreList.size(); i++)
	{
		if (newScore.getScore()>scoreList.get(i).getScore())
			scoreList.set(i,newScore);
		
	}
}
}//end of class
