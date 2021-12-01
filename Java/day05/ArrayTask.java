package day05;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
//		빈 배열 생성 후 1 ~ 10까지 담고 다시 출력하기
//		int[] arData = {1,2,3,4,5,6,7,8,9,10}; (X)
		int[] arData = new int[10];
		//index + 1 = 대입하는값
//		arData[0] = 1;
//		arData[1] = 2;
//		arData[2] = 3;
//		arData[3] = 4;
//		arData[4] = 5;
//		arData[5] = 6;
//		arData[6] = 7;
//		arData[7] = 8;
//		arData[8] = 9;
//		arData[9] = 10;
		for (int i = 0; i < 10; i++) {
			arData[i] = i+1;
		}
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
//		System.out.println(arData[5]);
//		System.out.println(arData[6]);
//		System.out.println(arData[7]);
//		System.out.println(arData[8]);
//		System.out.println(arData[9]);
		for (int i = 0; i < 10; i++) {
			System.out.println(arData[i]);
		}
		
//		빈 배열 생성 후 10 ~ 1까지 담고 다시 출력하기
		int[] arData2 = new int[10];
		
//		arData[0] = 10;
//		arData[1] = 9;
//		arData[2] = 8;
//		arData[3] = 7;
//		arData[4] = 6;
//		arData[5] = 5;
//		arData[6] = 4;
//		arData[7] = 3;
//		arData[8] = 2;
//		arData[9] = 1;
		//index + 대입할 값 = 10
		//대입할 값 = 10-index 
		for (int i = 0; i < arData2.length; i++) {
			arData[i] = 10-i;
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData[i]);
		}
//		사용자에게 정수 5개 입력받아서 총 합 구해 출력하기
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 : ");
//		??? = sc.nextInt();
//		System.out.print("정수 : ");
//		??? = sc.nextInt();
//		System.out.print("정수 : ");
//		??? = sc.nextInt();
//		System.out.print("정수 : ");
//		??? = sc.nextInt();
//		System.out.print("정수 : ");
//		??? = sc.nextInt();
		
//		10,71,38,91,55,49,67,12,11,8 반복문으로 출력하기

		
//		국어점수, 영어점수, 수학점수, 자바점수 입력받아서
//		총합과 평균 구하기
//		국어점수 : 
//		영어점수 : 
//		..
		
//		총점 : ~~점
//		평균 : ~~점
	}
}