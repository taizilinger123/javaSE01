package day03;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日历类Calendar
 * @author sige
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
	  //创建Calendar实例
	  Calendar calendar = Calendar.getInstance();
	  //创建格利高里立法实现的日历类
	  //calendar = new GregorianCalendar();
	  
	  //创建出来的Calendar实例描述的是当前系统时间
	  System.out.println(calendar);
	  /**
	   * 将Calendar描述的时间转换为一个用Date方式描述的对象
	   */
	  Date date = calendar.getTime();
	  System.out.println(date);
	  
	  //设置时间为1985-05-01 
	  calendar.set(Calendar.YEAR, 1985);
	  //月从0开始  0代表1月
	  calendar.set(Calendar.MONTH, 4);
	  //calendar.set(Calendar.MONTH, Calendar.MAY);
	  calendar.set(Calendar.DAY_OF_MONTH, 31);  
	  System.out.println(calendar.getTime());
	  //获取Calendar所描述的时间对应的星期
	  /**
	   * 星期中   1：星期天
	   *    2：星期一
	   *      依次类推
	   */
	  int week = calendar.get(Calendar.DAY_OF_WEEK);
	  System.out.println(week);
	  //获取5月31号是1985年中的第几天
	  int day = calendar.get(Calendar.DAY_OF_YEAR);
	  System.out.println(day);
	  /**
	   * 获取给定时间单位允许的最大值
	   * 下面的例子获取的就是这一年中最大的天
	   * 可以作为统计这一年总共有多少天使用
	   */
	  int sum = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	  System.out.println(sum);
	  
	  
	}
}
