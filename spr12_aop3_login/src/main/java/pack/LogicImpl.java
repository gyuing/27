package pack;

import org.springframework.stereotype.Service;

@Service
public class LogicImpl implements LogicInter{
	public LogicImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void startProcess() {
		System.out.println("검증이 됐으면 핵심로쥑 수횅");
		
	}
}
