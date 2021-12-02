package bms;

//신한은행 : 출금시 500원 출금하면 잔액에서 1000원 빼기
public class Shinhan extends Bank{
	
	public Shinhan(String account, String pw, String name) {
		super(account, pw, name);
	}

	@Override
	void withdraw(int money) {
		money *= 2;
		super.withdraw(money);
//		if(balance>=money) {
//			this.balance -= money;
//		}
	}
}