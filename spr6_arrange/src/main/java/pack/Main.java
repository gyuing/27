package pack;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("arrange.xml");
		//이녀석은 2.대 버전에서 쓰이던녀숵!!!!
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/arrange.xml");
		//클래스 패스 루트에 있을때는 상관없지만, 아닐때는 정확한 루트를 적어줘라!!!!!!!
		
		//GenericXmlApplicationContext context = new GenericXmlApplicationContext("arrange.xml");
		//이녀석은 3.대부터 사용. 추천함...!
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		 
		MessageImple Imple = (MessageImple)context.getBean("messageImple");
		Imple.sayHi(); 
		
	}

}
