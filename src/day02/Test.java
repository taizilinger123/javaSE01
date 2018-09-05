package day02;

import java.util.Date;

public class Test {
	 public static void main(String[] args) {
		 println("");
		 println(new  Date());
		 int i = 1;
		 Integer  ii = new Integer(1);
		 println(ii);//句柄
	}
	 
	public  static void  println(Object obj) {
		String  str = obj.toString();
		//输出到控制台
	}
}

