package day02;
/**
 * StringBuilder
 * StringBuilder ��API �����Ƕ����ڲ�char[]���ݽ���
 * ��ɾ�Ĳ鷽��
 */
public class Demo05 {
	public static void main(String[] args) {
      StringBuilder buf = new StringBuilder();
      buf.append("��ʦ�").append("˵")
      .append("��ǰ��").append("������")
      .append("�ǳ�Ư��").delete(0, 2).insert(2, "����");
      String s = buf.toString();
      System.out.println(s);
	}
}
