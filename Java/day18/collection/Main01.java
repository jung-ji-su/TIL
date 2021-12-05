package collection;

import java.util.HashMap;

public class Main01 {

	public static void main(String[] args) {
		// 제너릭 -> <값의 이름, 값의 종류>
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// 데이터를 추가는 put 메서드 사용
		hm.put("국어", 85);
		hm.put("영어", 100);
		hm.put("수학", 75);
		hm.put("과학", 85);
		hm.put("과학", null);	// 객체를 넣는 것이므로 null 사용 가능
		
		// 저장된 갯수 얻어
		System.out.println("hashmap size : " + hm.size());
		 
		// 데이터 꺼내기
		System.out.println( hm.get("수학") );
		System.out.println( hm.get("국어") );
		System.out.println( hm.get("과학") );
		System.out.println( hm.get("영어") );		
	}
}