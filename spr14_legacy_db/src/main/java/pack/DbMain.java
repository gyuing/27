package pack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dbinit.xml");
		BussinessInter inter = (BussinessInter)context.getBean("bussinessImpl");
		inter.dataList();
		
	}

}
