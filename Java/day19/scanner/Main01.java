package scanner;

import java.util.Scanner;

/*
 * scanner.next(); 		-> 공백 전 까지 입력을 받음
 * scanner.nextLine();	-> 한 줄 전체를 입력 받음
 */
public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("문자열 입력 : ");
		String str1 = scanner.nextLine();
		System.out.println(str1);
		
		System.out.println("문자열 입력 : ");
		String str2 = scanner.next();
		System.out.println(str2);
		
		scanner.close();
	}
}