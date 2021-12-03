package review;

public class Main01 {

	public static void main(String[] args) {
		int a = 100;
		int x = 1;
		int y = a + (x++ + 1); 
		
		System.out.println( "y : " + y );
		System.out.println( "x : " + x );
	}
}