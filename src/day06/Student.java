package day06;
/**
 * ʵ��ģ��ģʽ
 * @author sige
 *
 */
public class Student extends  Person{

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public String getInfo() {
		return "��ס�ڱ�������ϲ������Ϸ������";
	}

	@Override
	public String sayGoodBye() {
		return "�ؼ�";
	}
       
}
