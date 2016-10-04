package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataDaoImpl implements DataDao{
	
	
	@Override
	public String A(String name, int su, int dan) {
		int hap = su * dan;
		return name + "물건의 가격은 " + hap +"원 입니다.";
	}
}
