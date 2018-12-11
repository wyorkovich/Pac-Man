package Database;

import java.util.ArrayList;

public class highScore {

	String name; 
	int score;
	

public highScore(int newScore, String newName)
	{
	name = newName;
	score = newScore;
	
	}
public int getScore()
{
	return score;
}
public String getName()
{
	return name;
}
public String toString()
{
	return (name +" : " +score);
}
}//end of class highScore