package day01;

import java.util.Arrays;

/**
 * 实现   字符数组内容转为小写   算法
 *    X -x = 'A'-'a'
 * => X = x+('A'-'a')
 * => X - ('A'-'a') = x
 * x = X - ('A'-'a')
 *
 */
public class Demo07 {
	public static void main(String[] args) {
	   char[] chs = {'H','e','l','l','o',' ',
			   'W', 'o', 'r', 'l','d','!'};
	   char[] chs1 = Arrays.copyOf(chs, chs.length);
//     大写转小写	   
//	   for(int i=0; i<chs1.length; i++) {
//		   if(chs1[i]>='A' && chs1[i]<='Z') {
//			   //x = X - ('A'-'a')
//			   chs1[i] = (char)(chs1[i] - ('A'-'a'));
//		   }
//	   }
//     小写转大写	   
	   for(int i=0; i<chs1.length; i++) {
		   if(chs1[i]>='a' && chs1[i]<='z') {
			   //X = x+('A'-'a')
			   chs1[i] = (char)(chs1[i] + ('A'-'a'));
		   }
	   }
	   System.out.println(chs);
	   System.out.println(chs1);
	   //String API 返回值与原有字符串不同时候是新对象
	   String str = "hello world!";
	   String s = str.toLowerCase();
	   System.out.println(s);
	   System.out.println(s==str);
	   
	   String ss = "Hello World!";
	   ss.toUpperCase();
	   System.out.println(ss);
	   //选择输出结果:"Hello World!" "HELLO WPRLD!"
	   
	   
	}
}
