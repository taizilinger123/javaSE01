package day03;

import java.util.Calendar;

/**
 *  使用Calendar计算时间 
 *   需求： 
 *     想得知一个月后的今天是星期几
 *  @author sige
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
      /***
       *    实现步骤：
       *    1:创建Calendar实例，用于描述当前系统时间
       *    2:对这个时间累加1个月，变成1个月后的今天
       *    3:获取这个时间所对应的星期，满足需求
       */
		//1
		Calendar  calendar = Calendar.getInstance();
		//2
		calendar.add(Calendar.MONTH, -1);
		//3
		int  week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期"+(week==1?7:week-1));
		/**
		 * 计算今天距离10.1放假还有几天
		 * 计算离明年你过生日还有多少天
		 * 
		 */
		
		
	}
}
