package day02;

//java 패키지 안의 util 패키지 안의 Scanner 클래스 추가
import java.util.Scanner;

public class InputTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//문자열의 초기값은 ""
		//정수 : 0 / 실수 : 0.0, 0.0F / 문자 : ' '
		String name="";
		String addr="";
		int age=0;
		
		System.out.print("이름 : ");
		name = sc.next();//정지수를 입력하게되면 sc.next() 통째로가 "정지수" 문자열 값으로 변한다.
		System.out.println(name+"님 어서오세요~");
		
		System.out.print("주소 : ");
		//의미없는 sc.nextLine()을 통해서 위에서 내려온 Enter를 먹어치운다.
		sc.nextLine();
		addr = sc.nextLine();//정상적으로 입력받기
		System.out.println("사는곳 : "+addr);
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.println("당신의 5년뒤 나이 : "+(age+5));
	}
}










