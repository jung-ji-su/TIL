package day04;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//for문 초기식은 int i=0 / 증감식은 i++ 로 고정하고 연습 
		//브론즈
		//1~10까지 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//10~1까지 출력하기
		for (int i = 0; i < 10; i++) {
			//i값 + 출력할값 = 10
			//출력할값 = 10-i
			//i값		출력할값
			//0			10
			//1			9
			//2			8
			//..		..
			//9			1
			System.out.println(10-i);
		}
		
		//실버
		//100 98 96 .... 42 출력하기
		for (int i = 0; i < 30; i++) {
			System.out.println(100-2*i);
		}
		//41부터 -5씩 하며 12번 반복 출력하기
		for (int i = 0; i < 12; i++) {
			System.out.println(41-5*i);
		}
		
		//골드
		//정수 하나 입력받아서 1부터 그 수까지 출력하기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		//1~10의 합 출력하기
		int sum = 0;
//		sum += 1;	sum = 0+1
//		sum += 2;	sum = 0+1 + 2
//		sum += 3;	sum = 0+1+2 + 3
//		sum += 4;
//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;	sum = 0+1+2+...+101
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		//플래티넘
		//n,m 입력받아서 n~m의 합 출력하기
		//입력
		//	정수 2개 입력받기(n,m)
		int n = 0, m = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		
		//처리
		//	n부터 m까지의 정수들 총 합 구하기
		int sum2 = 0;
		for(int i=n;i<=m;i++) {
			sum2 += i;
		}
		//출력
		//	위에서 처리된 결과값 출력
		System.out.println(n+"부터 "+m+"까지의 합 : "+sum2);
		
		//1~100 중 짝수만 출력하기
		//~~만, ~~일때, ~~면 : if
		for (int i = 1; i <= 100; i++) {
			//i%2 == 0 : i가 2의 배수다!
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		//1~100중 3과 5의 공배수 출력하기
		//3과 5의 공배수가 아닐 조건식 : i%3!=0 || i%5!=0
		//!(i%3 == 0 && i%5 == 0)
		//if(  !(i%3==0 && i%5 == 0)  ){}
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
		
		//다이아
		//A~F 출력하기
		//'A' : 65	'F' : 70
//		System.out.println((char)65);
//		System.out.println((char)66);
//		System.out.println((char)67);
//		System.out.println((char)68);
//		System.out.println((char)69);
//		System.out.println((char)70);
//		for (int i = 65; i <= 70; i++) {
//			System.out.println((char)i);
//		}
		for (int i = 0; i < 6; i++) {
			//0		65
			//1		66
			System.out.println((char)(i+65));
		}
		
		//0123 ... 25
		//AbCdE..xYz 출력하기

		//A(65+0)		a(97)
		//C(65+2)		b(97+1)
		//E(65+4)		d(97+3)
		String result = "";		
		for (int i = 0; i < 26; i++) {
//			if(i%2 == 0) {
//				result += (char)(65+i);				
//			}else {
//				result += (char)(97+i);
//			}
			result += (char)(i%2 == 0 ? 65+i : 97+i);
		}
		System.out.println(result);
		
		//마스터
		//정수 하나 입력받아서 2진법으로 바꾸어 출력하기
		//ABCDefghIJKL... 출력하기
		//AbCDefGHIjklMNOPqrstUVWXYz 출력하기
	}
}