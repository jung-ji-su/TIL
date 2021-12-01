package day03;

import java.util.Scanner;

public class BloodType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 혈액형은?? : ");
		String btype = sc.next();
		
		//"문자열1".equals("문자열2") : 문자열1과 문자열2가 같다면 true, 다르다면 false
		//btype == "A" (X) ----> btype.equals("A") (O)
		if(btype.equals("A")) {
			System.out.println("남을 먼저 배려하고 타인이 싫어하는 일은 절대하지 않으려 함.");
		}else if(btype.equals("B")) {
			System.out.println("사소한 일에 구애되지 않고 항상 적극적이며 시원스러움.");
		}else if(btype.equals("O")) {
			System.out.println("쾌활하고 너그러운 성격 덕분에 사람들이 잘 따름.");
		}else if(btype.equals("AB")) {
			System.out.println("이성적이기 때문에 본인의 생각을 논리적으로 표현함.");
		}else {
			System.out.println("당신은 사람이 아닙니다.");
		}
	}
}