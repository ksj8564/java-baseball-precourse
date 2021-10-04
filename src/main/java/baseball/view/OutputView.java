package baseball.view;

public class OutputView {

	public static void answerNumInstruction() {
		System.out.print("숫자를 입력해주세요 : ");
	}
	
	public static void playNewRoundInstruction() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
	}
	
	public static void printWinRound() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
	}
	
	public static void printEndGame() {
		System.out.println("게임을 완전히 종료합니다.");
	}
	
	public static void printCheckAnswer(String checkResult) {
		System.out.println(checkResult);
	}

	
}
