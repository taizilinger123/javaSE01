package day04;

import java.util.ArrayList;
import java.util.List;
/**
 * ����ʹ��List����Զ������͵�Ԫ��
 * javadoc
 * @author sige
 */
public class ArrayListDemo2 {
      public static void main(String[] args) {
		    //��������
    	    List   list  =  new  ArrayList();
    	    //�������Pointʵ��
    	    list.add(new Point(1, 2));
    	    list.add(new Point(3, 4));
    	    list.add(new Point(5, 6));
    	    
    	    System.out.println(list);//[x=1, y=2, x=3, y=4, x=5, y=6]
    	    
    	    Point  p  = new Point(1, 2);
    	    /**
    	     * �����ıȽ��ǻ���equals��.
    	     */
    	    if(list.contains(p)) {
    	    	System.out.println("����");
    	    	/**
    	    	 * remove����ɾ�������е�һ�����������p��ͬ��Ԫ��
    	    	 */
    	    	list.remove(p);
    	    }else {
    	    	System.out.println("������");
    	    }
    	    System.out.println(list);
	}
}
