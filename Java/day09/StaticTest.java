package day09;

public class StaticTest {
	static int data1 = 20;
	public static void main(String[] args) {
		Test.add(10, 3);
	}
}
class Test{
	int data1;
	static int data2;
	
	void m1() {
		System.out.println(data1);
	}
	
	static void m2() {
		int data3=10;
		System.out.println(StaticTest.data1);
		System.out.println(data2);
		System.out.println(data3);
	}
	
	static int add(int num1,int num2) {
		return num1+num2;
	}
}