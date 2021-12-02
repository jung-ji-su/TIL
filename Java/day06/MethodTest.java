package day06;

import java.util.Scanner;

public class MethodTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.next();
		MethodTest m = new MethodTest();
		System.out.println(m.f(3));
		m.f(10);
		m.f(7);
		m.printName();
	}
	//f(x) = 2x+1
	int f(int x) {
		return 2*x+1;
	}
	//내 이름("정지수")을 10번 출력하는 메소드
	void printName() {
		for (int i = 0; i < 10; i++) {
			System.out.println("정다솔");
		}
	}
	//현재 시간을 돌려주는 메소드
//	시간타입 getTime() {
//		return 시간정보;
//	}
}