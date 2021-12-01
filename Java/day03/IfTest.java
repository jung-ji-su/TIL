package day03;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//처리 출력(분기처리)
//		if(num>0) {
//			System.out.println("양수입니다.");
//		}else if(num<0) {
//			System.out.println("음수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
		
		//일괄처리
		String result = "0입니다.";
		if(num>0) {
			result = "양수입니다.";
		}else if(num<0) {
			result = "음수입니다.";
		}
//		else {
//			result = "0입니다.";
//		}
		
		System.out.println(result);
	}
}