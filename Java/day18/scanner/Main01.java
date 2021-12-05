package scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("int type 입력 : ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.println("int type 입력 : ");
		int i2 = scanner.nextInt();
		System.out.println("int 결과 : " + i2);
		
		System.out.println("double type 입력 : ");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d);
		
		System.out.println("String 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s);
		
		scanner.close();
	}
}