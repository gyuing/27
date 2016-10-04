package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app_init.xml");
		
		MymyImpl mymyImpl = (MymyImpl)context.getBean("mymyImpl");
		mymyImpl.MyProcess();

	}

}

