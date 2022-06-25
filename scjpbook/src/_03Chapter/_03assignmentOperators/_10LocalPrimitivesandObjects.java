package _03Chapter._03assignmentOperators;

public class _10LocalPrimitivesandObjects {
	public static void main(String[] args) {
		int year=2050;
		System.out.println("The year is " + year);
		
		int year2;
//		System.out.println("The year is"+ year2); compile error
//		local degiskenlere otomatik olarak deger atanmaz!
		
		int year3;
		year3=2022;
		System.out.println("The year is "+ year3);
	}

}
