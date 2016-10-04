package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		//Spring lib를 사용
		System.out.println();
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mb1");
		inter2.sayHello("김치국");
		inter2 = (MessageInter)context.getBean("mb2");
		inter2.sayHello("공기밥");
	}

}
