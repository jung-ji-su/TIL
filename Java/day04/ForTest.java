package day04;

public class ForTest {
	public static void main(String[] args) {
//		int i=0;
//		while(i<10) {
//			System.out.println("정다솔");
//			i++;
//		}
		
		//0부터 9까지
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		//20부터 1씩 감소하며 10번
		for(int i=20;i>10;i--) {
			System.out.println(i);
		}
		//0 3 6 9 12 15 18 21 24 27 30 33
		for(int i=0;i<36;i+=3) {
			System.out.println(i);
		}
		
		//100부터 -2씩 하며 14번 반복
		//14 = (x-100)/-2
		//-28 = x-100
		//x = 72
		for(int i=100;i>72;i-=2) {
			System.out.println(i);
		}
	}
}