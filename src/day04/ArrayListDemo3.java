package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合中的批量操作
 * @author sige
 *
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
          List list1 = new ArrayList();
          List list2 = new ArrayList();
          List list3 = new ArrayList();
          //向第一个集合中添加元素
          list1.add("1");
          list1.add("2");
          list1.add("3");
          
          //向第二个集合中添加元素
          list2.add("4");
          list2.add("5");
          
          list3.add("1");
          list3.add("2");
          
          //将集合2中的元素存入集合1
          list1.addAll(list2);//[1,2,3,4,5]
          System.out.println(list1);
          
          //删除集合1中与集合3中相同的元素
          list1.removeAll(list3);//[3,4,5]
          System.out.println(list1);
          
          //只保留集合1中与集合2中相同的元素(取交集)
          list1.retainAll(list2);//[4,5]
          System.out.println(list1);
          
          //以上判断元素是否相同，使用的是equals方法
	}
}
