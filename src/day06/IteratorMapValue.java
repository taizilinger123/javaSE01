package day06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ����Map�����е�value
 * ���ֱ�����ʽ���Ǻܳ���
 * @author sige
 *
 */
public class IteratorMapValue {
      public static void main(String[] args) {
		    Map<String, Integer>  map = new  HashMap<String, Integer>();	    
		    //���5��Ԫ��
		    map.put("k1", 1);
		    map.put("k2", 2);
		    map.put("k3", 3);
		    map.put("k4", 4);
		    map.put("k5", 5);
		    /**
		     * ���ص�����value���Ǵ����Set����
		     */
		    Collection<Integer> values = map.values();
		    for(Integer  value : values) {
                     System.out.println("value:"+value);		    	
		    }
	}
}
