package day01;
/**
 * instanceof 是Java的运算符
 * instanceof(实例) of(的)  翻译：的实例
 *
 */
public class Demo03 {
	public static void main(String[] args) {
      Object o1 = new Card(Card.DIAMOND, Card.THREE);
      Object o2 = "方块3";
      // instanceof 用于检测o1引用的对象是否是Card类型实例
      //               o1 是否是  Card的实例
      boolean isCard = o1 instanceof Card;
      System.out.println(isCard);//true
      isCard = o2  instanceof  Card; 
      System.out.println(isCard);
  
      if(o1 instanceof Card) {
    	  Card card = (Card)o1;
    	  System.out.println(card.getRank());
    	  //System.out.println(o1.getRank());
      }
      Card card = (Card)o2;//类型转换异常 String不能转换Card     
	}
}
