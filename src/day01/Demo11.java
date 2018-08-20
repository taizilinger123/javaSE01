package day01;

import java.util.Arrays;

/**
 * 文字的编码  方法
 * 这个方法可以将char数据按照编码标准拆分为byte数据序列
 *getBytes()
 *GBK:英文1个byte 中文2个byte
 *UTF-8:英文1个byte 中文3个byte
 */
public class Demo11 {
	public static void main(String[] args) throws Exception{
       String str = "ABC中国";
       byte[] bytes = str.getBytes("gbk");
       System.out.println(Arrays.toString(bytes));//7个
       bytes = str.getBytes("utf-8");
       System.out.println(Arrays.toString(bytes));//9个
       
       String s = new String(bytes, "utf-8");
       System.out.println(s);
       s = new String(bytes, "bgk");
       System.out.println(s);//乱码	   
	}
}
