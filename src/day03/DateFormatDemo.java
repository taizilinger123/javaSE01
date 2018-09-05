package day03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * DateFormat��SimpleDateFormat�ĸ���
 * @author sige
 *
 */
public class DateFormatDemo {
  public static void main(String[] args) {
	Date date = new Date();
	/**
	 * style��Ӧ�ĳ��� LONG SHORT MEDIUM
	 */
	DateFormat format = 
       DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.CHINA);
	System.out.println(format.format(date));
  }
}
