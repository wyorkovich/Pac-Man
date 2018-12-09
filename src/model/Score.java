package model;

public class Score {
	
	private int score;

	public int update(int pelletCount) {
		/*
		 * player object HAS A score.
		 * player object HAS A pellet (object).
		 * 
		 * This method is called in player's move method
		 * anytime a key (UP, DOWN, LEFT, or RIGHT) is pressed.
		 * 
		 * pellet.getPelletCount().
		 * 
		 * score value = 100 * (275 - pellet.getPelletCount()).
		 */
		score = 100 * (275 - pelletCount);
		
		return score;
		
	}
	
	public int getScore() {
		return score;
	}
	
}
