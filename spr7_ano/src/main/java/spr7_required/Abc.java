package spr7_required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Abc {
	private int number;
	
	@Required // : 세터를 강요!!! 안쓰면 에러먹엉
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "number : " + number;
	}
}
