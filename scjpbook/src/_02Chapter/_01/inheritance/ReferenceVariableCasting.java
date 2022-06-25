package _02Chapter._01.inheritance;

public class ReferenceVariableCasting {

	public static void main(String[] args) {
		AnimalCasting [] a= {new AnimalCasting(),new DogCasting(),new AnimalCasting()};
		for(AnimalCasting animalX: a) {
			animalX.makeNoise();
			if(animalX instanceof DogCasting) {
//				Cast islemi yapmazsak compile error verir
				DogCasting d= (DogCasting) animalX;
				d.playDead();
				
			}
		}
	}
}

class AnimalCasting{
	void makeNoise() {
		System.out.println("Generic Noise");
	}
}

class DogCasting extends AnimalCasting{
	void makeNoise() {
		System.out.println("Bark");
	}
	void playDead() {
		System.out.println("Roll Over");
	}
}