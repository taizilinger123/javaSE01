package day01;

public class Demo08 {
	public static void main(String[] args) {
      String name = " Tom \t \r \n \u0000";
      name = name.trim();
      System.out.println(name);
      
      //endsWith ��...Ϊ������
      String file = "photo.png";
      boolean isPng = file.endsWith(".png");
      System.out.println(isPng);
      
      //startsWith ��...Ϊ��ʼ��
      //cmd = command ����
      String cmd = "get photo.png";
      if(cmd.startsWith("get ")) {
    	  System.out.println("��������");
      }else if(cmd.startsWith("ls")) {
    	  System.out.println("��Ŀ¼����");
      }
      String s = "123";
      System.out.println(s.length());//3
      
      
	}
}
