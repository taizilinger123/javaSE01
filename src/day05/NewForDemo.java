package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ��ѭ�� �����������ϻ�����
 * @author sige
 *
 */
public class NewForDemo {
     public static void main(String[] args) {
		   int[]  array  =  {1,2,3,4,5,6,7,8};
		   for(int i=0;i<array.length;i++) {
			   int num = array[i];
			   System.out.println(num+1);//Ϊÿ��Ԫ��+1�����
		   }
		   
		   //new  for 
		   for(int  num  :  array) {
			        System.out.println(num+1);
		   }
		   
		   /**
		    * ��������
		    */
//		    Collection<String> list = new  ArrayList<String>();
		    List<String> list = new  ArrayList<String>();
		    list.add("һ");
		    list.add("��");
		    list.add("��");
		    list.add("��");
		    list.add("��");
		   
		    for(int  i =0;i<list.size();i++) {
		    	String str = list.get(i);
		    	System.out.println("��"+(i+1)+"��:"+str);
		    }
		    /**
		     * ��ѭ����ʹ�õ���������ʽʵ�ֵġ�
		     * ����Ҫע�⣡����ѭ���в�Ҫͨ������ɾ��Ԫ�أ�
		     */
		    for(String  str  : list ) {
		    	  System.out.println(str);
//		    	  list.remove(str);//����
		    }	   
	}
}
