package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init_aop.xml");
		LogicInter inter = (LogicInter)context.getBean("logicImpl");
		inter.startProcess();
	}

}
