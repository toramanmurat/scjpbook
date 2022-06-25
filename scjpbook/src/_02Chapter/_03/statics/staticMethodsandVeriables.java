package _02Chapter._03.statics;

public class staticMethodsandVeriables {
	
	int size=0;

	public int getSize() {
		return size;
	}
	
	public staticMethodsandVeriables(int s) {
		size=s;
	}
	
	public static void main(String[] args) {
		staticMethodsandVeriables sm=new staticMethodsandVeriables(25);
		System.out.println(sm.getSize());
	}
	

}
