package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ת���������ַ�����SimpleDateFormat
 * @author sige
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
      String timeStr = "2013-09-17";
      //����SimpleDateFormat
      SimpleDateFormat format 
           = new SimpleDateFormat("yyyy-MM-dd");
      //java.util.Date
      //������׳��쳣
      Date date = format.parse(timeStr);
      System.out.println(date);
      
	}
}
