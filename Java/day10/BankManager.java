package bms;

import java.util.Random;

public class BankManager {
	//모든 은행원(BankManager 타입의 객체)들은 같은 회원목록과 같은 회원수들을 봐야한다.
	//아래에 있는 배열들은 모든 객체들이 공유해야하기 때문에 static으로 선언해준다.
	//join()을 사용하기 위해 생성한 manager 객체와 login()을 사용하기 위해 생성한 manager 객체가
	//함께 공유하기 때문에 정상적인 처리가 가능하다.

	//모든 회원객체들이 업캐스팅 된 채 담길 배열(0행 : 국민은행 타입이 업캐스팅 / 1행 : 신한은행 / 2행 : 우리은행)
	static Bank[][] arUser = new Bank[3][1000];
	//각 은행의 회원수들을 담을 배열(0번방 : 국민은행의 회원수 / 1번방 : 신한은행 / 2번방 : 우리은행)
	static int[] arCnt = {0,0,0};
	
	void join(int bankChoice, String name, String pw) {
		//랜덤한 5자리 숫자
		Random r = new Random();
		//r.nextInt(10) : 0~9 랜덤한 정수 반환
		//10000~99999
		//0 ~ 89999 : r.nextInt(90000)
		//+10000 ===> 10000~99999
		String account = r.nextInt(90000)+10000+"";
		//중복체크
		for (int i = 0; i < 3; i++) {
			//i for문은 은행의 갯수만큼 반복(0 1 2)
			for (int j = 0; j < arCnt[i]; j++) {
				//j for문은 각 은행의 회원 수만큼 반복(arCnt[0] : 국민은행의 회원수)
				if(arUser[i][j].account.equals(account)) {
					//arUser[i][j] : 현재 가입되어 있는 회원들 객체를 하나씩 꺼내오게 된다.
					//그 꺼내온 객체의 account가 위에서 랜덤하게 만든 값을 담은 account와 같다면
					//중복되는 계좌번호를 가진 객체가 이미 존재한다는 뜻
					//새롭게 랜덤한 5자리 숫자로 계좌번호를 만들어주고
					account = r.nextInt(90000)+10000+"";
					//다시 만들어낸 계좌번호로 0행 0열부터 다시 비교해야한다.
					//때문에 i값은 -1로 만들어 주어서 다음 반복때 0부터 다시 시작하도록 유도한다.(for문은 증감식부터)
					i = -1;
					//j for문은 한번 중복되는 이상 더이상 반복할 의미가 없기 때문에 break로 탈출
					break;
				}
			}
		}
		//여기까지 왔다면 위의 이중for문을 정상적으로 마쳤다는 뜻이고, 중복체크를 통과했다는 뜻이다.
		
		//사용자가 선택한 은행번호에 따라서 만들어야 할 은행의 타입이 다르다.
//		switch(bankChoice) {
//		case 1:
//			//국민
		//국민은행의 상징은 0
		//arUser의 0행 : 국민은행의 회원들이 담길 행
		//기존에 가입된 사람의 수 를 새로 가입되는 회원의 열 번호로 사용 가능하다.
		//기존에 가입된 사람 : 2명 ----> 새로 가입되는 사람은 2번방에 들어가야 한다.
						//국민은행의 회원수		새로운 국민은행 객체 생성
//			arUser[0][     arCnt[0]     ] = new Kookmin(account, pw, name);

		//한명 가입되었으니 국민은행의 회원수는 하나 증가
//			arCnt[0]++;
//			break;
//		case 2:
//			//신한
//			arUser[1][     arCnt[1]     ] = new Shinhan(account, pw, name);
//			arCnt[1]++;
//			break;
//		case 3:
//			//우리
//			arUser[2][     arCnt[2]     ] = new Woori(account, pw, name);
//			arCnt[2]++;
//			break;
//		}
		
		//위의 과정을 줄인것		
		//maker라는 배열을 만들어서 객체를 3개 다 만들어놓는다.
		Bank[] maker = {
				new Kookmin(account, pw, name),
				new Shinhan(account, pw, name),
				new Woori(account, pw, name)
				
		};
		//만들어놓은 maker 배열에서 선택한 은행번호에 따라서 한개만 선택해서 사용하고 나머지는 버려진다.
		//case문을 살펴보니 선택한 bankChoice 에 따라서 인덱스 번호들이 달라진다.
		//bankChoice에서 하나 뺀 값을 인덱스로 사용하면 된다.
		arUser[bankChoice-1][arCnt[bankChoice-1]] = maker[bankChoice-1];
		//해당하는 은행의 회원수 하나 증가
		arCnt[bankChoice-1]++;//arCnt[bankChoice-1]+=1;

		//실제로는 기능을 구현할 BankManager 에서는 절대 입출력을 해서는 안된다.
		//우리는 배우는 중이니까 출력(실제로는 출력할 값을 return 하는식으로 해야한다.)
		System.out.println(name+"님 계좌개설을 환영합니다.\n계좌번호 : "+account);
	}
	Bank login(String account, String pw) {
		for (int i = 0; i < arCnt.length; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				//arUser[i][j] : 생성된 채 저장된 모든 객체들 꺼내오며 반복
				if(arUser[i][j].account.equals(account)){
					//꺼내온 객체가 가지고 있는 account가 입력받은 account와 같다면
					if(arUser[i][j].pw.equals(pw)) {
						//그 객체의 pw도 입력받은 pw와 같다면
						//로그인 성공(그 성공한 객체를 return)
						return arUser[i][j];
					}
				}
			}
		}
		//위의 if문에 들어가지 못했다면 무조건 여기까지 내려올 것이고
		//로그인 실패를 의미한다.(null을 return)
		return null;
	}
}