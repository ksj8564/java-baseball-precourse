package baseball.model;

public class Round {

	private RoundAnswerNum answer;
	private ResultPerInput resultPerInput;	

	public Round() {
		this.answer = new RoundAnswerNum();
	}
	
	public ResultPerInput getResultPerInput(String input) {
		createResultPerInput(input);
		return resultPerInput;
	}

	public void createResultPerInput(String input) {

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
		resultPerInput = new ResultPerInput(strikeCnt, ballCnt);
	}

	public boolean isEnd() {
		if(resultPerInput.getStrikeCnt() == 3) {
			return true;
		}
		return false;
	}
	
}
