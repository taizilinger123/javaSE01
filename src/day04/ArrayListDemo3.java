package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * �����е���������
 * @author sige
 *
 */
public class ArrayListDemo3 {
	public static void main(String[] args) {
          List list1 = new ArrayList();
          List list2 = new ArrayList();
          List list3 = new ArrayList();
          //���һ�����������Ԫ��
          list1.add("1");
          list1.add("2");
          list1.add("3");
          
          //��ڶ������������Ԫ��
          list2.add("4");
          list2.add("5");
          
          list3.add("1");
          list3.add("2");
          
          //������2�е�Ԫ�ش��뼯��1
          list1.addAll(list2);//[1,2,3,4,5]
          System.out.println(list1);
          
          //ɾ������1���뼯��3����ͬ��Ԫ��
          list1.removeAll(list3);//[3,4,5]
          System.out.println(list1);
          
          //ֻ��������1���뼯��2����ͬ��Ԫ��(ȡ����)
          list1.retainAll(list2);//[4,5]
          System.out.println(list1);
          
          //�����ж�Ԫ���Ƿ���ͬ��ʹ�õ���equals����
	}
}
