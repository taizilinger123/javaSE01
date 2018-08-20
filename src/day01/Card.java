package day01;

import javax.print.attribute.standard.MediaSize.Other;

/**
 *  斗地主中的扑克牌
 */
public class Card {
	/** 花色 */
	private int suit;
	/** 点数 */
	private int rank;
    /** Ctrl+Alt+下箭头 复制当前行到下一行*/
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
    
	/** 方块 */
	public static final int DIAMOND = 0;
	/** 梅花 */
	public static final int CLUB = 1;
	/** 红桃 */
	public static final int HEART = 2;
	/** 黑桃 */
	public static final int SPADE = 3;
	/** 王 */
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
    	{"方块","梅花","红桃","黑桃",""};
        // 0    1    2    3   4
    private static String[] rankName = 
    	{"3","4","5","6","7","8","9","10","J","Q","K"
        ,"A","2","小王","大王"};
	@Override//java5提供注释，这里用于检查是否是方法重写
	public String toString() {
		//将当前的花色和点数转换为扑克牌的文本描述。
    	//suit=3  rank=11 算法转换 "黑桃A"  	
		return suitName[suit] + rankName[rank];
	}
	/** 比较当前对象(this)与另外一个对象是否相等 */
	@Override
	public boolean equals(Object obj) {
	  //c1.equals("方块3")
	  //this=c1  obj="方块3"	
      if(obj==null) {
    	  return false;
      }
      if(this==obj) {//同一个对象
    	  return true;
      }
      if(obj instanceof Card) {
    	  Card other = (Card)obj;//强制类型转换
    	  return this.rank==other.rank && suit==other.suit;
      }
	  return false;	
	}
	
	/**
	 *  当此方法被重写时，通常有必要重写 hashCode 方法，
	 *   以维护 hashCode 方法的常规协定，
	 *  该协定声明相等对象必须具有相等的哈希码。 
	 * c1(rank=12,suit=1) hashCode() = 112
	 * c2(rank=12,suit=1) hashCode() = 112
	 * c3(rank=11,suit=1) hashCode() = 111
	 */
	public  int hashCode() {
		return suit * 100 + rank;
	}
	
	
}
