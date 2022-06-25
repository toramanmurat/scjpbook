package _03Chapter._03assignmentOperators;

public class _02PrimitiveCasting {
	public static void main(String[] args) {
		int a=100;
		long b=a; // implicit cast, 
		
		float c=100.0001f;
		int d=(int)c; // explicit cast;
		
		double f=100L; //implicit cast;
		
		long l = 130L;
		byte g = (byte)l;
		System.out.println("The byte is " + g); //byte -128 ile 128 arasinda deger alabilir. runtime error almayiz.
		
		
		byte h=3;
		h +=7;
		System.out.println(h);
		
		byte j=3;
		j=(byte) (j+7);
		System.out.println(j);
		
		
	}

}
