package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		System.out.println(myProcess);
	}

}
