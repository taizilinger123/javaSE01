package day02;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		String str = "5, tom, 5, tom@tom.com, 119";
		//split��������������ƥ�䵽��λ������
		String[] data = str.split(",\\s?");
		System.out.println(Arrays.toString(data));
        //replaceAll �滻����ƥ����ַ���
		String s = str.replaceAll(",\\s?", "|");
		System.out.println(s);
		//toCharArray ���ַ����е��ַ����Ƶ��ַ�������
		char[] chs = s.toCharArray();
		System.out.println(Arrays.toString(chs));
		//new String(chs, 0, 5) ���ַ�������0λ�ÿ�ʼ����5���ַ�����
		//Ϊ���ַ���
		String ss = new String(chs, 0, 5);
		System.out.println(ss);
				
	}
}
