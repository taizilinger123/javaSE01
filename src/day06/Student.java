package day06;
/**
 * 实现模板模式
 * @author sige
 *
 */
public class Student extends  Person{

	@Override
	public String getName() {
		return "范传奇";
	}

	@Override
	public String getInfo() {
		return "我住在北京，我喜欢玩游戏，旅游";
	}

	@Override
	public String sayGoodBye() {
		return "回见";
	}
       
}
