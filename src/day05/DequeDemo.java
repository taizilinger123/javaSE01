package day05;

import java.util.Deque;
import java.util.LinkedList;


/**
 * ջ�ṹ
 * ��ȡ��ѭ�Ƚ����ԭ��
 * ջ�����õ���ʷ׷����
 * @author sige
 *
 */
public class DequeDemo {
     public static void main(String[] args) {
		  Deque<String>  stack = new LinkedList<String>();
		  stack.push("A");//��ջ�С�ѹ�롱Ԫ��
		  stack.push("B");
		  stack.push("C");
		  stack.push("D");
		  System.out.println(stack);//[D,C,B,A]
		  
		  //��ȡջ��Ԫ�أ�������ջ��ɾ��
		  System.out.println(stack.peek());
		  
		  String  str = null;
		  /**
		   * ջ��ʹ���У�Ҫ��ʹ��peek�ж�ջ���Ƿ���Ԫ�أ��ڵ���
		   * pop��������ȡ������������쳣
		   */
		  while(stack.peek()  != null) {
                  str  = stack.pop();
                  System.out.println(str);
		  }
		  
	}
}
