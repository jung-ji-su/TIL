package singleton;

public class Main01 {

	public static void main(String[] args) {
		Calc loader1 = Calc.getInstance();
		System.out.println( loader1.plus(10, 20) );
		
		System.out.println( Calc.getInstance().minus(100, 50) );
		
		
		
//		Calc c = new Calc();
//		
//		int a = c.plus(10, 20);
//		int b = c.minus(20, 10);
//		
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
	}
}