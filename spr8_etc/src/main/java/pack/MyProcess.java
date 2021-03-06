package pack;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("my")
public class MyProcess {
	private String part;
	@Value("#{dataInfo.name} ")	//spEL -- 동적으로 표현식을 해석 : getter를 읽음
	private String name;
	
	//public MyProcess(String part) {
	//public MyProcess(@Value("판매부")String part) {
	@Autowired
	public MyProcess(@Value("#{dataInfo.part}")String part){	//getpart를 불러오는거
		System.out.println("나는 생성자");
		this.part = part;
	}
	
	
	@Value("#{dataInfo.job}")
	private String job;	//public 멤버
	
	@Value("30")	//기본이 String type
	private int age;
	
	@Value("1,2,3,4")	//배열색 초기치 부여
	private int arr[];
	
	@PostConstruct	//jdk가 지원 초기화 작업을 담당
	public void hi(){
		System.out.println("생성자 수행 후 처리됨");
	}
	
	
	@PreDestroy	//jdk가 지원 * 마무리작업
	public void bye(){
		System.out.println("마무리 :눈에는 안보여");
	}
	
	
	public void showResult(){
		System.out.println("part : " + part);
		System.out.println("name : " + name);
		System.out.println("job : " + job);
		System.out.println("age : " + age);
		System.out.println("age : " + (age + 10));
		System.out.println("arr[0] : " + arr[0]);
	}
}
