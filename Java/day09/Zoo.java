package day09;

public class Zoo {
	public static void main(String[] args) {
		//동물 세마리 만들어서 울게하기
		//객체 3개 만든 후 울기 라는 기능 사용하기
		//노래추천
		//에스파 - next level

//		int data=10;
//		int[] arData = {data}; //비생산적 --> int[] arData = {10}; (O)
		
		
//		Animal dasol = new Animal("정지수", "남성", 27, "코딩괴물");
//		Animal wombat = new Animal("문도박사", "수컷", 7, "탱커");
//		Animal naevis = new Animal("카리나", "여성", 17, "문을여는자");
		
//		dasol.makeSomeNoise();
//		wombat.makeSomeNoise();
//		naevis.makeSomeNoise();
		
//		Animal[] arAnimal = {dasol,wombat,naevis};
		Animal[] arAnimal = {
				new Animal("정다솔", "남성", 27, "코딩괴물"),
				new Animal("문도박사", "수컷", 7, "탱커"),
				new Animal("카리나", "여성", 17, "문을여는자")
		};
		//arAnimal[0]이 dasol 객체인 것이나 마찬가지
		
		for (int i = 0; i < arAnimal.length; i++) {
			arAnimal[i].makeSomeNoise();
		}
		
		//칸수만 지정한 경우		
//		Animal[] arAnimal2 = new Animal[5];
//		arAnimal2[0] = new Animal();
//		arAnimal2[0].move();
	}
}
//동물 클래스 구현
//종류, 성별, 나이, 이름		dog,cat,cow,pig
//먹기, 울기, 자기, 움직이기 (println으로 간단하게)
class Animal{
	String name;
	String gender;
	int age;
	String type;
	
	public Animal() {}
	
	public Animal(String name, String gender, int age, String type) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.type = type;
	}

	void eat() {
		System.out.println(this.name+" 쿰척쿰척 먹는중...");
	}
	
	void sleep() {
		//지역변수 name이 없다면 this 생략하고 사용 가능
		System.out.println(name+" 쿨쿨 자는중...");
	}
	
	void move() {
		System.out.println(name+" 뽀짝뽀짝 움직이는중...");
	}
	
	void makeSomeNoise() {
		System.out.println("끼루루룩");
	}
}