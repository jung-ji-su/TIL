package string;

public class Main02 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디와 도메인 구별하기
		// split 사용 X
		// 아이디 : student
		// 도메인 : java.com
		
		String email = "student@java.com";
		
		// "@"가 나타나는 위치를 얻기
		int s = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, s);
		
		// "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(s+1);
		
		System.out.println("아이디 : " + email_id);
		System.out.println("도메인 : " + email_domain);	
	}
}