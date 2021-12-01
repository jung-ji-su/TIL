package day05;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		//10,42,31,29,77
		int[] arData = {10,42,31,29,77};
		System.out.println(arData);
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
//		for(int i=0;i<5;i++) {
//			System.out.println(arData[i]);
//		}
		//ArrayIndexOutOfBounds
//		System.out.println(arData[7]);
		Scanner sc = new Scanner(System.in);
		int[] arData2 = new int[5];
		
		//null : 널값(비어있다, 주소값의 초기값)
		int[] arData3 = null;
		System.out.println(arData3);
		System.out.println(arData3[0]);
	}
}