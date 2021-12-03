package boxing;

// 자식객체의 기능을 부모에게 물려받은 기능만 사용하도록 제한
public class Main01 {

	public static void main(String[] args) {
		Hello k = new Korean();
		k.say();
		// Hello에게 정의된 기능이 아니므로 에러
		//k.talk();		
	}
}