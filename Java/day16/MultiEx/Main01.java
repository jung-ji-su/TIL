package MultiEx;

public class Main01 {

	public static void main(String[] args) {
		// 1~100까지의 홀수들의 합 
		int sum = 0;
		int i = 0;
		
		while(true) {
			i++;
			
			if( i % 2 == 0 ) {	// 짝수
				continue;
			}
			if( i > 100 ) {
				break;
			}
			
			sum += i;
			System.out.println( "i값 : " + i + ", sum값 : " + sum );
		}
		
		System.out.println("홀수의 합 : " + sum);				
	}
}