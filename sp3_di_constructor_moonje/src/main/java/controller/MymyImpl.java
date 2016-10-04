package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import model.DataDao;

public class MymyImpl implements Mymy{
	private DataDao dataDao;
	
	public void setDataDao(DataDao dataDao) {
		this.dataDao = dataDao;
	}
	
	@Override
	public void MyProcess() {
		
		
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			
			System.out.println("상품명을 입력 : ");
			String data = breader.readLine();
			
			System.out.println("수량을 입력 : ");
			int data2 = Integer.parseInt(breader.readLine());
			
			System.out.println("단가를 입력 : ");
			int data3 = Integer.parseInt(breader.readLine());
			
			String result = dataDao.A(data, data2, data3);
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("inputMoney 에러 : " + e);
		}
		
	}
}
