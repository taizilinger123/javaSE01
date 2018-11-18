package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * ȡ�Ӽ�
 * @author sige
 *
 */
public class SubListDemo {
     public static void main(String[] args) {
		List<Integer>  list = new ArrayList<Integer>();
		for(int i = 0;i<10;i++) {
			 list.add(i);
		}
		System.out.println(list);//[0,1,2,3,4,5,6,7,8,9]
		
		//�������Ͳ�����Ϊ����
		List<Integer> subList  = list.subList(3, 8);//��ͷ����β
		System.out.println(subList);//[3,4,5,6,7]
		
		//���Ӽ���Ԫ������10��
		for(int i = 0;i<subList.size();i++) {
			int  sub = subList.get(i);
			sub = sub * 10;
			subList.set(i, sub);	//3���ϳ�1��:subList.set(i, subList.get(i)*10)		
		}
		System.out.println(subList);//[30,40,50,60,70]
		System.out.println(list);
	}
}
