package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {	//meta xml file 대신 class로 환경설정
	@Bean
	public MyProcess my(){
		MyProcess myProcess = new MyProcess(part)
	}
}
