package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ʹ�õ�������������
 * @author sige
 *
 */
public class IteratorDemo2 {
	public static void main(String[] args) {
         List  list = new  LinkedList();
         list.add("1");
         list.add("#");
         list.add("2");
         list.add("#");
         list.add("3");
         list.add("#");
         list.add("4");
         
         //��ȡ���ڱ������ϵĵ�����  java.util.Iterator
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();
        	        if("#".equals(element)) {
//        	        	   list.remove(element);
        	        	it.remove();//ɾ���ձ�����������Ԫ��
        	        }
         }
         System.out.println(list);//[1,2,3,4]
	}
}
