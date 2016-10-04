package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Login {
	@Around("execution(public void dataList())") // 포인트컷 대상
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("AOP 시작 : 핵심 메소드 수행전에 id 검사");

		System.out.println("input id:");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("input pw:");
		String pw = scanner.nextLine();
		scanner.close();
		if (!id.equals("kor") || !pw.equals("111")) {
			System.out.println("id 또는 pw 불일취. 작업을 줭료홥뉘돠");
			return null;
		}

		Object object = joinPoint.proceed();

		System.out.println("AOP 종료");
		return object;
	}
}
