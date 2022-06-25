package _05Chapter;

public class _04ForLoops {

	public static void main(String[] args) {
		int y = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
		}

//		System.out.println(x); not legal. x e ulasilamaz. yasama alaninda degil.

		for (int x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) {
		}
		
//		for(declarition:expression)

		int[] a = { 1, 2, 3, 4 };
		for (int x = 0; x < a.length; x++) // basic for loop
			System.out.print(a[x]);
		for (int n : a) // enhanced for loop
			System.out.print(n);
		
		
	}
}
