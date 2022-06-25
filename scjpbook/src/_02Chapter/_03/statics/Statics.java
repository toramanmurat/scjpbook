package _02Chapter._03.statics;

public class Statics {
	static int staticsCount = 0; // static veriable
	// instance degiskenler obje ile instance ile birlikte yasarlar.
	/// n tane Statics objesi olsun.
	// bu durumda her objenin kendine ait 1 tane age alani/property degeri/ instance
	// degiskeni mevcuttur.

	// java da objeler heap memoryde yasarlar.
	// instance degiskenler de heap memoryde yasar.
	
	
	// static degiskenin kendisi permgen denilen ozel heap bolgesinde yasar. eger bir objeyi gosteriyorsa , bu obje yine heap alaninda yasar.
	public Statics() {
		staticsCount += 1;
	}

	public static void main(String[] args) {
		// static variables
		// static methods
		// static nested class
		// static initialzie block
		// static import

		System.out.println("Frog Count is now " + staticsCount);

	}
}
