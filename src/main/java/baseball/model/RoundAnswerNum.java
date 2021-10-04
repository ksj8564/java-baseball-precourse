package baseball.model;

import java.util.ArrayList;

import nextstep.utils.Randoms;

public class RoundAnswerNum {

	private ArrayList<Integer> numList = new ArrayList<Integer>();

	public RoundAnswerNum() {
		int numListIndex = 0;
		while (numListIndex < 3) {
			int num = Randoms.pickNumberInRange(1, 9);
			if (!isDuplNum(num)) {
				numList.add(num);
				numListIndex++;
			}
		}
	}

	private boolean isDuplNum(int num) {
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) == num) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> getNumList() {
		return this.numList;
	}

	public boolean isStrike(int inputIndex, int num) {
		if (numList.contains(num) && numList.get(inputIndex) == num) {
			return true;
		}
		return false;
	}

	public boolean isBall(int inputIndex, int num) {
		if (numList.contains(num) && numList.get(inputIndex) != num) {
			return true;
		}
		return false;
	}

}
