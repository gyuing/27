package pack.business;

import java.util.List;

import pack.model.BuserDto;
import pack.model.CountDto;
import pack.model.DaoInter;
import pack.model.SawonDto;

public class ProcessInterImpl implements ProcessInter{
	private DaoInter daoInter;
	
	public ProcessInterImpl(DaoInter daoInter) {
		this.daoInter = daoInter;
	}
	
	@Override
	public void dataShow() {
		List<SawonDto> list = daoInter.selectDataAll();
		
		//출력
		for (SawonDto p:list) {
			System.out.println(p.getSawon_no() + " " +
					p.getSawon_name() + " " +
					p.getBuser_name() + " " +
					p.getSawon_ibsail());
		}
		
		
		List<CountDto> list2 = daoInter.countData();
		//출력
		for (CountDto b:list2) {
			System.out.println(b.getBuser_name() + " " + 
					b.getCount());
		}
		
	}
}
