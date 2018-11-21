package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 使用自定义的比较规则排序集合
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
		    * 使用字符串定义的比较规则进行自然排序
		    */
		   Collections.sort(list);
		   System.out.println(list);
		   /**
		    * 不希望使用字符串的比较规则排序，而是按照字符的多少进行
		    * 比较后再排序
		    */
		   Collections.sort(list,  new MyComparator());
		   System.out.println(list);
		   
		   /**
		    * 通常我们使用匿名内部类的形式创建临时的比较规则
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
 * 自定义比较器
 * 长按ctrl+s保存,不按文件名前面有一个星，保存以后*xxxx.java的星就没有了
 * ctrl+alt+下箭头：直接复制上一行代码
 * alt+/构造方法
 * ctrl+/注释
 * ctrl+z退回上一步操作
 * 当ctrl+z不能返回时候，代码空白处右键Replace With---->Local History会保存每一次的ctrl+s---->
 * 返回任何一个之前的版本
 * 在项目文件夹上右键---->Team--->Commit---->Repository---->Push  to  Upstream就上传到自己的github上了。
 */
class  MyComparator  implements  Comparator<String>{
	/**
	 * 比较规则
	 * 当返回值>0  :  o1>o2
	 * 当返回值<0  :  o1<o2
	 * 当返回值=0  :  o1=o2
	 */
	public int compare(String  o1, String  o2) {
		
		return  o1.length() - o2.length();
	}
}
