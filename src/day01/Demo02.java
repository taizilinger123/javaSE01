package day01;
/**
 * equals���������ڱȽ϶����Ƿ����
 * ==�Ƚϱ�����ֵ�����ñ�����ֵ�ǵ�ֵַ��
 *    ���ñ���==�Ƚϵ��ǵ�ֵַ
 * ���ۣ�
 * 1)==�������ڱȽ��߼��϶����Ƿ����(һ��)   
 * 2)== ����true��ʾ��ͬһ������
 *
 */
public class Demo02 {
	public static void main(String[] args) {
      Card c1 = new Card(Card.DIAMOND, Card.THREE);
      Card c2 = new Card(Card.DIAMOND, Card.THREE);
      Card c3 = c1;
      System.out.println(c1==c2);//false
      System.out.println(c1==c3);//true
      //��Card������дequals������ʵ�ְ��յ����ͻ�ɫ�Ƚ�
      System.out.println(c1.equals(c2));//true
      System.out.println(c1.equals(c3));//true
      System.out.println(c1.equals("����3"));//false
      System.out.println(c1.equals("00"));//false
	}
}
