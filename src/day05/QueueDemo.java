package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����
 * �洢һ�����ݣ���ȡ���ݱ����Ƚ��ȳ�ԭ��
 * LinkedListʵ���˶��нӿڡ�
 * @author sige
 *
 */
public class QueueDemo {
     public static void main(String[] args) {
    	 //java.util.Queue
		   Queue<String> queue = new LinkedList<String>();
		   queue.offer("A");
		   queue.offer("B");
		   queue.offer("C");
		   System.out.println(queue);
		   
		   //�鿴����Ԫ��
		   System.out.println(queue.peek());
		   
		   /**
		    * ���еı�����һ���Ե�
		    * ֻ��ȡ������Ԫ�أ����ܻ�ȡ�����еڶ���Ԫ��
		    */
		   String  str = null;
		   /**
		    * ��ȡ������Ԫ�ز���ֵ��str
		    * ֮�����ж�str�Ƿ���ڿ�
		    */
		   while((str = queue.poll())  != null) {
			     System.out.println(str);
		   }	   
	}
}
