package _03Chapter._03assignmentOperators;

public class _15ConstructingMultidimensionarArrays {

	public static void main(String[] args) {
		int [][] myArray=new int[3][];
//		myArray object
//		- - null
		
		
		myArray[0] = new int[2];
		myArray[0][0] = 6;
		myArray[0][1] = 7;
		
//		myArray[0]
//		6,7		
	
		
		myArray[1] = new int[3];
		myArray[1][0] = 9;
		myArray[1][1] = 8;
		myArray[1][2] = 5;
		
//		myArray[1]
//		9,8,5		
		
//		myArray[2]
//		null
		
		int [] x=new int[5];
		
		x[4] = 2; // OK, the last element is at index 4
//		x[5] = 3; // runtime exception.java.lang.ArrayIndexOutOfBoundsException 
//		java.lang.ArrayIndexOutOfBoundsException: size ile ilgili bir sikinti oldugunda firlatir.
	}
}
