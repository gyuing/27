package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service("senderProcess")
public class SenderProcess {
	//@Autowired	// type을 통한 맵핑 : 현재 등록된 값 중에서 Sender Class type 객체를 찾아 매핑
	@Autowired(required = true)		//true가 기본 값, false일땐 있으면하고 없으면말고
	@Qualifier("sender2")		//동일한 객체에 대한 두 개 이상의 객체명을 구분하고자 할 경우 
	//private Sender sender;
	private SenderInter senderInter;
	
//	@Autowired
	//public void setSender(Sender sender) {
//	public void der(Sender sender) {
//		this.sender = sender;
//	}
	
	public SenderInter getSender() {
		return senderInter;
	}
	
	public void dispData(){
		senderInter.show();
	}
}
