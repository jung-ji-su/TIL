package calendar;

import java.util.Calendar;

public class Main03 {

	public static void main(String[] args) {
		// 객체를 생성한 시점에 대한 시각을 변수로 내장하고 있다.
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		
		// 특정 날짜로 지정
		cal.set(Calendar.YEAR, 2020);
		DatePrinter.printDateTime(cal);
		// 자바는 0부터 월을 관리하므로 5월로 설정
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		DatePrinter.printDateTime(cal);
		
		// 특정날짜로 지정(또 다른 방법)
		cal.set(1982, 5, 17);
		DatePrinter.printDateTime(cal);
		
		cal.set(1982, 5, 17, 1, 2, 3);
		DatePrinter.printDateTime(cal);				
	}
}