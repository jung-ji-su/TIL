package day07;

public class StorageTest {
	int data1=100;
	int data2=200;
	static int data3=300;
	public static void main(String[] args) {
		StorageTest s = new StorageTest();
		//static이 붙은 메소드 내부에서는 일반 전역변수를 사용할 수 없다.
//		System.out.println(data1);
		System.out.println(data3);
	}
	void f1() {
		//각 지역변수는 같은 이름이지만 전혀 다른 공간으로 선언된다
		int data1=10;
		//전역변수는 어떤 메소드이건 간에 접근 가능
		System.out.println(data2);
		//만약 전역변수와 지역변수의 이름이 같다면 지역변수가 더 우선시된다.
		System.out.println(data1);
	}
	void f2() {
		//각 지역변수는 같은 이름이지만 전혀 다른 공간으로 선언된다
		int data1=20;
		//전역변수는 어떤 메소드이건 간에 접근 가능
		System.out.println(data2);
	}
	void f3() {
		//같은 이름의 지역변수가 없다면 자동으로 전역변수를 찾아온다.
		System.out.println(data1);
	}
}