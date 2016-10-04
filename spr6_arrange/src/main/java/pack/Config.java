package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import other.MyInfo;
import other.OutFileInter;
import other.OutFileInterImpl;

@Configuration
public class Config {	//meta xml file 대신 class로 환경설정
	@Bean
	public MessageImple messageImple(){
		MessageImple messageImple = new MessageImple("첫째 이름", "두번째 이름", 19, myInfo());	
		messageImple.setSpec("자바 줜문과");
		messageImple.setInter(outFileInterImpl());
		
		return messageImple;
	}
	

	@Bean
	public MyInfo myInfo(){
		return new MyInfo();
	}
	
	@Bean
	public OutFileInterImpl outFileInterImpl(){
		OutFileInterImpl outFileInterImpl = new OutFileInterImpl();
		outFileInterImpl.setFilePath("c:/work/good.txt");
		return outFileInterImpl;
	}
}
