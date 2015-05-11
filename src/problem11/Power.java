package problem11;

/**
 * 实现函数double power（double base，int exponent），求base的exponent次方
 * 
 * @author sunwei
 *
 */
public class Power {
	public double power(double base , int exponent){
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		double result = power(base,exponent>>1);
		result *= result;
		if((exponent & 1) == 1)
			result *= base;
		return result;
	}
}
