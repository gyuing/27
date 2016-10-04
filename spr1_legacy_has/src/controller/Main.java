package controller;

import model.DataDao;
import model.DataDaoImpl;

public class Main {
	public static void main(String[] args) {
		//db 처리용
		/*DataDaoImpl dataDaoImpl = new DataDaoImpl();
		DataDao dataDao = dataDaoImpl;*/
		DataDao dataDao = new DataDaoImpl(); //위에 두줄을 한 줄로
		
		
		//business logic 처리용
		SelectServiceImpl sel = new SelectServiceImpl(dataDao);
		SelectService selectService = sel;
		selectService.selectProcess();
	}
}
