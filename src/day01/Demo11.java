package day01;

import java.util.Arrays;

/**
 * ���ֵı���  ����
 * ����������Խ�char���ݰ��ձ����׼���Ϊbyte��������
 *getBytes()
 *GBK:Ӣ��1��byte ����2��byte
 *UTF-8:Ӣ��1��byte ����3��byte
 */
public class Demo11 {
	public static void main(String[] args) throws Exception{
       String str = "ABC�й�";
       byte[] bytes = str.getBytes("gbk");
       System.out.println(Arrays.toString(bytes));//7��
       bytes = str.getBytes("utf-8");
       System.out.println(Arrays.toString(bytes));//9��
       
       String s = new String(bytes, "utf-8");
       System.out.println(s);
       s = new String(bytes, "bgk");
       System.out.println(s);//����	   
	}
}
