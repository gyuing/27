package pack;

import org.springframework.stereotype.Component;
@Component	//포함대상
public class DataInfo {
	private String name = "홍길동";
	private String part = "전산분";
	public String job = "프로그래머";
	
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
}
