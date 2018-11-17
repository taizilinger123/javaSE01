package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用迭代器遍历集合
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
         
         //获取用于遍历集合的迭代器  java.util.Iterator
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();
        	        if("#".equals(element)) {
//        	        	   list.remove(element);
        	        	it.remove();//删除刚被迭代出来的元素
        	        }
         }
         System.out.println(list);//[1,2,3,4]
	}
}
