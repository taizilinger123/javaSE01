package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap���Ԫ��ԭ�����
 * @author sige
 *
 */
public class HashMapKeyDemo {
      public static void main(String[] args) {
		Map<Point , String> map = new HashMap<Point,String>();
		
		Point  p= new Point(1, 2);
		map.put(p,   "��һ�δ�ŵĵ�");
		System.out.println("map�е�Ԫ��:"+map.size());
		System.out.println(map.get(p));
		
//		p.setX(3);
//		p.setY(4);
		String  old = map.put(p,   "�ڶ��δ�ŵĵ�");
		System.out.println("map�е�Ԫ��:"+map.size());
		System.out.println("old:"+old);
		System.out.println(map.get(p));
		
		//ȡ�ڶ��δ����value
		System.out.println(map.get(p));
		p.setX(1);
		p.setY(2);
		System.out.println(map.get(p));
		
	}
}
