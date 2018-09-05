package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于转换日期与字符串的SimpleDateFormat
 * @author sige
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
      String timeStr = "2013-09-17";
      //创建SimpleDateFormat
      SimpleDateFormat format 
           = new SimpleDateFormat("yyyy-MM-dd");
      //java.util.Date
      //这里会抛出异常
      Date date = format.parse(timeStr);
      System.out.println(date);
      
	}
}
