package day02;

import java.util.Scanner;
/**
 * String API ��������ʽ��֧��
 * name.matches("������ʽ");
 *   ��һ���ַ�����������ʽ����ƥ�䣬
 *   ���ƥ��ɹ��ͷ���true,���򷵻�false
 */
public class Demo02 {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("�����û�����");
      String name = in.nextLine();
      // б����Ҫʹ��ת���ַ���д��
      boolean pass = name.matches("^\\w{8,10}$");
      if(! pass) {
    	  System.out.println("�û�����ʽ����");
      }
	}

}
