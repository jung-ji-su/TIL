package day09;

public class Road {
	public static void main(String[] args) {
		SuperCar mycar = new SuperCar("Ferrari","Red",65000);
//		SuperCar mycar2 = new SuperCar("A","Black");
//		SuperCar mycar3 = new SuperCar("Porsche", "Yellow", 20000, "abcd");
//		System.out.println(mycar.price);
//		System.out.println(mycar2.price);
		
		Car momcar = new Car("K7","White",7000);
		mycar.engineStart();
		momcar.engineStart();
		
		mycar.wheel--;
		System.out.println(momcar.wheel);
		System.out.println(Car.wheel);
	}
}
class Car{
	String brand;
	String color;
	int price;
	static int wheel = 4;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println(brand+" 열쇠로 시동 켜기");
	}
	void engineStop() {
		System.out.println(brand+" 열쇠로 시동 끄기");
	}
}
class SuperCar extends Car{
	String pw;
	
	public SuperCar() {
//		super : 부모 클래스의 이름
//		super();	: Car(); - 부모 생성자 호출
		super();
	}
	//Alt + Shift + S > C : 부모 클래스에 선언된 생성자 받아와서 생성자 만들기
	public SuperCar(String brand, String color, int price) {
		super(brand, color, price);
	}
	
	public SuperCar(String brand,String color) {
		super(brand,color,10000);
	}
	
	//Alt + Shift + S > O > 부모생성자 선택 : 부모의 필드 + 자식 필드 선택해서 생성자 만들기
	public SuperCar(String brand, String color, int price, String pw) {
		super(brand, color, price);
		this.pw = pw;
	}
	
	void engineStart() {
		System.out.println(brand + " 음성으로 시동 켜기");
	}
		
	//@ : 어노테이션
	@Override
	void engineStop() {
		System.out.println(brand + " 음성으로 시동 끄기");
	}
	
	void roofOpen() {
		System.out.println(brand+" 뚜껑 열기");
	}
	
	void roofClose() {
		System.out.println(brand+" 뚜껑 닫기");
	}
}