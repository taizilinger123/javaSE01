package day03;

import java.math.BigDecimal;

/**
 * ��С��
 * ������������ȷ��С��
 * ���಻�ǰ�װ��!
 * java.math.BigDecimal
 * @author sige
 *
 */
public class BigDecimalDemo {
     public static void main(String[] args) {
    	 BigDecimal  d1 = new  BigDecimal("3.0");
    	 BigDecimal  d2 = new  BigDecimal("2.9");
    	 //d1 - d2
    	 BigDecimal d3 = d1.subtract(d2);
    	 System.out.println(d3);
    	 /**
    	  * �ӷ�������public  Decimal  add(Decimal  d)
    	  * �˷�������public  Decimal  multiply(Decimal  d)
    	  * ����������public  Decimal  divide(Decimal  d)
    	  */
    	 /**
    	  * ��������ѡȡ�÷������ڶ����������ڸ�֪�����С��λ
    	  * ������������֪������������
    	  */
    	BigDecimal  d4 =  d1.divide(d2, 8,BigDecimal.ROUND_HALF_UP);
    	System.out.println(d4);	 
	}
}
