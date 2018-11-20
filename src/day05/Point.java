package day05;
/**
 * 可比较的点
 * @author sige
 *
 */
public class Point  implements Comparable<Point>{
	private  int x;
	private  int y;
	
	public  Point(int x, int y) {
		this.x  = x;
		this.y = y;
	}
	
	@Override
	public   String   toString() {
		return  x + "," + y ;
	}
	/**
	 * 定义Point实例之间的比较规则
	 * 返回值不关心具体的值，只关心取值范围
	 * 若返回值：
	 * >0: 当前对象比给定对象大
	 * <0: 当前对象比给定对象小
	 * =0：当前对象和给定对象相等
	 */
     public int compareTo(Point  o) {
    	/**
    	 * 我们定义的点之间的比较规则为点到原点的距离长的大
    	 */
    	 //计算当前点的长度
    	 int len = this.x*this.x + this.y*this.y;
    	 //计算给定的参数点的长度  幂
    	 int  argLen = (int)(Math.pow(o.x,  2) + Math.pow(o.y,  2));
    	   	 
    	 return  len - argLen;
    }
     /**
      * 这里compareTo方法的返回值应该与equals方法的返回值具有一致性，
      * 即：当两个对象的equals方法返回true时compareTo方法应该返回0
      */
}
