package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ʹ�õ�������������
 * @author sige
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
         List  list = new  LinkedList();
         list.add("1");
         list.add("2");
         list.add("3");
         list.add("4");
         list.add("5");
         
         //��ȡ���ڱ������ϵĵ�����
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();  // �ʣ�ȡһ��
        	        System.out.println("��һ����:"+element);
        	        System.out.println(it.next());//��ȡһ��,���Ա���
         }
	}
}
//Exception in thread "main" java.util.NoSuchElementException