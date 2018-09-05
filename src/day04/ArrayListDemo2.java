package day04;

import java.util.ArrayList;
import java.util.List;
/**
 * 测试使用List添加自定义类型的元素
 * javadoc
 * @author sige
 */
public class ArrayListDemo2 {
      public static void main(String[] args) {
		    //创建集合
    	    List   list  =  new  ArrayList();
    	    //添加三个Point实例
    	    list.add(new Point(1, 2));
    	    list.add(new Point(3, 4));
    	    list.add(new Point(5, 6));
    	    
    	    System.out.println(list);//[x=1, y=2, x=3, y=4, x=5, y=6]
    	    
    	    Point  p  = new Point(1, 2);
    	    /**
    	     * 包含的比较是基于equals的.
    	     */
    	    if(list.contains(p)) {
    	    	System.out.println("包含");
    	    	/**
    	    	 * remove方法删除集合中第一个与给定对象p相同的元素
    	    	 */
    	    	list.remove(p);
    	    }else {
    	    	System.out.println("不包含");
    	    }
    	    System.out.println(list);
	}
}
