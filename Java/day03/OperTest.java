package day03;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args) {
//		System.out.println(14&17);
//		System.out.println(~14);
//		System.out.println(~17);
		
//		System.out.println(new Scanner(System.in).nextInt()>0?"양수입니다":"음수입니다");
		//입력
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		//처리
//		String result = num>0 ? "양수입니다." : num==0?"0입니다.":"음수입니다.";
//		
////		String result = num>0 ? "양수입니다." : "음수입니다.";
////		String result2 = num==0? "0입니다." : result;
////		System.out.println(result2);
//		
//		//출력
//		System.out.println(result);
		
//		정수 입력받아서 1 이라면 문자열을 입력받고 출력
//		1이 아니라면 정수 입력받아서 +5해서 출력
		
//		입력 : 1				입력 : 85
//		문자열 : Hello		정수 : 10
		
//		결과 : Hello			결과 : 15
		
		//입력
		System.out.print("입력 : ");
		int choice = sc.nextInt();
		
		//처리, 출력
		System.out.print(choice == 1? "문자열 : " : "정수 : ");
		
		//입력 처리 출력
		//삼항연산자는 참일때, 거짓일때의 부분에 문장을 쓰려면 문장 통째로 값이여야 한다는 제한이 생긴다.
		System.out.println("결과 : "+(choice == 1?sc.next():sc.nextInt()+5));

	}
}