package pack;

import other.MyInfo;
import other.OutFileInter;

public class MessageImple implements MessageInter{
	private String name1, name2;	//멤버필드에 값주기
	private int year;
	private MyInfo myInfo;
	
	private String spec;
	private OutFileInter inter;
	
	public MessageImple(String name1,String name2,int year,MyInfo myInfo) {	// Constructor injection
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	public void setSpec(String spec) {
		this.spec = spec;

	}
	
	public void setInter(OutFileInter inter) {
		this.inter = inter;

	}
	
	@Override
	public void sayHi() {
		//출력 담당
		String msg = name1 + " " + name2 + "\n";
		msg += (2000 + year) + "년";
		msg += "\n" + myInfo.mydata();
		msg += "\n보유기술은 " + spec;  
		
		inter.outFile(msg);
		
		System.out.println(msg);
		
	}
}
