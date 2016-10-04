package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sender")
public class Sender2 implements SenderInter{
	
	@Override
	public void show(){
		System.out.println("쑈!222");
	}
}
