package _05Chapter;

public class _03Loops {

	public static void main(String[] args) {
		
		int x=2;
		while(x==2) {
			System.out.println(x);
			++x;
		}
		
//		while(int y=3) {} not legal
		
		int y=5;
		do {
			System.out.println(y);
			y++;
		}while(y<8);
	}
}
