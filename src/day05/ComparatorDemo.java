package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ʹ���Զ���ıȽϹ������򼯺�
 * @author sige
 *
 */
public class ComparatorDemo {
      public static void main(String[] args) {
		   List<String> list = new ArrayList<String>();
		   list.add("able");
		   list.add("adam");
		   list.add("marry");
		   list.add("BOSS");
		   list.add("killer");
		   list.add("TOM");
		   System.out.println(list);
		   /**
		    * ʹ���ַ�������ıȽϹ��������Ȼ����
		    */
		   Collections.sort(list);
		   System.out.println(list);
		   /**
		    * ��ϣ��ʹ���ַ����ıȽϹ������򣬶��ǰ����ַ��Ķ��ٽ���
		    * �ȽϺ�������
		    */
		   Collections.sort(list,  new MyComparator());
		   System.out.println(list);
		   
		   /**
		    * ͨ������ʹ�������ڲ������ʽ������ʱ�ıȽϹ���
		    */
//		   Comparator<String>  comparator  = new Comparator<String>() {
//			   public int compare(String o1, String  o2) {
//				      return o2.length() - o1.length();
//			 }
//		   };
//		   Collections.sort(list,  comparator);
//		   System.out.println(list);
		   Collections.sort(list,   new Comparator<String>() {
			   public int compare(String o1, String  o2) {
				      return o2.length() - o1.length();
			 }
		   });
		   
		   System.out.println(list);
	}
}
/**
 * �Զ���Ƚ���
 * ����ctrl+s����,�����ļ���ǰ����һ���ǣ������Ժ�*xxxx.java���Ǿ�û����
 * ctrl+alt+�¼�ͷ��ֱ�Ӹ�����һ�д���
 * alt+/���췽��
 * ctrl+/ע��
 * ctrl+z�˻���һ������
 * ��ctrl+z���ܷ���ʱ�򣬴���հ״��Ҽ�Replace With---->Local History�ᱣ��ÿһ�ε�ctrl+s---->
 * �����κ�һ��֮ǰ�İ汾
 * ����Ŀ�ļ������Ҽ�---->Team--->Commit---->Repository---->Push  to  Upstream���ϴ����Լ���github���ˡ�
 */
class  MyComparator  implements  Comparator<String>{
	/**
	 * �ȽϹ���
	 * ������ֵ>0  :  o1>o2
	 * ������ֵ<0  :  o1<o2
	 * ������ֵ=0  :  o1=o2
	 */
	public int compare(String  o1, String  o2) {
		
		return  o1.length() - o2.length();
	}
}
