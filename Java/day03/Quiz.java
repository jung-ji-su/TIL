package day03;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
//		다음 중 프로그래밍 언어가 아닌것은?
//		1. 파이썬
//		2. 자바
//		3. 중국어
//		4. C언어
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 프로그래밍 언어가 아닌것은?\n1. 파이썬\n2. 자바\n3. 중국어\n4. C언어");
		int choice = sc.nextInt();
		
		if(choice == 3) {
			System.out.println("정답입니다!");
		}else if(choice == 1 || choice == 2 || choice == 4) {
			//~~ 거나, ~~ 또는, ~~ 혹은 	--> ||
			//~~ 이고, ~~ 하고, ~~ 고		--> &&
			System.out.println("오답입니다...");
		}else {
			System.out.println("워 스 한구어런");
		}
	
	}
}