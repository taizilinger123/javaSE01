package day01;
/**
 * ������дtoString�������أ�������ı�����
 *
 */
public class Demo01 {

	public static void main(String[] args) {
      Card ace = new Card(Card.SPADE, Card.ACE);
      String whatIsIt = ace.toString();
      System.out.println(whatIsIt);
      System.out.println(ace);//Ĭ�ϵ���toString()
      Card deuce = new Card(Card.SPADE, Card.DEUCE);
      System.out.println(deuce);      
	}
	
	
}
