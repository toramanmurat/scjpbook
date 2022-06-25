package _02Chapter._01.inheritance;

public class Overloaded3 {

	public static void main(String[] args) {
	// Generic Animal Eating Generically
	AnimalOverloaded3 a=new AnimalOverloaded3();
	a.eat();
	
	// Horse Eating hay
	HorseOverloaded3 h=new HorseOverloaded3();
	h.eat();
	
	// Horse eating hay
	AnimalOverloaded3 ah=new HorseOverloaded3();
	ah.eat();
	// Horse eating Apples
	HorseOverloaded3 he=new HorseOverloaded3();
	he.eat("Apples");
	
//	Compile Error! AnimalOverloaded sinifinda eat() metodu yok!!!
//	AnimalOverloaded3 a2=new AnimalOverloaded3();
//	a.eat("treats");
	
//  Compile Error! eat(String s) yok !!	
//	AnimalOverloaded3 ah2=new HorseOverloaded3();
//	ah2.eat("Carrots");
	
	
	}
}

class AnimalOverloaded3{
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}

class HorseOverloaded3 extends AnimalOverloaded3{
	public void eat() {
		System.out.println("Horse eating hay");
	}
	
	public void eat(String s) {
		System.out.println("Horse eating "+s);
	}
}