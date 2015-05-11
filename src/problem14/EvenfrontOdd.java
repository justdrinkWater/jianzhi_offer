package problem14;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
 * 
 * @author sunwei
 *
 */
public class EvenfrontOdd {

	public int[] order(int[] a) {
		int len = a.length;
		if (len == 0)
			System.out.println("输入数组为空~~");
		int aBegin = 0;
		int aEnd = len - 1;
		while (aBegin < aEnd) {
			// 从头开始找，找到不是奇数的
			while (aBegin < aEnd && (a[aBegin] & 0x1) != 0)
				aBegin++;
			// 从尾部开始找，找到不是偶数的
			while (aBegin < aEnd && (a[aEnd] & 0x1) == 0)
				aEnd--;
			//找到了则交换位置
			if (aBegin < aEnd) {
				int temp = a[aBegin];
				a[aBegin] = a[aEnd];
				a[aEnd] = temp;
			}
		}
		return a;
	}

}
