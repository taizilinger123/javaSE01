package day01;
/**
 * equals方法，用于比较对象是否相等
 * ==比较变量的值，引用变量的值是地址值，
 *    引用变量==比较的是地址值
 * 结论：
 * 1)==不能用于比较逻辑上对象是否相等(一样)   
 * 2)== 返回true表示是同一个对象
 *
 */
public class Demo02 {
	public static void main(String[] args) {
      Card c1 = new Card(Card.DIAMOND, Card.THREE);
      Card c2 = new Card(Card.DIAMOND, Card.THREE);
      Card c3 = c1;
      System.out.println(c1==c2);//false
      System.out.println(c1==c3);//true
      //在Card类中重写equals方法，实现按照点数和花色比较
      System.out.println(c1.equals(c2));//true
      System.out.println(c1.equals(c3));//true
      System.out.println(c1.equals("方块3"));//false
      System.out.println(c1.equals("00"));//false
	}
}
