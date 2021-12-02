package bms;

import java.util.Scanner;

//index.html
//index.jsp
//첫 시작 페이지
public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//View 클래스는 사용자에게 보여주기 위한 화면을 구현하는 코드는 매우 길다.
		//따라서 View 클래스 안에 하나하나를 메소드로 구현해 놓고 호출해서 사용한다.
		//코드의 가독성을 위해서 사용하는 클래스
		View v = new View();
		System.out.println("안녕하세요 BMS입니다.");
		while(true) {
			System.out.println("1. 계좌개설\n2. 로그인\n3. 나가기");
			int choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("안녕히가세요");
				break;
			}
			switch(choice) {
			case 1:
				//계좌개설
				//case문 안에서 모든것을 구현하기 힘들기 때문에 View 클래스에 joinview()를
				//만들어 놓고 호출해서 사용한다.(흐름이 joinview 내부로 넘어간다.)
				v.joinview();
				break;
			case 2:
				//로그인
				v.loginview();
				break;
			}
		}
	}
}