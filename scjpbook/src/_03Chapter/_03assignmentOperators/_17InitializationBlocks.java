package _03Chapter._03assignmentOperators;

public class _17InitializationBlocks {
//	sinif yuklendiginde/load edildiginde 1 kez calisir.
	static { //static block
		int z=10;
		System.out.println(z);
	}
	
//	obje her olustugunda calisir.
	{ //instance block
		int w=30;
		System.out.println(w);
	}
	public static void main(String[] args) {
		System.out.println("#main metod");
		SmallInit si=new SmallInit();
	}

}

class SmallInit{
	static int x;
	int y;
	
	static {
		x=7;
		System.out.println(x);
	}
	
	{
		y=8;
		System.out.println(y);
	}
}