package baseball.controller;

import baseball.model.Game;
import baseball.model.ResultPerInput;
import baseball.model.Round;
import baseball.util.Util;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {
	public static void run() {
		Game game = new Game();
		do {
			playNewRound(game);			
			selectPlayAgainOrEnd(game);		
		} while (!game.isEnd());
		OutputView.printEndGame();
	}

	private static void playNewRound(Game game) {
		game.createNewRound();
		Round round = game.getRound();
		ResultPerInput resultPerInput;
		do {
			OutputView.answerNumInstruction();
			String gameInput = InputView.getInput();
			if(isValidGameInput(gameInput)) {
				resultPerInput = round.getResultPerInput(gameInput);
				OutputView.printCheckAnswer(resultPerInput.getResultString());
			}			
		} while (!round.isEnd());
		OutputView.printWinRound();
	}
	
	private static void selectPlayAgainOrEnd(Game game) {
		boolean isValid = true;
		do {
			OutputView.playNewRoundInstruction();
			String playAgainInput = InputView.getInput();
			isValid = isValidPlayAgainInput(playAgainInput);
			if(isValid) {
				game.selectPlayAgainOrEnd(playAgainInput);
			}	
		} while (!isValid);		
	}
	
	
	
	
	private static boolean isValidGameInput(String input) {
		if (input.length() != 3) {
			OutputView.printErrorInvalidDigit();
			return false;
		}

		if (input.indexOf("0") > -1) {
			OutputView.printErrorIncludeZero();
			return false;
		}

		if (!Util.isOnlyNum(input)) {
			OutputView.printErrorOnlyNum();
			return false;
		}

		if (Util.hasDuplStr(input)) {
			OutputView.printErrorDuplNum();
			return false;
		}
		return true;
	}
	
	
	private static boolean isValidPlayAgainInput(String input) {
		if (!"1".equals(input) && !"2".equals(input)) {
			OutputView.printInvalidPlayAgainInput();
			return false;
		}
		return true;
	}
	
	
}
