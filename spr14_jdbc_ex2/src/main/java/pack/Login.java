package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Aspect
@Service
public class Login {
	@Autowired
	private SawonInter inter;
	
	public void setInter(SawonInter inter) {
		this.inter = inter;
	}
	
	
	@Around("execution(public void dataList())") // 포인트컷 대상
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("AOP 시작 : 핵심 메소드 수행전에 id 검사");

		System.out.println("input 사원번호:");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("input 사원명:");
		String pw = scanner.nextLine();
				
		for(SawonDto s:inter.selectList()){
			if (id.equals(s.getSawon_no()) && pw.equals(s.getSawon_name())) {
				Object object = joinPoint.proceed();
				System.out.println("들어옴 ^^");
				return object;
				/*System.out.println("id 또는 pw 불일취. 작업을 줭료홥뉘돠");
				return null;*/
			}
		}
		
		System.out.println("사원번호 및 사원명이 다르다 이놈아!!");
		return null;
	}
}
