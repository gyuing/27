package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ReunAdvice {
	@Around("execution(public void startProcess())") // 포인트컷 대상
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작 : 핵심 메소드 수행전에 id 검사");
		
		System.out.println("input id:");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		scanner.close();
		if(!id.equals("aa")){
			System.out.println("id 불일취. 작업을 줭료홥뉘돠");
			return null;
		}
		
		Object object = joinPoint.proceed();
		
		System.out.println("AOP 종료");
		return object;
	}
}
