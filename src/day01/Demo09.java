package day01;
/**
 * indexOf �����ַ��������
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
	  //substring ȡ���ַ�������ȡ�ַ�����һ����
	  String s = str.substring(6, 8);
	  System.out.println(s);//in 
	  //��email�н�ȡ�û�����������
	  //              012345678901
	  String email = "liucangsong@gmail.com";//name@host 
	  String name = email.substring(0, email.indexOf("@"));
	  String host = email.substring(email.indexOf("@")+1);
	  System.out.println(name);
	  System.out.println(host);
	}
}
