package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("sender")
@Scope("singleton")	//@scope(prototype)
public class Sender implements SenderInter{
	
	@Override
	public void show(){
		System.out.println("쑈!");
	}
}
