package day06;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet����Ԫ��
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
		   set.add(p);//�޸���hashCode�ǿ��Խ�ͬһ������������ε�
		   System.out.println(set.size());//2
		   
	}
}
