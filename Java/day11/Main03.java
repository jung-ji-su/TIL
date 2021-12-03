package hiding;

public class Main03 {

	public static void main(String[] args) {
		Member s = new Member("정지수", 27);
		
		System.out.println( "이름 : " + s.getName() );
		System.out.println( "나이 : " + s.getAge());
		
		// 이름 : JSP학생, 나이 : 35
		s.setName("JSP학생");
		s.setAge(35);
		
		System.out.println( "이름 : " + s.getName() );
		System.out.println( "나이 : " + s.getAge());
		
	}
}