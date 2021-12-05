package Exception;

public class Main03 {

	public static void main(String[] args) {
		// 배열의 크기가 3(배열의 인덱스 0 ~ 2)
		int[] arr = new int[3];
		
		// 프로그램이 논리적 모순에 빠지지 않도록 
		// 프로그래머가 if문을 사용하여 처리해준다.
		for( int i = 0; i < 5; i++ ) {
			if( i < arr.length ) {
				arr[i] = i;		// i가 3일때 에러가 발생
				System.out.println(arr[i]);
			}			
		}				
	}
}