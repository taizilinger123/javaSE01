package day01;
/**
 * instanceof ��Java�������
 * instanceof(ʵ��) of(��)  ���룺��ʵ��
 *
 */
public class Demo03 {
	public static void main(String[] args) {
      Object o1 = new Card(Card.DIAMOND, Card.THREE);
      Object o2 = "����3";
      // instanceof ���ڼ��o1���õĶ����Ƿ���Card����ʵ��
      //               o1 �Ƿ���  Card��ʵ��
      boolean isCard = o1 instanceof Card;
      System.out.println(isCard);//true
      isCard = o2  instanceof  Card; 
      System.out.println(isCard);
  
      if(o1 instanceof Card) {
    	  Card card = (Card)o1;
    	  System.out.println(card.getRank());
    	  //System.out.println(o1.getRank());
      }
      Card card = (Card)o2;//����ת���쳣 String����ת��Card     
	}
}
