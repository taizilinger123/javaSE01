package day06;
/**
 * ����ģʽ
 * ��ǰ���ʵ����ȫ��Ψһ
 * @author sige
 *
 */
public class SingletonDemo {
        private  int  width;
        private  int  height;
        /**
         * ����һ��˽�еĵ�ǰ���͵�����
         */
        private  static    SingletonDemo  obj = new  SingletonDemo();
        /**
         * ˽�л����췽��
         * Ŀ����Ϊ����ֹ���ͨ��new�ؼ��ִ���ʵ��
         */
        private SingletonDemo() {        	
        }
        
        /**
         * ����һ�����õľ�̬�ķ��������ڻ�ȡ��ǰ���͵�ʵ��
         * @return
         */
        public  static  SingletonDemo getInstance() {
        	  return  obj;
        }
        
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
      
      
}
