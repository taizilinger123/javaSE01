package day01;
/**
 *    3)Java 中为了提高性能，静态字符串（字面量/常量/常量连接的结果）
        在静态池中创建，尽量使用同一个对象。重用静态字符串
   
   == 比较变量值，引用变量值相等，意味着是"同一个对象"的引用
 *
 */
public class Demo06 {
	public static final String S = "123ABC";
	public static final int A = 123;
	public static void main(String[] args) {
      String s1 = S;//"123ABC"
      String s2 = "123ABC";
      String s3 = A + "ABC";//"123ABC"
      String s4 = 123 + "ABC";//"123ABC"
      String s5 = "123" + "ABC";//"123ABC"
      String s6 = 1+2+3 + "ABC";//"6ABC"
      String s7 = '1'+'2'+'3'+"ABC";//"150ABC"
      String s8 = "1"+'2'+'3'+"ABC";//"123ABC"
      String s9 = "1"+"2"+"3"+"ABC";//"123ABC"
      String s10 = "ABC";
      String s11 =  "123" + s10;//运行期间创建新对象"123ABC"
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s5);
      System.out.println(s6);
      System.out.println(s7);
      System.out.println(s8);
      System.out.println(s9);
      System.out.println(s10);
      System.out.println(s11);
      System.out.println(s1==s2);
      System.out.println(s1==s3);
      System.out.println(s1==s4);
      System.out.println(s1==s5);
      System.out.println(s1==s8);
      System.out.println(s1==s9);
      System.out.println(s1==s11);
      
	}
}
