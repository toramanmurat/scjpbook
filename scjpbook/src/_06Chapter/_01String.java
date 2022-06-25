package _06Chapter;

public class _01String {
	// String objeleri immutable özellige sahiptir.
	// String'in her karakteri 16-bit unicode bir karakterdir.
	//String constant pool

	public static void main(String[] args) {
		String s = new String(); // 2 objects, 1 reference variable
		s = "abcdf";

		String s1 = new String("abcdf");
		String s3 = s1;

		System.out.println(s3); // abcdf yazar

		s1 = s1.concat("more stuff"); // sonunda ekler.
		String s4 = s.concat("def");
		System.out.println(s4);// abcdfdef

		String x = "Java"; // bir obje olusur.
		x.concat("Rules!"); // string birlestirme,yeni bir obje olusur.(Java Rules)
		System.out.println("x= " + x); // Java Yazar!!

		String y = "Java"; // 1 object ,1 reference variable
		y = y.concat(" Rules !");
		System.out.println("y= " + y); //Java Rules yazar

		x.toUpperCase(); //heap te yeni bir obje olustu. (JAVA) ancak bu objeyi gosteren yok! 
		System.out.println("x= "+x);//Java
		
		x=x.toUpperCase();//heapte yeni bir obje olustu (JAVA) x bu objeyi gosteriyor.
		System.out.println("x= "+x);//JAVA
		
		x.replace('A', 'X');
		System.out.println(x); //Java
		
		x=x.replace('A', 'X');
		System.out.println(x);//JXVX
		
		String m="spring";
		String m2=m+"summer";
		m.concat("fall");
		m2.concat(m);
		m+="winter";
		System.out.println(m+" "+m2);
		
		
	}

}
