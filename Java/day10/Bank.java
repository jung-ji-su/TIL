package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}
	
	void deposit(int money) {
		this.balance += money;
	}
	
	void withdraw(int money) {
		if(balance>=money) {
			this.balance -= money;
		}
	}
	
	void show() {
		//정지수님의 계좌정보(90021)
		//잔액 : 988165498531500000원
		System.out.println(name+"님의 계좌정보("+account+")\n잔액 : "+balance+"원");
	}
}