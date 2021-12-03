package hiding;

public class Main01 {

	public static void main(String[] args) {
		// Article 클래스로 객체생성
		Article article = new Article(1, "테스트 게시물", "JavaBeans를 테스트한다.", 
				"자바학생", 123, "2021-10-14");
		
		// seq, subject, content, writer, hit, regdate
		System.out.println( article.getSeq() );
		System.out.println( article.getSubject() );
		System.out.println( article.getContent() );
		System.out.println( article.getWriter() );
		System.out.println( article.getHit() );
		System.out.println( article.getRegDate() );	
	}
}