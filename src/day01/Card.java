package day01;

import javax.print.attribute.standard.MediaSize.Other;

/**
 *  �������е��˿���
 */
public class Card {
	/** ��ɫ */
	private int suit;
	/** ���� */
	private int rank;
    /** Ctrl+Alt+�¼�ͷ ���Ƶ�ǰ�е���һ��*/
	public static final int THREE = 0;
	public static final int FOUR = 1;
	public static final int FIVE = 2;
	public static final int SIX = 3;
	public static final int SEVEN = 4;
	public static final int EIGHT = 5;
	public static final int NINE = 6;
	public static final int TEN = 7;
	public static final int JACK = 8;
	public static final int QUEEN = 9;
	public static final int KING = 10;
	public static final int ACE = 11;
	public static final int DEUCE = 12;
	public static final int BLACK = 13;
	public static final int COLOR = 14;
    
	/** ���� */
	public static final int DIAMOND = 0;
	/** ÷�� */
	public static final int CLUB = 1;
	/** ���� */
	public static final int HEART = 2;
	/** ���� */
	public static final int SPADE = 3;
	/** �� */
	public static final int JOKER = 4;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
    private static String[] suitName = 
    	{"����","÷��","����","����",""};
        // 0    1    2    3   4
    private static String[] rankName = 
    	{"3","4","5","6","7","8","9","10","J","Q","K"
        ,"A","2","С��","����"};
	@Override//java5�ṩע�ͣ��������ڼ���Ƿ��Ƿ�����д
	public String toString() {
		//����ǰ�Ļ�ɫ�͵���ת��Ϊ�˿��Ƶ��ı�������
    	//suit=3  rank=11 �㷨ת�� "����A"  	
		return suitName[suit] + rankName[rank];
	}
	/** �Ƚϵ�ǰ����(this)������һ�������Ƿ���� */
	@Override
	public boolean equals(Object obj) {
	  //c1.equals("����3")
	  //this=c1  obj="����3"	
      if(obj==null) {
    	  return false;
      }
      if(this==obj) {//ͬһ������
    	  return true;
      }
      if(obj instanceof Card) {
    	  Card other = (Card)obj;//ǿ������ת��
    	  return this.rank==other.rank && suit==other.suit;
      }
	  return false;	
	}
	
	/**
	 *  ���˷�������дʱ��ͨ���б�Ҫ��д hashCode ������
	 *   ��ά�� hashCode �����ĳ���Э����
	 *  ��Э��������ȶ�����������ȵĹ�ϣ�롣 
	 * c1(rank=12,suit=1) hashCode() = 112
	 * c2(rank=12,suit=1) hashCode() = 112
	 * c3(rank=11,suit=1) hashCode() = 111
	 */
	public  int hashCode() {
		return suit * 100 + rank;
	}
	
	
}
