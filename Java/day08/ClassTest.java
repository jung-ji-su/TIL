package day08;

public class ClassTest {
	public static void main(String[] args) {
//		int data;
//		System.out.println(data);
//		Car mycar = new Car();
//		System.out.println(mycar);
//		mycar.brand = "Ferrari";
//		mycar.color = "Red";
//		mycar.price = 65000;
		
//		Car mycar = new Car();
//		Car momcar = new Car();
//		mycar.brand = "Ferrari";
//		momcar.brand = "K7";
//		mycar.engineStart();
//		momcar.engineStart();
		Car mycar = new Car("Ferrari","Red",65000);
		System.out.println(mycar.brand);
		Car momcar = new Car("K7", "White", 7000);
		momcar.engineStart();
		Car dadcar = new Car(28000);
		dadcar.engineStart();
	}
}

class Car{
	String brand;
	String color;
	int price;
	
//	Car(){
//		System.out.println("Car 한대 만들기!");
////		return 만들어진필드의주소값;
//	}
	
	//생성자 오버로딩
	//Alt + Shift + S > O : 필드를 이용하여 생성자 만들기
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public Car(int price) {
		this.price = price;
	}

	void engineStart() {
		System.out.println(this.brand+" 시동 켜기");
	}
	void engineStop() {
		System.out.println("시동 끄기");
	}
}