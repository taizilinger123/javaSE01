package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �����еķ���
 * ����Լ�������д�ŵ�Ԫ������
 * @author sige
 *
 */
public class ArrayListDemo5 {
      public static void main(String[] args) {
		    List<String>  list = new  ArrayList<String>();
		    /**
		     * ����Լ����add�����Ĳ�������
		     */
		    list.add("1");
		    list.add("2");
		    list.add("3");
		    /**
		     * ����Լ����get�����ķ���ֵ����
		     */
		    String  element = list.get(1);
		    
		    /**
		     * public  class  ArrayList<E>{
		     * 
		     *       public  boolean  add(E  e){
		     *             ....
		     *       }
		     *       
		     *       public  E  get(int  index){
		     *             ....
		     *       }
		     * }
		     */
		    
		    /**
		     * ������Ҳ֧�ַ��ͣ�ֻ����Ҫע�⣬�������ķ���Ӧ����Ҫ
		     * �����ļ��ϵķ��ͱ���һ�£�
		     * 
		     */
		    Iterator<String>  it = list.iterator();
		    while(it.hasNext()) {
		    	  String  elements = it.next();
		    }	    
 	}
}
