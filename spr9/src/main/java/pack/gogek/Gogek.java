package pack.gogek;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.Bank.Bank;
import pack.Bank.HanaBank;
import pack.Bank.ShinhanBank;

@Service
@ComponentScan("pack.Bank")
@Scope("prototype")
public class Gogek {
   private Bank bank;
   
   @Autowired(required=true)	// type에 의한 매핑
   private ShinhanBank shinhanBank;
   
   @Resource	// 객체변수이름에 의한 매핑
   private HanaBank hanaBank;
   
   public void selBank(String sel){
	   if(sel.equalsIgnoreCase("shinhan")){
		   bank = shinhanBank;
	   }else if(sel.equalsIgnoreCase("hana")){
		   bank = hanaBank;
	   }
   }
   
   
   public void playInputMoney(int money){
	   bank.inputMoney(money);
   }
   
   public void playOutputMoney(int money){
	   bank.outputMoney(money);
   }
   
   public String msg;
   @PostConstruct
   public void init(){
	   msg = "계좌 잔고! : ";
   }
   
   public void showMoney(){
	   //System.out.println("계좌 잔고 : " + bank.getMoney());
	   System.out.println(msg + bank.getMoney());
   }
}