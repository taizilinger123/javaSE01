package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * ����key-value����ʽ��ȡԪ��
 * @author sige
 *
 */
public class HashMapDemo {
      public static void main(String[] args) {
		   Map<String, Point> points = new HashMap<String,Point>();
		   
		   //��map�д��Ԫ��
		   points.put("1,2", new Point(1, 2));
		   points.put("3,4", new Point(3, 4));
		   points.put("5,6", new Point(5, 6));
		   
		   //��ȡ[5,6]�����
		   Point  p = points.get("5,6");
		   System.out.println(p.getX()+","+p.getY());
	}
}
