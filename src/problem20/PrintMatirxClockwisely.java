package problem20;

/**
 * 输入一个矩阵，按照从外向里以里以顺时针的顺序依次打印
 * 每一个数组，例如输入如下矩阵：
 * 1   2   3    4
 * 5   6   7    8
 * 9   10  11   12
 * 13  14  15   16
 * 依次打印数字：1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * @author sunwei
 *
 */
public class PrintMatirxClockwisely {
	public void printMatrixClockwisely(int[][] arr, int rows, int columns) {
		if (arr == null || columns <= 0 || rows <= 0)
			return;
		int start = 0;
		while (columns > start * 2 && rows > start * 2) {
			printMatrixInCircle(arr, columns, rows, start);
			++start;
		}
	}

	private void printMatrixInCircle(int[][] arr, int columns, int rows,
			int start) {
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		// 从左到右打印一行
		for (int i = start; i <= endX; ++i) {
			int number = arr[start][i];
			printNumber(number);
		}
		// 从上到下打印一列,条件是终止行号大于起始行号
		if (start < endY) {
			for (int i = start + 1; i <= endY; ++i) {
				int number = arr[i][endX];
				printNumber(number);
			}
		}
		// 从右到左打印一行，条件是终止行号大于起始行号且终止列号大于起始列号
		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; --i) {
				int number = arr[endY][i];
				printNumber(number);
			}
		}
		// 从下到上打印一列，条件矩阵至少有三行两列，即是终止列号比起始列号大于2，同时终止列号大于起始列号
		if (start < endX && start < endY - 1) {
			for (int i = endY - 1; i >= start + 1; --i) {
				int number = arr[i][start];
				printNumber(number);
			}
		}
	}

	private void printNumber(int number) {
		System.out.print(number + "\t");
	}
}
