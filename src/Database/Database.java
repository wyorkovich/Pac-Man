package Database;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

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
	
	Hashtable output = new Hashtable();
	Hashtable scores = new Hashtable ();
	String toFile;
	//this class creates a database object, and puts the default starting scores into the json leadboard file
	public Database() {
		
		
		scores.put(0,new highScore(500, "Brock Sampson"));
		scores.put(1,new highScore(750, "Homer Simpson"));
		scores.put(2,new highScore(1000, "Pac-Man"));
		scores.put(3,new highScore(1500, "Mike Hawk"));
		scores.put(4,new highScore(2500, "Big Smoke"));
		scores.put(5,new highScore(3500, "Carl Johnson"));
		scores.put(6,new highScore(4000, "Seinfeld"));
		scores.put(7,new highScore(5000, "Rusy Venture"));
		scores.put(8,new highScore(5500, "George Costanza"));
		scores.put(9,new highScore(6500, "Big Test"));
	
		//sending scores dictionary to json file
		toFile = database.toJson(scores);
		try {
			FileWriter write = new FileWriter("src/leaderboard.json");
			
			write.write(toFile);
			write.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//this class pulls the array from the json leaderboard, saves it and returns it in a hashtable
public Hashtable pullHighScore () 
{
	String scores =  toFile.toString(); 
	
	output =new Gson().fromJson(toFile, Hashtable.class);
	return output;
}
//This method prints the leaderboard array of highscores
public String printHighScore () 
{
	String finalString;
	pullHighScore();
	finalString = formatHashString(output.toString());
	
	return finalString;
}
//this method will parse the leaderboard and find a place for the new high score
public void addHighScore (highScore newScore) 
{
	for(int i=0; i<scores.size(); i++)
	{
			scores.put(i,newScore);
	}
}
public String formatHashString(String hashString)
{
	String newString="";
	for(int i= 0; i<hashString.length(); i++)
	{
		
		newString+=hashString.charAt(i);
		if(hashString.charAt(i) == '}')
			newString+="\n";

	}//end of for loop	
	newString=newString.replace(',', ' ');
	newString=newString.replace('{' , ' ');
	newString=newString.replace('}', ' ');
	return newString;
	
}//end of formatHashString
}//end of class
