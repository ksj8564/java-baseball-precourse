package baseball.model;

public class RoundResult {
	
	private int strikeCnt = 0;
	private int ballCnt = 0;
			
	public RoundResult(int strikeCnt, int ballCnt) {
		this.strikeCnt = strikeCnt;
		this.ballCnt = ballCnt;
	}
	
	public int getStrikeCnt() {
		return strikeCnt;
	}
	
	public int getBallCnt() {
		return ballCnt;
	}
	
	public String getResultString() {
		StringBuilder result = new StringBuilder();
		result.setLength(0);
		if (strikeCnt > 0) {
			result.append(strikeCnt).append("스트라이크");
		}
		if (ballCnt > 0) {
			result.append(" ").append(ballCnt).append("볼");
		}
		if (strikeCnt + ballCnt == 0) {
			result.append("낫싱");
		}
		return result.toString().trim();
	}
	
	public boolean isEnd() {
		if(strikeCnt == 3) {
			return true;
		}
		return false;
	}
	
}
