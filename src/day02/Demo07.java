package day02;

import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Date����
 *
 */
public class Demo07 {
	public static void main(String[] args) {
      //System.currentTimeMillis();
      Date date = new Date();
      int year = date.getYear() + 1900;
      int month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      date.setTime(0);//��Խ��1970Ԫ��
      year = date.getYear() + 1900;
      month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      date.setTime(-1000*60*60*9);//��Խ��1969������һ��
      year = date.getYear() + 1900;
      month = date.getMonth() + 1;
      System.out.println(year + "," + month);
      
      long now = System.currentTimeMillis();
      date.setTime(now + 1000L*60*60*24);
      SimpleDateFormat fmt = 
       new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String str = fmt.format(date);//���ݵ�ʱ�����
      System.out.println(str);
      System.out.println(fmt.format(0));//Java API û��˵����
      
	}
}
