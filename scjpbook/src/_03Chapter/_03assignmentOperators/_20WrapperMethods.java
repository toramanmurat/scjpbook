package _03Chapter._03assignmentOperators;

public class _20WrapperMethods {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("10");
		Integer i3 = Integer.valueOf("101011",2);
		
		Float f1 = Float.valueOf(3.14f);
		Float f2 = Float.valueOf("3.14f");
		System.out.println(i1+" "+i2+" "+i3+" "+f2);
		
//		int'ten Integer yada String'ten Integer donusum valueOf() metodu ile yapilir.
//		static factory method olarak gecer.
		
		byte b=i2.byteValue();
		short s=i2.shortValue();
		double d=i2.doubleValue();
		
//		xxxValue() primitive donusturur.
		
		
		double d4 = Double.parseDouble("3.14"); // convert a String to a primitive
		System.out.println("d4 = " + d4); // result is d4 = 3.14
		Double d5 = Double.valueOf("3.14"); // create a Double obj
		System.out.println(d5 instanceof Double); // result is "true"
		
//		parsexxx() String ifadeyi ilgili primitive tipe donusturur.
		
		
		Double d6=new Double("3.14");
		String doubled6=d6.toString();
		System.out.println("d"+ d6.toString());
//		toString() metod
		
		
		String s3 = Integer.toHexString(254); // convert 254 to hex
		System.out.println("254 is " + s3); // result: "254 is fe"
		String s4 = Long.toOctalString(254); // convert 254 to octal
		System.out.print("254(oct) ="+ s4); // result: "254(oct) =376"
//		toXxxString() metod
		
		
//		************
//		primitive xxxValue --> Wrapper'dan primitive
//		parseXXX(String) --> String'ten primitive
//		valueOf(String) --> String'ten Wrapper
		
		
		
	}
}
