package problem09;

/**
 * 写一个函数，输入n，求Fibonacci数列的第n项，Fibonacci数列定义如下
 *          0  n = 0
 * f(n) =   1  n = 1
 *         f(n-1)+(n-2) n > 1
 * @author sunwei
 *
 */
public class Fibonacci {
	/**
	 * 递归实现的，效率不高
	 * @param num
	 * @return
	 */
	public double fibnocci1(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		return fibnocci1(num - 1) + fibnocci1(num - 2);
	}
	
	/**
	 * 非递归实现的
	 * @param num
	 * @return
	 */
	public double fibnocci2(int num){
		int[] result = {0,1};
		if(num < 2 && num > 0)
			return result[num];
		double fibMinOne = 1;
		double fibMinTwo = 0;
		double fibN = 0;
		for(int i = 2; i <= num; i++){
			fibN = fibMinOne + fibMinTwo;
			fibMinTwo = fibMinOne;
			fibMinOne = fibN;
		}
		return fibN;
	}

}
