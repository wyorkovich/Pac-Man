package Database;
import java.io.FileWriter;
import java.io.IOException;

/*
 * This class is the skeleton for the gson file that will act as our database
 * to store the high scores
 */
import com.google.gson.*;
import com.google.gson.stream.JsonWriter;

import model.pellet;
import model.player;

public class Database {

	private String name;
	private int score;
	player p = new player();
	
	Gson database = new Gson();
	
	public Database() {
		
		String json = database.toJson(p);
		
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
	
}//end of class
