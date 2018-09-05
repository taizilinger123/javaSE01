package day03;
/**
 * int类型的包装类Integer 
 * @author sige
 *
 */
public class IntegerDemo {
      public static void main(String[] args) {
           Integer  i = new  Integer(1);
           Integer i2 = new  Integer(1);
           System.out.println(i == i2);
           
           //建议选择使用valueof的形式创建包装类
           Integer i3 = Integer.valueOf(1);
           Integer i4 = Integer.valueOf(1);
           System.out.println(i3 == i4);
           
           Integer i5 = Integer.valueOf(50);
           int i6 =  i5.intValue();//将包装类转换为基本类型数据
           
           Double d = new  Double(1.2);
           double dd = d.doubleValue();
           
           /**
            *  java  1.4下面的代码不行，有语法错误
            *  java  1.5下面的代码可以。因为1.5以后多了个特性
            *  自动拆箱：自动将包装类对象转换为基本类型
            *  自动装箱：自动将基本类型数据转换为包装类对象
            */
           /**在JSD1308_SE1项目上右键->Properties->Java Compiler->Use compliance  from 
            * execution environment 'JavaSE-10'前面的勾去掉就可以切换版本了*/
           int  a  =  i5;          //自动拆箱     对象-->基本类型
           //int a =  i5.intValue();
           Integer  aa = 1;  //自动装箱     基本类型-->对象
           //Integer  aa = Integer.valueOf(1);     
	}
}
