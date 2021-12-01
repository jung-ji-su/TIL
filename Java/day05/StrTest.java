package day05;

public class StrTest {
	public static void main(String[] args) {
		String msg = "Hello Java!";
		
		//"문자열".charAt(index) : 문자열에서 각 문자 꺼내오기(char 타입)
		System.out.println(msg.charAt(0));
		
//		msg += "w";	//msg = msg+'w';
//		System.out.println(msg);
		
		//"문자열".length() : 문자열의 길이(int 타입)
		System.out.println(msg.length());
		
		//"문자열1".split("문자열2") : 문자열1 을 문자열2 기준으로 나누기(String[] 타입)
		String[] result = msg.split(" ");
		System.out.println(msg.split(" "));
//		System.out.println(result[1]);
		String msg2 = "Hello.Java!";
		System.out.println(msg2.split("[.]")[0]);
		
		//"문자열1".replace("문자열2","문자열3") : 문자열1의 문자열2를 문자열3으로 교체(String 타입)
		System.out.println(msg.replace("Hello", "Hell"));
		msg = msg.replace("Hello", "Hell");
		System.out.println(msg);
		
//		코드업
	}
}