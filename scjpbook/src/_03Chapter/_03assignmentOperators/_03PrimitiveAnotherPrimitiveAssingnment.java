package _03Chapter._03assignmentOperators;

public class _03PrimitiveAnotherPrimitiveAssingnment {

	public static void main(String[] args) {
		int a = 10; // Assign a value to a
		System.out.println("a = " + a);
		int b = a;
		b = 30;
		System.out.println("a = " + a + " after change to b");
		System.out.println(b);
	}
}
