package _02Chapter._03.statics;

class Animal {
	static void doStuff() {
		System.out.print("a ");
	}
}

class Dog extends Animal {
	static void doStuff() { // it's a redefinition,
// not an override
		System.out.print("d ");
	}

	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++)
			a[x].doStuff(); // invoke the static method
	}
}
