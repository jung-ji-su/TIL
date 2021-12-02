package bms;

import java.util.Scanner;

public class View {
	void joinview() {
		Scanner sc = new Scanner(System.in);
		//View 클래스는 화면구현에만 집중하는 클래스이기 때문에 내부에 기능구현은 절대 하지 않는다.
		//BankManager라는 데이터 처리(기능 구현)용 클래스를 따로 만들어 놓고 사용한다.
		BankManager manager = new BankManager();
		System.out.println("계좌개설 창입니다.");
		System.out.println("은행 선택\n1. 국민은행\n2. 신한은행\n3. 우리은행");
		int bankChoice = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		//사용자에게 입력받은 데이터들을 기능을 담당할 manager의 join()에 넘겨준다.(흐름이 넘어간다)
		manager.join(bankChoice,name,pw);
	}
	void loginview() {
		Scanner sc = new Scanner(System.in);
		BankManager manager = new BankManager();
		System.out.print("계좌번호 : ");
		String account = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		//session : 로그인 성공한 정보를 담는 공간
		//login()는 성공하게 되면 어떤 객체를 return / 실패하게 되면 null을 return
		Bank session = manager.login(account,pw);
		if(session != null) {
			//session에 어떤 객체가 담겨있다는 뜻(로그인 성공)
			//그 성공한 객체를 mainview()에 넘겨주면서 main화면 호출
			mainview(session);
		}else {
			//session에 null이 담겨있다는 뜻(로그인 실패)
			System.out.println("로그인 실패 / 다시 시도하세요.");
		}
		
		
	}
	void mainview(Bank session) {
		//session 매개변수는 로그인 성공한 객체를 넘겨받았고 업캐스팅 되어있는 상태이다.
		Scanner sc = new Scanner(System.in);
		//name 필드는 부모타입인 Bank에 선언된 것이므로 업캐스팅 된 객체로 사용 가능하다.
		System.out.println(session.name+"님 어서오세요");
		while(true) {
			System.out.println("1. 입금하기\n2. 출금하기\n3. 잔액조회\n4. 로그아웃");
			int choice = sc.nextInt();
			if(choice == 4) {
				System.out.println("로그아웃합니다.");
				break;
			}
			int money=0;
			switch(choice) {
			//아래의 case들 안에서 사용하는 deposit(), withdraw(), show() 들은
			//업캐스팅 된 객체인 session에 오버라이딩이 되어있다면, 오버라이딩 된 내용으로 사용한다.
			//(업캐스팅 된 객체는 오버라이딩 한 메소드들은 살아 남으니까)
			case 1:
				//입금
				System.out.print("입금하실 금액 : ");
				money = sc.nextInt();
				session.deposit(money);
				System.out.println("현재잔액 : "+session.balance+"원");
				break;
			case 2:
				//출금
				System.out.print("출금하실 금액 : ");
				money = sc.nextInt();
				session.withdraw(money);
				System.out.println("현재잔액 : "+session.balance+"원");
				break;
			case 3:
				//잔액조회
				session.show();
				break;
			}
		}
	}
}