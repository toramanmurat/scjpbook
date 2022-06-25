package _05Chapter;

public class _02SwitchCase {
//	Çok fazla if-else if-else seklinde bir yapi varsa bu durumda tercih edilir.
//	Expression ne olabilir? char,byte,short,int, enum,String
//	Expression ne olamaz= double, float, long

	public static void main(String[] args) {

		int x = 2;
		int y = 2;
		switch (x) {
		case 1:
			System.out.println("x is equal to 1");
			break;
		case 2:
			System.out.println("x is equal to 2");
			break;
		case 3:
			System.out.println("x is equal to 3");
			break;
		default:
			System.out.println("Still no idea what x is");

		}
		switch (y) {
		case 2: {
			y = 7;
		}
		}

//		switch(y) {
//		 0: {}
//		 1: {}
//		}

		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
	}
}
