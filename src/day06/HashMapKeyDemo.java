package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap存放元素原理测试
 * @author sige
 *
 */
public class HashMapKeyDemo {
      public static void main(String[] args) {
		Map<Point , String> map = new HashMap<Point,String>();
		
		Point  p= new Point(1, 2);
		map.put(p,   "第一次存放的点");
		System.out.println("map中的元素:"+map.size());
		System.out.println(map.get(p));
		
//		p.setX(3);
//		p.setY(4);
		String  old = map.put(p,   "第二次存放的点");
		System.out.println("map中的元素:"+map.size());
		System.out.println("old:"+old);
		System.out.println(map.get(p));
		
		//取第二次存入的value
		System.out.println(map.get(p));
		p.setX(1);
		p.setY(2);
		System.out.println(map.get(p));
		
	}
}
