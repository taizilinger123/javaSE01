package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ���ظ���Set
 * @author sige
 *
 */
public class SetDemo {
      public static void main(String[] args) {
		   Set<String>  set = new HashSet<String>();
		   List<String>  list = new  ArrayList<String>();
		   
		   String  str = "element";
		   //��list�����з�������ͬ����Ԫ��
		   list.add(str);
		   list.add(str);
		   
		   //��set������Ҳ������
		   set.add(str);
		   set.add(str);
		   
		   System.out.println(list.size());
		   System.out.println(set.size());
		   
		   System.out.println(list);
		   System.out.println(set);
 	}
}
