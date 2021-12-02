package day07;

public class Continue {
	public static void main(String[] args) {
		//1 2 3 5 6 7 8 9 10
		for (int i = 1; i <= 10; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		//if ~ else문을 이용해서 똑같은 결과로 만들 수 있다.
		for (int i = 1; i <= 10; i++) {
			if(i==4) {
			}else {
				System.out.println(i);
			}
		}
	}
}