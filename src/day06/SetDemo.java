package day06;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet保存元素
 * @author sige
 * thinking  in  java
 *
 */
public class SetDemo {
     public static void main(String[] args) {
		   Set<Point>  set = new HashSet<Point>();
		   
		   Point p = new Point(1, 2);
		   set.add(p);
		   System.out.println(set.size());//1
		   
		   p.setX(3);
		   p.setY(6);
		   set.add(p);//修改了hashCode是可以将同一个对象放入两次的
		   System.out.println(set.size());//2
		   
	}
}
