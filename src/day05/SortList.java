package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ʹ�ü��Ϲ��������򼯺�
 * @author sige
 *
 */
public class SortList {
	  public static void main(String[] args) {
//		   List<Point> list = new  ArrayList<Point>();
//		   list.add(new Point(1, 5));
//		   list.add(new Point(3, 4));
//		   list.add(new Point(2, 2));
		   /**
		    * JDK�е���Ҳʵ����comparable
		    * �����ַ���
		    */
		   List<String> list = new ArrayList<String>();
		   list.add("able");
		   list.add("adam");
		   list.add("marry");
		   list.add("BOSS");
		   list.add("killer");
		   list.add("TOM");
		   System.out.println(list);
		   
		   //���򼯺�
		   //java.util.Collections
		   Collections.sort(list);
		   System.out.println(list);
	}
}
