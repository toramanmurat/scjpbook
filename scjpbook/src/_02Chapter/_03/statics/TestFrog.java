package _02Chapter._03.statics;

public class TestFrog {
	public static void main(String[] args) {
		new TestFrog();
		new TestFrog();
		new TestFrog();
//		System.out.print("frogCount:" + TestFrog.frogCount); // Access
// static variable
		
		Frog f=new Frog();
		int frogs=f.frogCount;
		System.out.println(frogs);
	}
}
class Frog {

	static int frogCount = 0;

	public Frog() {
		frogCount += 1; // Modify the value in the constructor
	}
}
