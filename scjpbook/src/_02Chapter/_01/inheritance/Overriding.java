package _02Chapter._01.inheritance;

public class Overriding {
	
	public static void main(String[] args) {
		AnimalA animal=new AnimalA();
		animal.eat();
		
		HorseA horse=new HorseA();
		horse.eat();
//		
//		HorseA horse2=new AnimalA();
//		horse2.eat();
		
		AnimalA horse3=new HorseA();
		horse3.eat();
		
		HorseA horse4=new HorseA();
		horse4.eat2();
	}

}
class AnimalA{
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
	public void eat2() {
		System.out.println("eat2");
	}
}

class HorseA extends AnimalA{
	public void eat() {
		System.out.println("Horse eating hay, oats, "+ "and horse treats");
		}
	
	public void eat2() {
		super.eat2();
	}
}

//class HorseB extends AnimalA{
//	private void eat() {
//		System.out.println("Horse eating hay, oats, "
//				+ "and horse treats");
//		
//	}
//	
//}