package Exception;

public class Main02 {

	public static void main(String[] args) {
		// 배열의 크기가 3(배열의 인덱스 0 ~ 2)
		int[] arr = new int[3];
		
		for( int i = 0; i < 5; i++ ) {
			arr[i] = i;		// i가 3일때 에러가 발생
			System.out.println(arr[i]);
		}		
	}
}