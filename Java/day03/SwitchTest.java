package day03;

import java.util.Scanner;

//Ctrl + Shift + F : 자동 정렬
public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. 파이썬\n2. 자바\n3. 일본어\n4. C언어");
		int choice = sc.nextInt();

		switch (choice) {
		case 3:
			System.out.println("정답입니다!");
			break;
		case 1:
		case 2:
		case 4:
			System.out.println("오답입니다...");
			break;
		default:
			System.out.println("머리가 띵~");
		}

		// 문자열도 가능
//		String btype ="";
//		switch(btype) {
//		case "A":
//			break;
//		case "B":
//			break;
//		}
	}
}
