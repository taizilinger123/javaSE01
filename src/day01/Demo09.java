package day01;
/**
 * indexOf 查找字符串的序号
 *
 */
public class Demo09 {
	public static void main(String[] args) {
	  //            0123456789012
	  String str = "Think in Java";
	  int index = str.indexOf("Java");
	  System.out.println(index);//9
	  index = str.indexOf("PHP");
	  System.out.println(index);//-1
	  
	  index = str.indexOf('i', 3);
	  System.out.println(index);//6
	  //substring 取子字符串，截取字符串的一部分
	  String s = str.substring(6, 8);
	  System.out.println(s);//in 
	  //从email中截取用户名和主机名
	  //              012345678901
	  String email = "liucangsong@gmail.com";//name@host 
	  String name = email.substring(0, email.indexOf("@"));
	  String host = email.substring(email.indexOf("@")+1);
	  System.out.println(name);
	  System.out.println(host);
	}
}
