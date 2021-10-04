package baseball.util;

public class Util {
	public static boolean isOnlyNum(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) { // 숫자가 아닐 경우
				return false;
			}
		}
		return true;
	}

	public static boolean hasDuplStr(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) != i) {
				return true;
			}
		}
		return false;
	}
}
