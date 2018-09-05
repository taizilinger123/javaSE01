package day03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ������Calendar
 * @author sige
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
	  //����Calendarʵ��
	  Calendar calendar = Calendar.getInstance();
	  //����������������ʵ�ֵ�������
	  //calendar = new GregorianCalendar();
	  
	  //����������Calendarʵ���������ǵ�ǰϵͳʱ��
	  System.out.println(calendar);
	  /**
	   * ��Calendar������ʱ��ת��Ϊһ����Date��ʽ�����Ķ���
	   */
	  Date date = calendar.getTime();
	  System.out.println(date);
	  
	  //����ʱ��Ϊ1985-05-01 
	  calendar.set(Calendar.YEAR, 1985);
	  //�´�0��ʼ  0����1��
	  calendar.set(Calendar.MONTH, 4);
	  //calendar.set(Calendar.MONTH, Calendar.MAY);
	  calendar.set(Calendar.DAY_OF_MONTH, 31);  
	  System.out.println(calendar.getTime());
	  //��ȡCalendar��������ʱ���Ӧ������
	  /**
	   * ������   1��������
	   *    2������һ
	   *      ��������
	   */
	  int week = calendar.get(Calendar.DAY_OF_WEEK);
	  System.out.println(week);
	  //��ȡ5��31����1985���еĵڼ���
	  int day = calendar.get(Calendar.DAY_OF_YEAR);
	  System.out.println(day);
	  /**
	   * ��ȡ����ʱ�䵥λ��������ֵ
	   * ��������ӻ�ȡ�ľ�����һ����������
	   * ������Ϊͳ����һ���ܹ��ж�����ʹ��
	   */
	  int sum = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	  System.out.println(sum);
	  
	  
	}
}
