package day03;

import java.math.BigInteger;

/**
 * ��long��������������Ҫ���������ʱʹ��BigInteger
 * @author sige
 *
 */
public class BigIntegerDemo {
      public static void main(String[] args) {
    	  BigInteger  sum = BigInteger.valueOf(1);
		    for(int  i = 2;i<=200;i++) {
		    	//sum  *=  i;
		    	sum  = sum.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(sum);
	}
}
