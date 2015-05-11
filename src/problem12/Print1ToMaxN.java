package problem12;

/**
 * 输入数字n，按顺序打印出从1到最大的n位十进制。
 * 比如输入3，则打印出1，2, 3一直到最大的3位数即999
 * @author sunwei
 *
 */
public class Print1ToMaxN {

	/**
	 * 使用字符数组模拟数字加法
	 * @param n
	 */
	public void printToMax(int n){
		if(n <= 0)
			return;
		char[] num = new char[n];
		for(int i = 0; i < num.length; i++)
			num[i] = '0';
		while(!increment(num)){
			printNum(num);
		}
	}

	/**
	 * 打印值，由于使用的是字符数组，所以需要从非0的
	 * 地方开始打印，否则打印出来的数字前面会带有0
	 * @param num
	 */
	private void printNum(char[] num) {
		boolean isBeginning0 = true;
		int len = num.length;
		for(int i = 0; i < len; ++i){
			if(isBeginning0 && num[i] != '0')
				isBeginning0 = false;
			if(!isBeginning0)
			{
				System.out.print(num[i]);
			}
		}
		System.out.print("\t");
		
	}
	/**
	 * 判断是否到达到达最大值
	 * @param num
	 * @return
	 */
	private boolean increment(char[] num) {
		boolean isOverflow = false;
		int nTakeOver = 0;
		int len = num.length;
		for(int i = len - 1; i >= 0; i--){
			int nSum = num[i] - '0' + nTakeOver;
			if(i == len - 1)
				nSum++;
			if(nSum >= 10)
			{
				if(i == 0)
					isOverflow = true;
				else{
					nSum -= 10;
					nTakeOver = 1;
					num[i] = (char) (nSum + '0');
				}
			}else{
				num[i] = (char)(nSum + '0');
				break;
			}
		}
		return isOverflow;
	}
	
	/*****************************************************************************************************/
	/**
	 * 使用递归的方式，先设置高位，再设置低位，判断条件是设置了最低位的值
	 * @param n
	 */
	public void print1ToMax2(int n){
		if(n <= 0)
			return;
		char[] num = new char[n];
		for(int i = 0; i < 10; i++){
			num[0] = (char) (i + '0');
			print1ToMaxOfN2Recursively(num,n,0);
		}
	}

	private void print1ToMaxOfN2Recursively(char[] num, int length, int index) {
		if(index == length - 1){
			printNum(num);
			return;
		}
		for(int i = 0; i < 10; i++){
			num[index + 1] = (char) (i + '0');
			print1ToMaxOfN2Recursively(num, length, index + 1);
		}
	}
	

}
