package _02Chapter._01.inheritance;

public class Overloaded2 {
	public static void main(String[] args) {
		UseAnimals useAnimals=new UseAnimals();
		AnimalOverloaded animal=new AnimalOverloaded();
		HorseOverloaded horse=new HorseOverloaded();
		useAnimals.doStuff(animal);
		useAnimals.doStuff(horse);
		
//		AnimalOverloaded horse2=new HorseOverloaded();
//		horse2.doStuff(horse);
	}
}

class AnimalOverloaded{}
class HorseOverloaded extends AnimalOverloaded{}
class UseAnimals{
	public void doStuff(AnimalOverloaded a) {
		System.out.println("In The Animal Version");
	}
	public void doStuff(HorseOverloaded h) {
		System.out.println("In The Horse Version");
	}
	
	
}