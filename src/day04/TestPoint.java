package day04;

public class TestPoint {
	 public static void main(String[] args) {
		Point<Double,String>  p = new Point<Double,String>(1.2,"2.3");
		
		Point<Integer, Integer>  p1 = new Point<Integer, Integer>(1,2); 
	  
		/**
		 * ��ʹ��ʱ��ָ�����ͣ����͵�Ĭ�����;���object
		 */
		Point p2  = new Point(1, 2);
		
	    p.setX(1.2);
	    
	    p1.setX(1);
	 }
}
