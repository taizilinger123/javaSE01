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
		String element = (String)list.get(2);
		System.out.println(element);//2
		
        for (int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
		}
        
        /**
         * ��Ԫ��"2"�滻ΪԪ��"��"
         * ͬ���ģ�����ֵ���ܳ���size()-1
         */
          Object  old =  list.set(1, "��");
          System.out.println(list);
          System.out.println("���滻��Ԫ�أ�"+old);     
          
          /**
           * �ڼ����еڶ���λ�ò���Ԫ��"һ"
           */
          //[1,��,3]
          list.add(1,"һ");
          System.out.println(list);//[1,һ,��,3]
          
          /**
           * ɾ����3��Ԫ��
           * ����ֵΪ��ɾ����Ԫ��
           */
          Object  re =  list.remove(2);
          System.out.println(re);
          
          //�鿴"3"�ڼ����е�λ��
          int  index = list.indexOf("3");
          System.out.println("3�ڼ����е�λ�ã�"+index);
	}
}
