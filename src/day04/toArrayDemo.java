package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ������ת��Ϊָ��������
 * @author sige
 *
 */
public class toArrayDemo {
     public static void main(String[] args) {
		List list =  new  ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Object[] array = list.toArray();
		/**
		 * ת��ʱ��Ҫע�⣺
		 * 1�����������ľ��Ǿ���Ҫת���������ʵ����������Ҫ����
		 * 2������ʱҪ����
		 * 3��һ��Ҫע�⣬Ҫת������������Ҫ�ͼ����д�ŵ�����һ��
		 * 
		 * �������鶼��Array����
		 */
		String[] strArray=(String[])list.toArray(new String[0]);
		System.out.println(Arrays.toString(strArray));
		System.out.println(strArray);
	}
}
