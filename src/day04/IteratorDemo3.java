package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ʹ�õ�������������
 * @author sige
 *
 */
public class IteratorDemo3 {
	public static void main(String[] args) {
         List  list = new  LinkedList();
         list.add("1");
         list.add("2");
         list.add("3");
         list.add("4");
         
         //��ȡ���ڱ������ϵĵ�����
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();
        	        System.out.println(element);
         }

	}
}
