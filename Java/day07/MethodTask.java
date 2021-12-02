package day07;

public class MethodTask {
	public static void main(String[] args) {
		//입력
		
		//호출(처리)
		
		//출력
		MethodTask m = new MethodTask();
		System.out.println(m.changeToHangle(1024));
	}
	//브
	//1~10까지 출력하는 메소드
	void print1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	//1~10까지의 합 구해주는 메소드
	int sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum +=i;
		}
		return sum;
	}
	//실
	//1~n까지의 합 구해주는 메소드
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	//두 정수의 나눗셈 결과를 구해주는 메소드
	double div(int num1,int num2) {
		
		if(num2 != 0) {
			return (double)num1/num2;
		}
		return 0.0;
	}
	//골
	//어떤 문자열을 n번만큼 출력하는 메소드
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	
	//n 부터 m 까지의 합 구해주는 메소드
	int sumNtoM(int n, int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		return sum;
	}
	
	//플
	//""+=
	//문자열을 전부 대문자로 바꿔주는 메소드("HelLo~~" --> "HELLO~~")
	String changeToUpperCase(String msg) {//"HelLo~~"
		String result = "";
		for (int i = 0; i < msg.length(); i++) {//0 1 2 3 4 5 6
			char ch = msg.charAt(i);//'H' 'e' 'l' 'L' 'o' '~' '~'
			if(ch>='a' && ch<='z') {//'e' 'l' 'o'
				result += (char)(ch-32); //'E' 'L' 'O'
			}else {//'H' 'L' '~' '~'
				result += ch;
			}
		}
		return result;
	}
	//문자열을 거꾸로 바꿔주는 메소드("HELLO" --> "OLLEH")
	String reverse(String msg) {
		String result = "";
//		for (int i = 0; i < msg.length(); i++) {
//			result = msg.charAt(i)+result;
//			//'H'+"" --> "H"
//			//'E'+"H" --> "EH"
//			//'L'+"EH" --> "LEH"
//		}
		for (int i = msg.length()-1; i >= 0; i--) {
			result += msg.charAt(i);
		}
		return result;
	}
	//다
	//문자열이 숫자로 이루어져 있는지 검사하는 메소드("Hello3" --> false / "324" --> true)
	//is~~, has~~ : ~~이다, ~~를 가지고 있다 라고 주장하는 메소드(결과가 true, false)
	boolean isDigit(String msg) {//"324"
		for (int i = 0; i < msg.length(); i++) {//0 1 2
			char ch = msg.charAt(i);//'3' '2' '4'
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;
	}
	
	//문자열의 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드("HelLo~~" --> "hEElO~~")
	String changeCase(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if(ch>='a' && ch<='z') {
				result += (char)(ch-32);
			}else if(ch>='A' && ch<='Z') {
				result += (char)(ch+32);
			}else {
				result += ch;
			}
		}
		return result;
	}
	//정수를 한글로 바꿔주는 메소드(1024 --> "일공이사")
	String changeToHangle(int num) {			//1024
		//				 01 23 45 67 89
		String hangle = "공일이삼사오육칠팔구";
		String data = num + "";				//"1024"
		String result = "";
		for (int i = 0; i < data.length(); i++) {	//0 1 2 3
			char ch = data.charAt(i);		//'1' '0' '2' '4'
			//Integer.parseInt(ch+"");		//'1'+"" --> "1" --> 1
			//'1' --> 1
			//'0' : 48 			'0'- 48 : 0
			int idx = ch-48;				//1 0 2 4
			result += hangle.charAt(idx);	//'일' '공' '이' '사'
		}
		return result;
	}
}