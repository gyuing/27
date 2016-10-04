package pack;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BussinessImpl implements BussinessInter{
	@Autowired
	private SawonInter inter;
	
	public void setInter(SawonInter inter) {
		this.inter = inter;
	}
	
	@Override
	public void dataList() {
		int count = 0;
		
		System.out.println("부서번호 입력:");
		Scanner scanner = new Scanner(System.in);
		String buserNo = scanner.nextLine();
		scanner.close();
		
		for(SawonDto s:inter.selectList()){
			if(count==0){
			System.out.println("사원번호/사원명/부서명/직급");
			count++;
			}
			//System.out.println(buserNo + "은는이가 부서노" + s.getBuser_num() + "<--이건 부서넘");
			if(s.getBuser_num().equals(buserNo)){
				System.out.print(s.getSawon_no() + "/");
				System.out.print(s.getSawon_name() + "/");
				System.out.print(s.getBuser_name() + "/");
				System.out.println(s.getSawon_jik());
			}
		}
		
	}
	
}
