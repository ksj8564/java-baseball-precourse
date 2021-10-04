package baseball.model;

public class Game {

	private boolean isEnd = false;
	private Round round;
	
	public boolean isEnd() {
		return isEnd;
	}

	public void createNewRound() {
		round = new Round();
	}

	public Round getRound() {
		return round;
	}
	
	public void selectPlayAgainOrEnd(String input) {			
		if("2".equals(input)) {
			isEnd = true;
		}
	}
}
