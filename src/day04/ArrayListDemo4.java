package day04;

import java.util.List;
import java.util.ArrayList;

/**
 * get����   ���ڻ�ȡ����Ԫ��
 * @author sige
 *
 */
public class ArrayListDemo4 {
	  public static void main(String[] args) {
		List  list  =  new  ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		/**
		 * ��ȡ����ʱ����Object��ȡ�ģ�����Ҫ����
		 */
		String element = (String)list.get(1);
		System.out.println(element);//2
		
        for (int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
		}
        
        /**
         * ��Ԫ��"2"�滻ΪԪ��"��"
         */
          Object  old =  list.set(1, "��");
          System.out.println(list);
          System.out.println("���滻��Ԫ�أ�"+old);     
	}
}
