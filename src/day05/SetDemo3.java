package day05;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet的添加元素
 * @author sige
 *
 */
public class SetDemo3 {
      public static void main(String[] args) {
		    Set<String>  set = new  HashSet<String>();
		    set.add("三");
		    set.add("四");
		    set.add("五");
		    set.add("一");
		    set.add("二");
		    System.out.println(set);
	}
}
