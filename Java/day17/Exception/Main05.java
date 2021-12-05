package Exception;

public class Main05 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
			for( int i = 0; i < 5; i++ ) {
				arr[i] = i;	
				System.out.println(arr[i]);
			}
		} catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("에러발생");
			System.out.println("원인 : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("---- 프로그램 종료 -----");		
	}
}