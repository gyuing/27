package pack;

import org.springframework.stereotype.Service;

@Service
public class BussinessImpl implements BussinessInter{
	private GogekInter inter;
	
	public void setInter(GogekInter inter) {
		this.inter = inter;
	}
	
	@Override
	public void dataList() {
		int count = 0;
		for(GogekDto s:inter.selectList()){
			if(count==0){
			System.out.println("고객번호/고객명/고객전화");
			count++;
			}
			System.out.print(s.getGogek_no() + "/");
			System.out.print(s.getGogek_name() + "/");
			System.out.println(s.getGogek_tel());
			
		}
		
	}
	
}
