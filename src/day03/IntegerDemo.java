package day03;
/**
 * int���͵İ�װ��Integer 
 * @author sige
 *
 */
public class IntegerDemo {
      public static void main(String[] args) {
           Integer  i = new  Integer(1);
           Integer i2 = new  Integer(1);
           System.out.println(i == i2);
           
           //����ѡ��ʹ��valueof����ʽ������װ��
           Integer i3 = Integer.valueOf(1);
           Integer i4 = Integer.valueOf(1);
           System.out.println(i3 == i4);
           
           Integer i5 = Integer.valueOf(50);
           int i6 =  i5.intValue();//����װ��ת��Ϊ������������
           
           Double d = new  Double(1.2);
           double dd = d.doubleValue();
           
           /**
            *  java  1.4����Ĵ��벻�У����﷨����
            *  java  1.5����Ĵ�����ԡ���Ϊ1.5�Ժ���˸�����
            *  �Զ����䣺�Զ�����װ�����ת��Ϊ��������
            *  �Զ�װ�䣺�Զ���������������ת��Ϊ��װ�����
            */
           /**��JSD1308_SE1��Ŀ���Ҽ�->Properties->Java Compiler->Use compliance  from 
            * execution environment 'JavaSE-10'ǰ��Ĺ�ȥ���Ϳ����л��汾��*/
           int  a  =  i5;          //�Զ�����     ����-->��������
           //int a =  i5.intValue();
           Integer  aa = 1;  //�Զ�װ��     ��������-->����
           //Integer  aa = Integer.valueOf(1);     
	}
}
