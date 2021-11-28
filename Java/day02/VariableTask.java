package day02;

//Alt + ↑(↓) : 선택한 문장 위(아래)로 이동
//Ctrl + Alt + ↑(↓) : 선택한 문장 위(아래)로 복사
public class VariableTask {
	public static void main(String[] args) {
		//------홍길동 님의 정보------
		//이름 : 홍길동
		//나이 : 10살
		//키 : 170.24cm
		//----------\O/-----------
		String name = "정지수";
		int age = 10;
		double height = 170.24;
		
		System.out.println("------"+name+" 님의 정보------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"살");
		System.out.println("키 : "+height+"cm");
		System.out.println("----------\\O/-----------");
		
		//1 + 2 = 3
		System.out.println(1 + " + " + 2 + " = " + (1+2));
		System.out.printf("%d + %d = %d\n", 1, 2, (1+2));
		
		//10.2400
		System.out.println(10.24);
		//%.4f : 소수점 아래로 네자리까지
		System.out.printf("%.4f\n",10.24);
		
		int a = 10, b = 20, c = 30;
		
		System.out.printf("%d %d %d\n",a,b,c);
		System.out.printf("%3$d %1$d %2$d\n",a,b,c);
		
//		String.format("서식문자열",값,..);
//		넘겨준 서식문자열과 값들로 문자열을 만들어서 돌려주는 메소드(사용부분 통째로 문자열 값)
		
		//								"10 20 30"
		String result = String.format("%d %d %d", a,b,c);
		System.out.println(result);
		
	}
}








