package Exception;

// try ~ catch 블록으로 예외처리가 적용된 경우에는,
// 에러가 발생되더라도 프로그램 자체가 다운되지 않는다.
public class Main04 {

	public static void main(String[] args) {
		try {
			String year2 = "안녕하세요";
			int age2 = 2021 - Integer.parseInt(year2) + 1;
			System.out.println(age2);
		} catch(NumberFormatException e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("-------프로그램을 종료합니다.----------");		
	}
}