package day03;

import java.util.Calendar;

/**
 *  ʹ��Calendar����ʱ�� 
 *   ���� 
 *     ���֪һ���º�Ľ��������ڼ�
 *  @author sige
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
      /***
       *    ʵ�ֲ��裺
       *    1:����Calendarʵ��������������ǰϵͳʱ��
       *    2:�����ʱ���ۼ�1���£����1���º�Ľ���
       *    3:��ȡ���ʱ������Ӧ�����ڣ���������
       */
		//1
		Calendar  calendar = Calendar.getInstance();
		//2
		calendar.add(Calendar.MONTH, -1);
		//3
		int  week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("����"+(week==1?7:week-1));
		/**
		 * ����������10.1�żٻ��м���
		 * ����������������ջ��ж�����
		 * 
		 */
		
		
	}
}
