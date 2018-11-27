package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����Map�е�����key-value
 * Map�б����ֵ����ʹ��Entry��ʵ���������
 * Entry��Map���ڲ��࣬ÿһ��ʵ�����ڱ���һ������Map�е�
 * ��ֵ��
 * @author sige
 *
 */
public class IteratorMapEntry {
      public static void main(String[] args) {
		    Map<String, Integer>  map = new  HashMap<String, Integer>();		    
		    //���5��Ԫ��
		    map.put("k1", 1);
		    map.put("k2", 2);
		    map.put("k3", 3);
		    map.put("k4", 4);
		    map.put("k5", 5);
		    // java.util.Map.Entry
		    Set<  Entry<String, Integer> > entries =  map.entrySet();
		    //��ȡ���ڱ���Set���ϵĵ�����
		    Iterator<Entry<String, Integer>> it = entries.iterator();
		    while(it.hasNext()) {
		    	//����ÿһ���ֵ��
		    	Entry<String, Integer>  entry = it.next();
		    	String key  = entry.getKey();
		    	int  value  = entry.getValue();
		    	System.out.println(key+"="+value);
		    }
		    
		    
		    
	}
}
