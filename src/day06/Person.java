package day06;
/**
 * ģ��ģʽ
 * @author sige
 *
 */
public  abstract  class Person {
     
	//�����Լ������к�
	public   void  sayHello() {
		//���к�
		System.out.println("��Һã�");
		//�����Լ�������
		System.out.println("�ҽ�"+ getName());
		//�����Լ������
		System.out.println(getInfo());
		//˵�ݰ�
		System.out.println(sayGoodBye());
	}
	/**
	 * ��ȡ�Լ�������
	 */
	public   abstract  String  getName();
	/**
	 * ��ȡ�Լ�����Ϣ
	 */
	public  abstract  String  getInfo();
	/**
	 * ˵�ټ�
	 * @return
	 */
	public  abstract  String  sayGoodBye();
}
