package bank.business;

import java.util.List;
import java.util.Scanner;

import bank.model.Account;

public class ShinhanBank implements BankUiInter{
	private BankServiceInter bankServiceInter;
	
	public void setBankServiceInter(BankServiceInter bankServiceInter) {
		this.bankServiceInter = bankServiceInter;
	}
	
	@Override
	public void startWork() throws Exception {
		//은행업무 처리
		String menu = null;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("작업 메뉴를 선택하시오");
			System.out.println("1) 계좌등록");
			System.out.println("2) 계좌목록");
			System.out.println("3) 입금");
			System.out.println("4) 출금");
			System.out.println("5) 이체");
			System.out.println("q) 종료");
			System.out.println(">>");
			
			try {
				menu = scanner.nextLine();
				//System.out.println(menu);
				if(menu.equals("1")){	//새 계좌 등록
					System.out.println("계좌번호입력:");
					String account_no = scanner.nextLine();
					System.out.println("고객명 입력:");
					String name = scanner.nextLine();
					
					Account account = new Account(account_no, name);
					bankServiceInter.addAccount(account);
				}else if(menu.endsWith("2")){	//계좌 등록
					List<Account> accounts = bankServiceInter.getAccount();
					
					for (int i = 0; i < accounts.size(); i++) {
						System.out.println(accounts.get(i).getAccount_no());
						System.out.println(accounts.get(i).getName());
						System.out.println();
					}
				}else if(menu.endsWith("3")){	//입금
					System.out.println("계좌번호입력:");
					String account_no = scanner.nextLine();
					Account account = bankServiceInter.findAccount(account_no);
					if(account != null){
						System.out.println("입금액을 입력:");
						int money = scanner.nextInt();
						bankServiceInter.deposit(account, money);
					}else{
						System.out.println("등록되지 않은 계좌번호입니다.");
					}
				}else if(menu.endsWith("4")){	//출금
					System.out.println("계좌번호입력:");
					String account_no = scanner.nextLine();
					Account account = bankServiceInter.findAccount(account_no);
					if(account != null){
						System.out.println("출금액을 입력:");
						int money = scanner.nextInt();
						bankServiceInter.withdraw(account, money);
					}else{
						System.out.println("등록되지 않은 계좌번호입니다.");
					}
				}else if(menu.endsWith("5")){	//이체
					System.out.println("from 계좌에서 to 계좌로 송금하기");
					System.out.println("from 계좌번호입력:");
					String account_no = scanner.nextLine();
					Account from = bankServiceInter.findAccount(account_no);
					System.out.println("to 계좌번호입력:");
					account_no = scanner.nextLine();
					Account to = bankServiceInter.findAccount(account_no);
					
					if(from != null && to != null){
						System.out.println("이체금액입력:");
						int sand_monty = scanner.nextInt();
						bankServiceInter.transfer(from, to, sand_monty);
					}else{
						System.out.println("계좌번호 오류로 인해 이체 처리 불가~!!!");
					}
					
				}
			} catch (Exception e) {
				System.out.println("개인업무 처리 오류:" + e);
			}
		}while(!menu.equals("q"));
		
		scanner.close();
		System.out.println("업무 종료");
	}
}
