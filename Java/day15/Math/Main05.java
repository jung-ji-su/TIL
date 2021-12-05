package Math;

import study.java.helper.Util;

public class Main05 {

	public static void main(String[] args) {
		// Util class 사용하여 5자리 인증번호 생성하기(0~9)
		String authNum = "";
		
		for( int i = 0; i < 5; i++ ) {
			authNum += Util.getInstance().random(0, 9);
		}
		
		System.out.println("인증번호 = " + authNum);
	}
}