package _02Chapter._01.inheritance;

public class Overloaded {
	public static void main(String[] args) {
		Adder adder=new Adder();
		int b=37;
		int c=3;
		int result=adder.addThem(b, c);
		double doubleResult=adder.addThem(22.5, 9.3);
		
		System.out.println(result+" "+doubleResult);
	}

}

class Adder{
	public int addThem(int x,int y) {
		return x+y;
	}
	public double addThem(double x,double y) {
		return x+y;
	}
}





// 
// metot ismi ayni ise parametre listesi farkli olmalidir !! (derleme hatasi verir,donus tipi farketmez)
// donus tipi ve access level degisebilir!

