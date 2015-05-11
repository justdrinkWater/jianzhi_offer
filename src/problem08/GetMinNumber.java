package problem08;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的
 *  旋转。输入一个递归排序的数组的一个旋转，输入旋转数组的最小元素。
 * 例如数组{3，4，5，1，2}为{1，2，3，4，5}的一个旋转，该数组的最小值为1.
 * 
 * @author sunwei
 *
 */
public class GetMinNumber {
	private int[] arr;

	public GetMinNumber(int[] arr) {
		if (arr.length <= 0) {
			System.out.println("输入的数组为空！！");
		} else {
			this.arr = arr;
		}
	}

	/**
	 * 头部一个index1 尾部一个index2 中间mid
	 *  当arr[mid]>arr[index]时，说明小的值在mid右侧
	 *  当arr[mid]<arr[index]时，说明小的值在mid左侧
	 *  当arr[index1]=arr[mid]=arr[index2]时，这样的话就不知道在左侧还是在右侧
	 *  所以需要从头开始查找最小值
	 * 
	 * @return
	 */
	public int getMinNumber() {
		int len = arr.length;
		int index1 = 0;
		int index2 = len - 1;
		int mid = index1;
		while (arr[index1] >= arr[index2]) {
			if (index2 - index1 == 1) {
				mid = index2;
				break;
			}
			mid = (index1 + index2) / 2;
			// 如果下标为index1、index2、和mid指向的三个数字相等
			// 只能顺序查找
			if (arr[index1] == arr[index2] && arr[index1] == arr[mid])
				return minInOrder(index1, index2);
			if (arr[mid] >= arr[index1]) {
				index1 = mid;
			} else if (arr[mid] <= arr[index2]) {
				index2 = mid;
			}
		}
		return arr[mid];
	}

	private int minInOrder(int index1, int index2) {
		int result = arr[index1];
		for (int i = index1 + 1; i <= index2; ++i) {
			if (result > arr[i])
				result = arr[i];
		}
		return result;
	}
}
