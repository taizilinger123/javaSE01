package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList
 * List������ʵ��
 * �����鷽ʽʵ�ֵĿ��ظ�������
 * @author sige
 *
 */
public class ArrayListDemo {
	 public static void main(String[] args) {
		 /**
		  * java.util.List
		  * java.util.ArrayList
		  */
		   //List  list = new  ArrayList();
		   List  list = new  LinkedList();
		   /**
		    * ��ΪList�����򼯣�����add������˳���򼯺�ĩβ���Ԫ��
		    */
		   for(int i=0;i<1000;i++) {
			          list.add(i);
		   }

//		   list.add("��");
//		   list.add("��");
		   
		   System.out.println("����Ԫ������"+list.size());	  
		   
		   System.out.println(list);//[һ��������]
		   
		   list.clear();//��ռ���
		   
		   System.out.println("����Ԫ������"+list.size());
		   
		   System.out.println("�Ƿ�Ϊ�ռ��ϣ�"+list.isEmpty());

		   
	}
}
