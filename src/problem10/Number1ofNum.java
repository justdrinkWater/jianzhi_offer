package problem10;

/**
 * 实现一个函数，输入一个整数，输出该数二进制表示
 * 中1的个数，例如把9表示成二进制是1001，有2位是1，
 * 因此如果输入9，该函数输出2.
 * @author sunwei
 *
 */
public class Number1ofNum {
	/**
	 * 常规解法，
	 * 首先把i和1做与运算，判断i的最低位是不是1，接着把1左移
	 * 一位得到2，再和i做与运算，判断i的次低位是不是，这样反复
	 * 左移，每次都判断i的其中一位是不是1.
	 * 由于Java中的整型数是32位，所以总共需要移动32次。
	 * @param n
	 * @return
	 */
	public int numberOf1(int n){
		int count = 0;
		int flag = 1;
		while(flag != 0){
			if((n & flag) != 0)
				count++;
			flag = flag << 1;
		}
		
		return count;
	}
	/**
	 * 惊奇的解法：
	 * 当一个数减1再和原整数做与运算，会将最右边的1变成0，
	 * 利用这一特性，那么一个整数的二进制表示数中有多少个1，
	 * 就可以进行多少次这一的操作。
	 * @param n
	 * @return
	 */
	public int numberOf1_2(int n){
		int count = 0;
		while(n != 0){
			++count;
			n = (n - 1) & n;
		}
		return count;
	}

}
