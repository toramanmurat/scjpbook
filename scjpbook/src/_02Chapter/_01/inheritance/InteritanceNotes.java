package _02Chapter._01.inheritance;

public class InteritanceNotes {
	public static void main(String[] args) {
		InteritanceNotes t1=new InteritanceNotes();
		InteritanceNotes t2=new InteritanceNotes();
		if(!t1.equals(t2))
			System.out.println("they're not equal");
		if (t1 instanceof Object)
			System.out.println("t1's an Object");
	}

}

// inheritance , kod tekrar�n� �nlemek ve kodun tekrar kullanilabilir olmas�n� sa�lamak
// inheritance , polymorphism/polimorfizmi saglamaktir.