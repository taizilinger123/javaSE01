package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set����������ģ�����û��get����
 * ֻ��ͨ���������ķ�ʽ��ȡԪ��
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
 		    
 		    //ʹ����ѭ������set����
 		    for(String  str  :  set) {
 		    	  System.out.println(str);
 		    }		    
	}
}
