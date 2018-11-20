package day05;
/**
 * �ɱȽϵĵ�
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
	 * ����Pointʵ��֮��ıȽϹ���
	 * ����ֵ�����ľ����ֵ��ֻ����ȡֵ��Χ
	 * ������ֵ��
	 * >0: ��ǰ����ȸ��������
	 * <0: ��ǰ����ȸ�������С
	 * =0����ǰ����͸����������
	 */
     public int compareTo(Point  o) {
    	/**
    	 * ���Ƕ���ĵ�֮��ıȽϹ���Ϊ�㵽ԭ��ľ��볤�Ĵ�
    	 */
    	 //���㵱ǰ��ĳ���
    	 int len = this.x*this.x + this.y*this.y;
    	 //��������Ĳ�����ĳ���  ��
    	 int  argLen = (int)(Math.pow(o.x,  2) + Math.pow(o.y,  2));
    	   	 
    	 return  len - argLen;
    }
     /**
      * ����compareTo�����ķ���ֵӦ����equals�����ķ���ֵ����һ���ԣ�
      * ���������������equals��������trueʱcompareTo����Ӧ�÷���0
      */
}
