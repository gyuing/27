package pack.gogek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bankinit.xml");
		
		Gogek daniel = (Gogek)context.getBean("gogek");
		daniel.selBank("Shinhan");
		daniel.playInputMoney(500);
		daniel.playOutputMoney(200);
		System.out.print("daniel - ");
		daniel.showMoney();
		
		System.out.println();
		
		Gogek john = (Gogek)context.getBean("gogek");
		john.selBank("Shinhan");
		john.playInputMoney(500);
		john.playOutputMoney(200);
		System.out.print("john - ");
		john.showMoney();
		
		//다니엘과 존은 주소가 같다. 때문에 같은놈이다. 오 마이 갓뜨!!!!
		//출력 - 1300 , 1600
		// 스코푸(프로토톼윕)으로 바꾸면 1300, 1300
		
		System.out.println(daniel.toString() + " " + john);
		
		System.out.println();
		Gogek oscar = (Gogek)context.getBean("gogek");
		oscar.selBank("hana");
		oscar.playInputMoney(500);
		oscar.playOutputMoney(100);
		System.out.print("oscar - ");
		oscar.showMoney();
		
	}

}
