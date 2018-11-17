package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用迭代器遍历集合
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
         
         //获取用于遍历集合的迭代器
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();
        	        System.out.println(element);
         }

	}
}
