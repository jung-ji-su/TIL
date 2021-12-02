package day10;

public class Casting {
	public static void main(String[] args) {
		//업캐스팅
		Car car1 = new SuperCar("Ferrari");
//		roofOpen 앞에 있는 객체가 Car 타입이고, Car 클래스 내부에는 roofOpen() 이라는
//		메소드가 없기 때문에 사용할 수 없다.
//		car1.roofOpen();
//		오버라이딩 된 메소드는 살아남는다.
		car1.engineStart();
		
//		다운 캐스팅은 형변환 연산자가 하위 연산자보다 우선순위가 낮기 때문에
//		형변환을 괄호로 묶어서 먼저 해주어야 한다. 그런데 이렇게 계속 사용하게 되면
//		아주아주 불편하기 때문에
		((SuperCar)car1).roofOpen();
		
//		보통 다운캐스팅을 진행하며 자식 타입의 객체에 담아놓고 사용한다.
		SuperCar car2 = (SuperCar)car1;
		car2.roofOpen();
		
			
		System.out.println("===============우리집 차고===========");
		Car[] garage = {
			new Car("K7"),
			new SuperCar("Ferrari"),
			new Car("Tico"),
			new SuperCar("Porsche"),
			new Car("Genesis"),
			new Car("Gold Matiz"),
			new SuperCar("RollsRoyce")
		};
		
		for (int i = 0; i < garage.length; i++) {
			garage[i].engineStart();
		}
		
		for (int i = 0; i < garage.length; i++) {
			if(garage[i] instanceof SuperCar) {
				SuperCar car = (SuperCar)garage[i];
				car.roofOpen();
			}else {
				System.out.println("garage의 "+i+"번 방은 업캐스팅 객체가 아닙니다.");
			}
		}
	}
}
class Car{
	String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}

	void engineStart() {
		System.out.println(brand+ " 열쇠로 시동 켜기");
	}
	
}
class SuperCar extends Car{

	public SuperCar(String brand) {
		super(brand);
	}
	
	@Override
	void engineStart() {
		System.out.println(brand+" 음성으로 시동 켜기");
	}
	
	void roofOpen() {
		System.out.println(brand+" 뚜껑 열기");
	}
}