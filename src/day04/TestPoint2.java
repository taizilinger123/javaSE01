package day04;

import java.util.Set;

/**
 * ≤‚ ‘∑∫–Õ
 * @author sige
 * java√Ê ‘±¶µ‰
 *
 */
public class TestPoint2 {
      public static void main(String[] args) {
		     Point<Integer, Integer>  p = new    Point<Integer, Integer>(1,2);
		     p.setX(1);
		     p.setX(2);
		     set(p);
		     int  x  = p.getX();//ClassCastException
		     int  y  = p.getY();
             System.out.println(x+","+y);		     
	}
      public static void  set(Point p) {
    	  p.setX(3.2);
    	  p.setY(4.2);
      }
}
