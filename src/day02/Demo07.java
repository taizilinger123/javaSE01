package day02;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Date测试
 *
 */
public class Demo07 {
	public static void main(String[] args) {
      //System.currentTimeMillis();
      Date date = new Date();
      int year = date.getYear() + 1900;
      int month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      date.setTime(0);//穿越到1970元旦
      year = date.getYear() + 1900;
      month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      date.setTime(-1000*60*60*9);//穿越到1969年的最后一天
      year = date.getYear() + 1900;
      month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      long now = System.currentTimeMillis();
      date.setTime(now + 1000L*60*60*24);
      SimpleDateFormat fmt = 
       new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String str = fmt.format(date);//最便捷的时间输出
      System.out.println(str);
      System.out.println(fmt.format(0));//Java API 没有说明！
      
	}
}
