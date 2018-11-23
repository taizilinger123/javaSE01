package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合是无序的，所以没有get方法
 * 只能通过迭代器的方式获取元素
 * @author sige
 */
public class IterateSet {
      public static void main(String[] args) {
		    Set<String> set = new  HashSet<String>();
		    set.add("one");
		    set.add("two");
		    set.add("three");
		    // java.util.Iterator
		    Iterator<String>  it  = set.iterator();
 		    while(it.hasNext()) {
 		    	  String  str = it.next();
 		    	  System.out.println(str);
 		    }
 		    
 		    //使用新循环遍历set集合
 		    for(String  str  :  set) {
 		    	  System.out.println(str);
 		    }		    
	}
}
