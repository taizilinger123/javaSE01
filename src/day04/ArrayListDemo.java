package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList
 * List的子类实现
 * 由数组方式实现的可重复的有序集
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
		    * 因为List是有序集，所以add方法是顺序向集合末尾添加元素
		    */
		   for(int i=0;i<1000;i++) {
			          list.add(i);
		   }

//		   list.add("二");
//		   list.add("三");
		   
		   System.out.println("集合元素数："+list.size());	  
		   
		   System.out.println(list);//[一，二，三]
		   
		   list.clear();//清空集合
		   
		   System.out.println("集合元素数："+list.size());
		   
		   System.out.println("是否为空集合："+list.isEmpty());

		   
	}
}
