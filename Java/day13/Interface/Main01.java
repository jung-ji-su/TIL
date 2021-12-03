package Interface;

public class Main01 {

	public static void main(String[] args) {
		Character ch = new Character("주인공");
		ch.attack();
		ch.run();
		ch.attack();
		ch.shield();
		ch.pickup();
		ch.run();
		ch.jump();
		
		System.out.println("----------------------");
		
		Monster mon = new Monster("악당");
		mon.walk();
		mon.run();
		mon.attack();
		mon.shield();
		mon.jump();		
	}
}