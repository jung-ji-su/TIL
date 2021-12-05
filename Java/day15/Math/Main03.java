package Math;

/*
 * 랜덤값 생성하기
 * --------------------------------------------
 * Math.random() 메서드는 0~1 범위를 갖는 double형의 값을 리턴한다.
 */
public class Main03 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		// 반복문, 100번, Math.random() 출력
		for(int i = 0; i<100; i++) {
			System.out.println(Math.random());			
		}
		
		
		int cnt = 0;

		while (true) {
			int a =(int)(Math.random()*10000) ;
			cnt++;
			if (a == 0) {
				System.out.println(a);
				System.out.println(cnt);
				break;
			}else {
//				System.out.println(a);
//				System.out.println(cnt);
			}			
		}		
	}
}