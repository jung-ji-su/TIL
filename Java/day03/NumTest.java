package day03;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
//		System.out.println(10/(3+0.0));
		//아스키코드
		//문자 하나마다 매칭되어 있는 정수값이 있다.
		//'A' : 65 / 'a' : 97 / '0' : 48
//		System.out.println('A'+5);
		//"0"
//		System.out.println(0+"");

//		System.out.println(10/(double)3);
//		System.out.println((char)('A'+5));
		int data = 10;
//		System.out.println((double)data);
		//기본형 타입들 끼리만 형변환 가능, 클래스들 끼리만 형변환 가능
//		System.out.println((int)"10"+5);
		
		//Integer.parseInt("정수로된문자열") -> 문자열을 정수로 형변환
		System.out.println(Integer.parseInt("10")+5);
		System.out.println(Double.parseDouble("10.24")+1);
		//오류발생
//		Integer.parseInt("Hello");
		
		Scanner sc = new Scanner(System.in);
//		int num = Integer.parseInt(sc.next());
	}
}