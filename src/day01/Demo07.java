package day01;

import java.util.Arrays;

/**
 * ʵ��   �ַ���������תΪСд   �㷨
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
//     ��дתСд	   
//	   for(int i=0; i<chs1.length; i++) {
//		   if(chs1[i]>='A' && chs1[i]<='Z') {
//			   //x = X - ('A'-'a')
//			   chs1[i] = (char)(chs1[i] - ('A'-'a'));
//		   }
//	   }
//     Сдת��д	   
	   for(int i=0; i<chs1.length; i++) {
		   if(chs1[i]>='a' && chs1[i]<='z') {
			   //X = x+('A'-'a')
			   chs1[i] = (char)(chs1[i] + ('A'-'a'));
		   }
	   }
	   System.out.println(chs);
	   System.out.println(chs1);
	   //String API ����ֵ��ԭ���ַ�����ͬʱ�����¶���
	   String str = "hello world!";
	   String s = str.toLowerCase();
	   System.out.println(s);
	   System.out.println(s==str);
	   
	   String ss = "Hello World!";
	   ss.toUpperCase();
	   System.out.println(ss);
	   //ѡ��������:"Hello World!" "HELLO WPRLD!"
	   
	   
	}
}
