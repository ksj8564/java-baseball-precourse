package baseball.model;

public class Round {

	private RoundAnswerNum answer;
	private RoundResult roundResult;	

	public Round() {
		this.answer = new RoundAnswerNum();
	}
	
	public RoundResult getRoundResult(String input) {
		createRoundResult(input);
		return roundResult;
	}

	public void createRoundResult(String input) {

		int strikeCnt = 0;
		int ballCnt = 0;

		String[] inputArr = input.split("");
		for (int i = 0; i < inputArr.length; i++) {
			int num = Integer.parseInt(inputArr[i]);
			if (answer.isStrike(i, num)) {
				strikeCnt++;
			}
			if (answer.isBall(i, num)) {
				ballCnt++;
			}
		}
		roundResult = new RoundResult(strikeCnt, ballCnt);
	}
}
