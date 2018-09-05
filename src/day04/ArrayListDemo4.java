package day04;

import java.util.List;
import java.util.ArrayList;

/**
 * get方法   用于获取集合元素
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
		 * 获取回来时是以Object获取的，所以要造型
		 */
		String element = (String)list.get(1);
		System.out.println(element);//2
		
        for (int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
		}
        
        /**
         * 将元素"2"替换为元素"二"
         */
          Object  old =  list.set(1, "二");
          System.out.println(list);
          System.out.println("被替换的元素："+old);     
	}
}
