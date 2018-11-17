package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用迭代器遍历集合
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
         
         //获取用于遍历集合的迭代器
         Iterator  it = list.iterator();
         
         while(it.hasNext()) {
        	        String  element = (String)it.next();  // 问，取一次
        	        System.out.println("这一项是:"+element);
        	        System.out.println(it.next());//又取一次,所以报错。
         }
	}
}
//Exception in thread "main" java.util.NoSuchElementException