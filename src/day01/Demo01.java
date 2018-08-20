package day01;
/**
 * 建议重写toString方法返回，对象的文本描述
 *
 */
public class Demo01 {

	public static void main(String[] args) {
      Card ace = new Card(Card.SPADE, Card.ACE);
      String whatIsIt = ace.toString();
      System.out.println(whatIsIt);
      System.out.println(ace);//默认调用toString()
      Card deuce = new Card(Card.SPADE, Card.DEUCE);
      System.out.println(deuce);      
	}
	
	
}
