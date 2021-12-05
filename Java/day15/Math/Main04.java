package Math;

public class Main04 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Main04.random(1, 10));
		System.out.println(Main04.random(2, 15));
		
	}
	
	// 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	public static int random( int min, int max ) {
		int num = (int)((Math.random() * (max - min + 1)) + min); 
		return num;
	} 
}