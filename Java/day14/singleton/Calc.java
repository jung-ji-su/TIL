package singleton;

public class Calc {
	// ---------- 싱글톤 객체 생성을 위한 준비 시작 ---------
	private static Calc current;
	
	public static Calc getInstance() {
		if( current == null ) {
			current = new Calc();
		}
		
		return current;
	}
	
	public static void freeInstacne() {
		// 객체 null을 대입하면 메모리에서 삭제된다.
		current = null;
	}
	
	// 기본 생성자를 private로 은닉하게 되면 new를 통한 객체 생성이 금지된다.
	private Calc() {}
	
	
	// ---------- 싱글톤 객체 생성을 위한 준비 끝 ---------	
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int times(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	
}