package day02;

import java.util.Arrays;
/**
 * String API������
 */
public class Demo04 {
	public static void main(String[] args) {
	  String name = " Tom   \n and Jerry  ";
	  String[] words = name.trim().toLowerCase().split("\\s+");
	  System.out.println(Arrays.toString(words));
	}
}
