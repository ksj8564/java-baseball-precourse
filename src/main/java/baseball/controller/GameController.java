package baseball.controller;

import baseball.model.Game;
import baseball.model.Round;
import baseball.model.RoundResult;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
	public static void run() {
		Game game = new Game();
		do {
			playNewRound(game);
			OutputView.playNewRoundInstruction();
			game.playAgain(InputView.getInput());
		} while (!game.isEnd());
		OutputView.printEndGame();
	}

	private static void playNewRound(Game game) {
		game.createNewRound();
		Round round = game.getRound();
		RoundResult roundResult;
		do {
			OutputView.answerNumInstruction();
			roundResult = round.getRoundResult(InputView.getInput());
			OutputView.printCheckAnswer(roundResult.getResultString());
		} while (!roundResult.isEnd());
		OutputView.printWinRound();
	}
}
