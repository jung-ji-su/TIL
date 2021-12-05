package scanner;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		System.out.println("-------회원가입을 시작합니다.----------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		String str1 = scanner.nextLine();
		System.out.println(str1);
		
		if( str1.length() > 10 ) {
			System.out.println("아이디는 10자 이하로 입력해주세요.");
		} else {
			System.out.println("입력하신 아이디 " + str1 + "입니다. 회원가입을 시작합니다.");
		}
		
		scanner.close();		
	}
}