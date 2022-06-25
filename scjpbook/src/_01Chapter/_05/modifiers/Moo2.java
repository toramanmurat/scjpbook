package _01Chapter._05.modifiers;

public class Moo2 extends Zoo{
	//kalitim la superclassta ki metoda ulaþabiliriz.
	public void useMyCoolMEthod() {
		System.out.println("Moo Says" + this.coolMethod());
		
		Zoo z=new Zoo();
		System.out.println("Zoo Says"+z.coolMethod());
	}

}
