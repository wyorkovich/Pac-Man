package model;

public class Score {
	
	private int score;

	public int update(int pelletCount) {
		score = 100 * (275 - pelletCount);
		return score;
	}
	
	public int getScore() {
		return score;
	}
	
}
