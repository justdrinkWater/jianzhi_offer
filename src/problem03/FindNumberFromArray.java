package problem03;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照都上到下的递增的顺序排序。请完成一个函数，
 * 输入一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author sunwei
 *
 */
public class FindNumberFromArray {
	private int rows;
	private int columns;
	private int[][] arr;
	private int num;

	public FindNumberFromArray(int[][] arr, int rows, int columns, int num) {
		if (arr.length > 0 && rows > 0 & columns > 0) {
			this.arr = arr;
			this.rows = rows;
			this.columns = columns;
		} else {
			throw new RuntimeException("输入的二维数组为空！！");
		}
		this.num = num;
	}

	/**
	 * 从右上角开始，如果这个数比选中的数大，则表示应该往下走，
	 * 如果比选中的数小，则应该往左边走，如果找到则返回true，否则返回false
	 * @return
	 */
	public boolean findNumber() {
		boolean found = false;
		int row = 0;
		int column = columns - 1;
		while (row < rows && column >= 0) {
			if (arr[row][column] == num) {
				found = true;
				break;
			}else if(arr[row][column] > num){
				column-- ;
			}else {
				row++;
			}
		}
		return found;
	}

}
