package advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.*;



public class LoggingAdvice implements MethodInterceptor{	//aspect class(aop에서 관심사항을 가지고있는 클래스)
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable{
		// joinpoint에 의해 삽입되어 동작할 코드 기술
		//관심사항(Aspect) - login, transaction, security...
		
		//target 메소드 얻기
		String methodName = invocation.getMethod().getName();
		System.out.println("호출될 비지니스 로직의 메소드 이름" + methodName);
		
		Object object = invocation.proceed();	//핵심로직 수행
		
		//핵심로직 수행 후
		System.out.println(methodName + "수행 후 마무리 처리");
		return null;
	}


}
