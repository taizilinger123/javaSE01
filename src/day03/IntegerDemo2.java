package day03;
/**
 * ��װ�����������
 * @author sige
 *
 */
public class IntegerDemo2 {
     public static void main(String[] args) {
    	   /**
    	    * ��װ���ṩ����������
    	    * ��Ӧ�����������ݵ����ȡֵ����Сȡֵ
    	    */
		   System.out.println(Integer.MAX_VALUE);
    	   System.out.println(Integer.MIN_VALUE);
    	   
    	   /**
    	    * �����������ַ���֮���ת��
    	    */
    	   int  a = 1;
    	   String  str  =  a+"123";//���������
    	   //String  str  =  "123.456";
    	   //String  str =  Integer.valueOf(a).toString() + "" ;
    	   //���ַ���ת��Ϊ��������
    	   int  b  =  Integer.parseInt(str) ;
    	  //double  b =  Double.parseDouble(str);
    	   //public  native  void  print(String  xxxx);
    	   System.out.println(b+a);
           /**
            * ������ת��Ϊ2������ʽ���ַ���
            */
             int  num = 100;
             String  bStr  =  Integer.toBinaryString(num);
             System.out.println("100�Ķ����ƣ�"+bStr);//1100100
             
             String  hStr  =  Integer.toHexString(num);
             System.out.println("100��ʮ�����ƣ�"+hStr);//64
             
	}  
}
