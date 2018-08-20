package day01;

/**
 *  条码应用    EAN-13
 *694821332904 1
 * 前12位的奇数位的和c1: 6+0+2+4+6+8 = 26 
 * 前12位的偶数位的和c2: 9+1+3+5+7+9 = 34
 * 
 * 将奇数和与偶数和的三倍相加c1+c2*3: 26+34*3 = 128 
 * 取结果的个位数：128的个位数为8(%10)
 * 用10减去这个个位数：10 - 8 = 2
 * 所以校验码为2
 * （注：如果取结果的个位数为0，那么校验码不是为10(10 -0 = 10),而是0.）
 *
 */
public class Demo10 {
	public static void main(String[] args) {
      //                0123456789012
	  String barcode = "6953220900756";
//      char c = barcode.charAt(2);//返回序号位置上的字符
//      System.out.println(c);//'5'
//      int n = c - '0';//48+5 - 48 = 5 
//      System.out.println(n);//int 5
//      System.out.println((int)c);//int 53
	  System.out.println(code(barcode));
	}
	/** 计算EAN-13验证码 */
	public static int code(String bar) {
	  //bar="6953220900756"
	  //     1234567890123
	  //     0123456789012
	  //i=   0 2 4 6 8 0 
	  int c1 = 0;
	  int c2 = 0;
	  for(int i=0; i<12; i+=2) {
		  //i = 0 2 4 6 8 10 
		  char c = bar.charAt(i);//c='6''5''2'...
		  c1 += c-'0';
		  c2 += bar.charAt(i+1)-'0';
	  }
	  int cc = c1+c2*3;
	  //       10 - 0~9 = 10~1
	  int c = (10 - cc%10)%10;
	  return c;
	}
}
