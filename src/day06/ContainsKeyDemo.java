package day06;

import java.util.HashMap;
import java.util.Map;

/**
 * containsKey()�鿴map���Ƿ��и�����key
 * @author sige
 *
 */
public class ContainsKeyDemo {
      public static void main(String[] args) {
		    String  str = "123.456.765.987.432.876.123.987.445.123";
		    /**
		     * ͳ�Ƶ�ǰ�ַ����У�ÿ�����ֳ��ֵĴ���
		     * ˼·��
		     *     1���Ƚ�ÿ�����ֲ����
		     *     2��˳��ÿ�����ַ���map
		     *     3:����ʱ�ȿ���������Ƿ���Ϊkey��map�д�����
		     *         �����ڣ���������Ϊkey,valueΪ1(��һ�γ���)
		     *            ����:��������Ϊkeyȡ��value,���ۼ�1���ٴ��ȥ
             */		
		    String[]  nums = str.split("\\.");
		    System.out.println(nums.length);
		    
		    Map<String, Integer> map = new HashMap<String, Integer>();
		    for(String num : nums) {
		    	     //�жϵ�ǰ�����Ƿ���Ϊkey��map�д���
		    	   if(map.containsKey(num)) {
		    		       int  value  = map.get(num);
		    		       value = value + 1;
		    		       map.put(num, value);
//		    		       map.put(num, map.get(num)+1);
		    	   }else {
		    		       map.put(num, 1);
		    	   }
		    }
		    /**
		     * {key.toString()=value.toString(), k=v,k=v}
		     */
		    System.out.println(map);	    
	}
}
