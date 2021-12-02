package zoo;

public class Ground {
	public static void main(String[] args) {
		//동물 세마리 만들어서 울게하기
		//울음소리와 움직임은 다르게
		Girlfriend gf = new Girlfriend("정자바", "여성", 21);
		Lophorina lp = new Lophorina("파랑이", "수컷", 1);
		PoodleMoth pm = new PoodleMoth("나메일", "암컷",25);
		
		gf.makeSomeNoise();
		lp.makeSomeNoise();
		pm.makeSomeNoise();
		
		Animal[] arAnimal = {
				new Girlfriend("정자바", "여성", 21),
				new Lophorina("파랑이", "수컷", 1),
				new PoodleMoth("나메일", "암컷",25)
		};
		for (int i = 0; i < arAnimal.length; i++) {
			arAnimal[i].makeSomeNoise();
		}
	}
}
class Animal{
	String name;
	String gender;
	int age;
	
	public Animal(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	void move() {}
	void makeSomeNoise() {}
}

class Girlfriend extends Animal{
	
	public Girlfriend(String name, String gender, int age) {
		super(name, gender, age);
	}
	void move() {
		System.out.println("뽀짝뽀짝 움직인다.");
	}
	void makeSomeNoise() {
		System.out.println("오빠 나 오늘 뭐 달라진거 없어?");
	}
}

class Lophorina extends Animal{

	public Lophorina(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("파닥파닥 날라다닌다.");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("삐루룩 하고 운대여");
	}
	
}

class PoodleMoth extends Animal{

	public PoodleMoth(String name, String gender, int age) {
		super(name, gender, age);
	}
	
	@Override
	void move() {
		System.out.println("팔랑팔랑 날아다닌다.");
	}
	
	@Override
	void makeSomeNoise() {
		System.out.println("푸들푸들");
	}
}