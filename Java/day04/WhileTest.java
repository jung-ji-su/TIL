package day04;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		while(choice!=3){
//			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. 파이썬\n2. 자바\n3. 스페인\n4. C언어");
//			choice = sc.nextInt();
//			
//			if(choice == 3) {
//				System.out.println("정답입니다!");
//			}else if(choice == 1 || choice == 2 || choice == 4) {
//				System.out.println("오답입니다...");
//			}else {
//				System.out.println("누구세영?");
//			}
//			
//		}
		
//		do{
//			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n"
//					+ "1. 파이썬\n2. 자바\n3. 스페인어\n4. C언어\n0. 나가기");
//			choice = sc.nextInt();
//			
//			if(choice == 3) {
//				System.out.println("정답입니다!");
//			}else if(choice == 1 || choice == 2 || choice == 4) {
//				System.out.println("오답입니다...");
//			}else if(choice == 0) {
//				System.out.println("안녕히가세요~");
//			}else {
//				System.out.println("누구세영?");
//			}
//			
//		}while(choice!=0);
		
		while(true){
			System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n"
					+ "1. 파이썬\n2. 자바\n3. 스페인어\n4. C언어\n0. 나가기");
			choice = sc.nextInt();
			
			if(choice == 3) {
				System.out.println("정답입니다!");
			}else if(choice == 1 || choice == 2 || choice == 4) {
				System.out.println("오답입니다...");
			}else if(choice == 0) {
				System.out.println("안녕히가세요~");
				break;
			}else {
				System.out.println("누구세영?");
			}
			
		}
	}
}