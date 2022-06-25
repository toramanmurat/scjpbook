package _03Chapter._03assignmentOperators;

public class _01PrimitiveAssignments {

	public static void main(String[] args) {
		int x=7; //literal assignment
		int y=x+2; //assignment wiht an expression
		int z=x*y; //assignment wiht an expression
		
		byte a=3;
		byte b=8;
//		byte c=a+b //error
		byte c=(byte) (a+b); //JAva veri kaybý olabilecegi icin direk assignment ettirmez. Casting yapmaliyiz.
	}
}
