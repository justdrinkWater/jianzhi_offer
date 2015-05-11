package problem04;

/**
 * 请实现一个函数，把字符串中的每个空格替换成"%20。
 * 例如输入"We are happy.",则输入"We%20are%20happy."。
 * @author sunwei
 *
 */
public class ReplaceBlank {
	private String str;

	public ReplaceBlank(String str) {
		if (str == null)
			throw new RuntimeException("输入的字符串为空!!");
		this.str = str;
	}

	public char[] replace() {
		char[] c = str.toCharArray();
		int cLen = c.length;
		int blankCount = 0;
		for (char cha : c) {
			if (cha == ' ')
				blankCount++;
		}
		int newLength = cLen + (blankCount << 1);
		char[] c2 = new char[newLength];
		int indexOfOriginal = cLen - 1;
		int indexOfNew = newLength - 1;
		while (indexOfOriginal >= 0 && indexOfNew >= 0) {
			if (c[indexOfOriginal] == ' ') {
				c2[indexOfNew--] = '0';
				c2[indexOfNew--] = '2';
				c2[indexOfNew--] = '%';
			} else {
				c2[indexOfNew--] = c[indexOfOriginal];
			}
			--indexOfOriginal;
		}
		return c2;
	}
}
