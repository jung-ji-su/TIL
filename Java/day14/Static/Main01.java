package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫 번째 글 제목", "2021-10-16");
		// 두번째글
		Article a2 = new Article(2, "두 번째 글 제목", "2021-10-16");
		// 세번째글
		Article a3 = new Article(3, "세 번째 글 제목", "2021-10-16");
		
		
		System.out.println(a1.toString());
		// 두번째글 출력
		System.out.println(a2.toString());
		// 세번째글 출력
		System.out.println(a3.toString());
		
		Article.setCategory("공지사항");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());				
	}
}