package bms;

//국민은행 : 입금시 1000원 했다면 500원만 입금해주기
public class Kookmin extends Bank{
	
	public Kookmin(String account, String pw, String name) {
		super(account, pw, name);
	}

	@Override
	void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}
}